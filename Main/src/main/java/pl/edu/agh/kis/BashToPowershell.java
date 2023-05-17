package pl.edu.agh.kis;

import pl.edu.agh.kis.parser.BashGrammarBaseListener;
import pl.edu.agh.kis.parser.BashGrammarParser;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BashToPowershell extends BashGrammarBaseListener {
    private StringBuilder outputString = new StringBuilder();
    public Stack<Boolean> isInFunctionStack = new Stack<>();

    BashToPowershell() {}

    public String getOutputString() {
        return outputString.toString();
    }

    @Override
    public void enterProgram(BashGrammarParser.ProgramContext ctx) {
        //  This append is not needed for a windows power shell program
        //outputString.append(ctx.COMMENT().toString()); //COMMENT
        // !TODO: Instrucion*
        for (int childID = 1; childID < ctx.getChildCount() - 1; childID++) {   //  Instruction*
            enterInstruction((BashGrammarParser.InstructionContext) ctx.getChild(childID));
        }
    }

    @Override
    public void exitProgram(BashGrammarParser.ProgramContext ctx) {}

    @Override
    public void enterFunction(BashGrammarParser.FunctionContext ctx) {
        isInFunctionStack.push(true);
    }
    @Override
    public void exitFunction(BashGrammarParser.FunctionContext ctx) {
        isInFunctionStack.pop();
    }

    public boolean isInFunction() {
        return !isInFunctionStack.empty();
    }

    @Override
    public void enterInstruction(BashGrammarParser.InstructionContext ctx) {
        //iterujemy po produkcjach i porównujemy z nullem - jeśli nie jest nullem to to jest ta produkcja - nie znalazłem lepszego sposobu
        if (ctx.pipeline_list() != null) {
            enterPipeline_list(ctx.pipeline_list());
        } else if (ctx.for_loop() != null) {

        }
//        else if (ctx.assign()!=null){
//            enterAssign(ctx.assign());
//        }
        //i tak dalej....


    }

    @Override
    public void enterPipeline_list(BashGrammarParser.Pipeline_listContext ctx) {
        //!TODO: A lot more
        for (int childID = 0; childID < ctx.getChildCount(); ++childID) {
            enterPipeline(ctx.pipeline(childID));
        }
    }

    @Override
    public void enterPipeline(BashGrammarParser.PipelineContext ctx) {
        //(TIME MINUSP?)? (BOOL_NEGATION)? word (pipe_symbol word)* (SINGLE_SEMICOLON|NEW_LINE)
        //!TODO: argumenty do time

        if (ctx.TIME()!=null) {
            outputString.append( "Measure-Command { " );
        }


        enterWord((BashGrammarParser.WordContext) ctx.getChild(0));
        for (int childID=1; childID < ctx.word().size(); childID++)
        {
            outputString.append(ctx.pipe_symbol(childID-1).getText());
            enterWord(ctx.word(childID));
        }


        if (ctx.TIME()!=null) {
            outputString.append( "}" );
        }
        outputString.append( ctx.NEW_LINE() != null ? "\n" : ";" );
    }
    @Override
    public void enterWord(BashGrammarParser.WordContext ctx) /*done*/{
        enterCommand(ctx.command(0));
        for (int i = 1; i < ctx.getChildCount(); i++) {
            outputString.append(' ');
            enterCommand(ctx.command(i));
        }
    }

    @Override
    public void enterCommand(BashGrammarParser.CommandContext ctx) /*done*/{
        if (ctx.symbols() != null) {
            enterSymbols(ctx.symbols());
        } else if (ctx.argument() != null) {
            enterArgument(ctx.argument());
        } else if (ctx.variable_from_command() != null) {
            enterVariable_from_command(ctx.variable_from_command());
        } else if (ctx.STRING() != null) {
            if (isInFunction()) {
                Pattern pattern = Pattern.compile("$[0-9]");
                Matcher matcher = pattern.matcher(ctx.getText());
                if (matcher.find()) {
                    char c = matcher.group(1).charAt(1);
                    outputString.append(ctx.getText().replace(matcher.group(1), "$args[" + c + " - 1]"));
                } else {
                    outputString.append(Translator.translate(ctx.getText()));
                }
            } else {
                outputString.append(Translator.translate(ctx.getText()));
            }
        }
    }
    
    @Override
    public void enterSymbols(BashGrammarParser.SymbolsContext ctx) {
        outputString.append(Translator.translate(ctx.getText().stripTrailing()));
    }

    @Override
    public void enterArgument(BashGrammarParser.ArgumentContext ctx) {
        outputString.append(Translator.translate(ctx.getText().stripTrailing()));
    }

    @Override
    public void enterVariable_from_command(BashGrammarParser.Variable_from_commandContext ctx) {
        outputString.append(Translator.translate(ctx.getText().stripTrailing()));
    }

    @Override
    public void enterAssign(BashGrammarParser.AssignContext ctx){
//        :   var EQ (pipeline|(number_float splitter_end_command))
        enterVar(ctx.var());

        outputString.append(ctx.EQ().getText());
        if (ctx.pipeline()!=null)
        {
            enterPipeline(ctx.pipeline());
        }
        else {
            outputString.append(ctx.number_float().getText());
            outputString.append(ctx.splitter_end_command().getText());
        }

    }

    @Override
    public void enterVar(BashGrammarParser.VarContext ctx){
//: DOLLAR_SIGN? ALPHA alphanumeric+
        if (ctx.DOLLAR_SIGN()!=null){
            outputString.append("$");
        }
        outputString.append(ctx.ALPHA().getText());
        for (var alnum: ctx.alphanumeric()) {
            enterAlphanumeric(alnum);
        }
    }

    @Override
    public void enterAlphanumeric(BashGrammarParser.AlphanumericContext ctx) {
//        :   (ALPHA | NUMERIC)
        outputString.append(ctx.getText());
    }

    @Override
    public void enterWhile_loop(BashGrammarParser.While_loopContext ctx) {
//        :  WHILE_LOOP_BEGIN expr_maker splitter_end_command LOOP_MIDDLE instruction* LOOP_END splitter_end_command
//todo
    }
}
