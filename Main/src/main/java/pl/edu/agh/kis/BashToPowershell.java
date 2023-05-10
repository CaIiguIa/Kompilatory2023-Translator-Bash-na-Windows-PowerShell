package pl.edu.agh.kis;

import org.antlr.v4.runtime.tree.ParseTree;
import pl.edu.agh.kis.parser.BashGrammarBaseListener;
import pl.edu.agh.kis.parser.BashGrammarParser;

public class BashToPowershell extends BashGrammarBaseListener {
    private StringBuilder outputString = new StringBuilder();

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
        //!TODO: argumenty do time,przenieść measure-command do csv

        if (ctx.TIME()!=null){
            outputString.append( "Measure-Command { " );
        }


        enterWord((BashGrammarParser.WordContext) ctx.getChild(0));
        for (int childID=1; childID<ctx.word().size(); childID++)
        {
            outputString.append(ctx.pipe_symbol(childID-1).getText());
            outputString.append(' ');
            enterWord(ctx.word(childID));
        }


        if (ctx.TIME()!=null){
            outputString.append( "}" );
        }
        outputString.append( ctx.NEW_LINE() != null ? "\n" : "; " );
    }
    @Override
    public void enterWord(BashGrammarParser.WordContext ctx) /*done*/{
        for (int i = 0; i < ctx.getChildCount(); i++) {
            enterCommand(ctx.command(i));
            outputString.append(' ');
        }

    }

    @Override
    public void enterCommand(BashGrammarParser.CommandContext ctx) /*done*/{
        if (ctx.symbols() != null) {
            enterSymbols(ctx.symbols());
        } else if (ctx.argument() != null) {
            enterArgument(ctx.argument());
        } else if (ctx.string() != null) {
            enterString(ctx.string());
        } else if (ctx.character_chain() != null) {
            enterCharacter_chain(ctx.character_chain());
        } else if (ctx.variable_from_command() != null) {
            enterVariable_from_command(ctx.variable_from_command());
        }
    }
    
    @Override
    public void enterSymbols(BashGrammarParser.SymbolsContext ctx) {
        outputString.append(Translator.translate(ctx.getText()));
    }

    @Override
    public void enterString(BashGrammarParser.StringContext ctx) {
        outputString.append(Translator.translate(ctx.getText()));
    }

    @Override
    public void enterArgument(BashGrammarParser.ArgumentContext ctx) {
        outputString.append(Translator.translate(ctx.getText()));
    }

    @Override
    public void enterCharacter_chain(BashGrammarParser.Character_chainContext ctx) {
        outputString.append(Translator.translate(ctx.getText()));
    }

    @Override
    public void enterVariable_from_command(BashGrammarParser.Variable_from_commandContext ctx) {
        outputString.append(Translator.translate(ctx.getText()));
    }

//    @Override
//    public void enterAssign(BashGrammarParser.AssignContext ctx){
//        if (ctx.VARIABLE()!=null){
//            outputString.append(ctx.VARIABLE().getText());
//        }
//        else outputString.append(ctx.NEW_VARIABLE().getText());
//
//        outputString.append("= ");
//        if (ctx.pipeline()!=null)
//        {
//            enterPipeline(ctx.pipeline());
//        }
//        else outputString.append(ctx.number_float().getText());
//
//    }
}
