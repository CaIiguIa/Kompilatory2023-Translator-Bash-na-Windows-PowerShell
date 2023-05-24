package pl.edu.agh.kis;

import pl.edu.agh.kis.parser.BashGrammarBaseListener;
import pl.edu.agh.kis.parser.BashGrammarParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BashToPowershell extends BashGrammarBaseListener {
    public boolean skipComments;
    public int functionDepth;
    private StringBuilder outputString;

    BashToPowershell(boolean skipComments) {
        this.skipComments = skipComments;
        this.outputString = new StringBuilder();
        this.functionDepth = 0;
    }

    public String getOutputString() {
        return outputString.toString();
    }

    @Override
    public void enterProgram(BashGrammarParser.ProgramContext ctx) {
        //  This append below is not needed for a windows power shell program
        //outputString.append(ctx.COMMENT().toString()); //COMMENT

        for (var instruct : ctx.instruction()) {   //  Instruction*
            enterInstruction(instruct);
        }
    }

    @Override
    public void enterFunction(BashGrammarParser.FunctionContext ctx) {
        functionDepth++;
    }

    @Override
    public void exitFunction(BashGrammarParser.FunctionContext ctx) {
        functionDepth--;
    }

    public boolean isInFunction() {
        return functionDepth != 0;
    }

    @Override
    public void enterInstruction(BashGrammarParser.InstructionContext ctx) {
//                :	COMMENT
        if (!skipComments && ctx.COMMENT() != null) {
            outputString.append(ctx.COMMENT().getText());
        }
//                |   function
        else if (ctx.function() != null) {
            enterFunction(ctx.function());
        }
//                |   if_statement
        else if (ctx.if_statement() != null) {
            enterIf_statement(ctx.if_statement());
        }
//                |   for_loop
        else if (ctx.for_loop() != null) {
            enterFor_loop(ctx.for_loop());
        }
//                |   while_loop
        else if (ctx.while_loop() != null) {
            enterWhile_loop(ctx.while_loop());
        }
//                |   until_loop
        else if (ctx.until_loop() != null) {
            enterUntil_loop(ctx.until_loop());
        }
//                |   case_statement
        else if (ctx.case_statement() != null) {
            enterCase_statement(ctx.case_statement());
        }
//                |   select
        else if (ctx.select() != null) {
            enterSelect(ctx.select());
        }
//                |   coprocess
        else if (ctx.coprocess() != null) {
            enterCoprocess(ctx.coprocess());
        }
//                |	pipeline_list
        else if (ctx.pipeline_list() != null) {
            enterPipeline_list(ctx.pipeline_list());
        }
//                |   assign
        else if (ctx.assign() != null) {
            enterAssign(ctx.assign());
        }
//                |	splitter_end_command
        else if (ctx.splitter_end_command() != null) {
            enterSplitter_end_command(ctx.splitter_end_command());
        }
    }

    @Override
    public void enterPipeline_list(BashGrammarParser.Pipeline_listContext ctx) {
        for (var pipe : ctx.pipeline()) {
            enterPipeline(pipe);
        }
    }

    @Override
    public void enterPipeline(BashGrammarParser.PipelineContext ctx) {
        //(TIME MINUSP?)? (BOOL_NEGATION)? word (pipe_symbol word)* (SINGLE_SEMICOLON|NEW_LINE)
        //!TODO: argumenty do time

        if (ctx.TIME() != null) {
            outputString.append("Measure-Command { ");
        }


        enterWord((BashGrammarParser.WordContext) ctx.getChild(0));
        for (int childID = 1; childID < ctx.word().size(); childID++) {
            outputString.append(ctx.pipe_symbol(childID - 1).getText());
            enterWord(ctx.word(childID));
        }


        if (ctx.TIME() != null) {
            outputString.append("}");
        }
        outputString.append(ctx.NEW_LINE() != null ? "\n" : ";");
    }

    @Override
    public void enterWord(BashGrammarParser.WordContext ctx) {
        enterCommand(ctx.command(0));
        for (int i = 1; i < ctx.getChildCount(); i++) {
            outputString.append(' ');
            enterCommand(ctx.command(i));
        }
    }

    @Override
    public void enterCommand(BashGrammarParser.CommandContext ctx) {
        if (ctx.symbols() != null) {
            enterSymbols(ctx.symbols());
        } else if (ctx.argument() != null) {
            enterArgument(ctx.argument());
        } else if (ctx.variable_from_command() != null) {
            enterVariable_from_command(ctx.variable_from_command());
        } else { //either string or char_chain
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
        //dla kazdego po splicie tlumacz
        boolean spaceFlag = false;
        for (var str : ctx.getText().stripTrailing().split(" ")) {
            if (spaceFlag) outputString.append(" "); //add space only after first word
            spaceFlag = true;
            outputString.append(Translator.translate(str).replaceAll(" ", ""));//remove redundant spaces

        }
    }

    @Override
    public void enterArgument(BashGrammarParser.ArgumentContext ctx) {
        outputString.append(Translator.translate(ctx.getText().replaceAll(" ", "")));
    }

    @Override
    public void enterVariable_from_command(BashGrammarParser.Variable_from_commandContext ctx) {
        outputString.append(Translator.translate(ctx.getText().replaceAll(" ", "")));
    }

    @Override
    public void enterAssign(BashGrammarParser.AssignContext ctx) {
//        :   var EQ (pipeline|(number_float splitter_end_command))
        enterVar(ctx.var());

        outputString.append(ctx.EQ().getText());
        if (ctx.pipeline() != null) {
            enterPipeline(ctx.pipeline());
        } else {
            outputString.append(ctx.number_float().getText());
            enterSplitter_end_command(ctx.splitter_end_command());
        }

    }

    @Override
    public void enterVar(BashGrammarParser.VarContext ctx) {
//: DOLLAR_SIGN? ALPHA alphanumeric+
        if (ctx.DOLLAR_SIGN() != null) {
            outputString.append("$");
        }
        outputString.append(ctx.ALPHA().getText());
        for (var alnum : ctx.alphanumeric()) {
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
        outputString.append(ctx.WHILE_LOOP_BEGIN().getText());

        enterExpr_maker(ctx.expr_maker());

        outputString.append(ctx.splitter_end_command(0).getText().equals(";") ? " " : "\n");
        outputString.append("{");

        for (var intruct : ctx.instruction()) {
            enterInstruction(intruct);
        }

        outputString.append("}");
        enterSplitter_end_command(ctx.splitter_end_command(1));
    }

    @Override
    public void enterExpr_maker(BashGrammarParser.Expr_makerContext ctx) {
        //* w powershellu nie ma rozróżnienia na nawiasy - są tylko (), nie ma też ==, <, > itd.
        //expr_maker
        //    : BOOL_NEGATION expr_maker   //logical negation
        if (ctx.BOOL_NEGATION() != null) {
            outputString.append("!(");
            enterExpr_maker(ctx.expr_maker(0));
            outputString.append(")");
        }
        //    | TILDA expr  //bitwise negation
        else if (ctx.TILDA() != null) {
            outputString.append("-bnot (");
            enterExpr_maker(ctx.expr_maker(0));
            outputString.append(")");
        }
        //    | expr_maker (CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE | PIPE | AMPERSAN) expr_maker
        else if (ctx.expr_maker().size() == 2) {
            enterExpr_maker(ctx.expr_maker(0));

            if (ctx.CONDITION_DOUBLE_AMPERSAND() != null) outputString.append(ctx.CONDITION_DOUBLE_AMPERSAND().getText());
            else if (ctx.CONDITION_DOUBLE_PIPE() != null) outputString.append(ctx.CONDITION_DOUBLE_PIPE().getText());
            else if (ctx.PIPE() != null) outputString.append(ctx.PIPE().getText());
            else if (ctx.AMPERSAN() != null) outputString.append(ctx.AMPERSAN().getText());

            enterExpr_maker(ctx.expr_maker(1));
        }
        //    | L_PARENTH_ROUND  d_round_expr_maker  R_PARENTH_ROUND
        //    | L_PARENTH_ROUND L_PARENTH_ROUND d_round_expr_maker R_PARENTH_ROUND R_PARENTH_ROUND
        //    | CONDITION_LEFT_SINGLE CONDITION_LEFT_SINGLE d_round_expr_maker CONDITION_RIGHT_SINGLE CONDITION_RIGHT_SINGLE
        //    | CONDITION_LEFT_SINGLE d_round_expr_maker CONDITION_RIGHT_SINGLE
        else {
            outputString.append("(");
            enterD_round_expr_maker(ctx.d_round_expr_maker());
            outputString.append(")");
        }
    }

    @Override
    public void enterD_round_expr_maker(BashGrammarParser.D_round_expr_makerContext ctx) {
//    | L_PARENTH_ROUND d_round_expr_maker R_PARENTH_ROUND
        if (ctx.d_round_expr() == null) {
            outputString.append("(");
            enterD_round_expr_maker(ctx.d_round_expr_maker());
            outputString.append(")");
        }
//    |d_round_expr

        else if (ctx.d_round_expr_maker() == null) enterD_round_expr(ctx.d_round_expr());

//    : d_round_expr (CONDITION_DOUBLE_AMPERSAND | CONDITION_DOUBLE_PIPE | PIPE | AMPERSAN) d_round_expr_maker
        else {
            enterD_round_expr(ctx.d_round_expr());
            if (ctx.CONDITION_DOUBLE_AMPERSAND() != null) outputString.append(ctx.CONDITION_DOUBLE_AMPERSAND().getText());
            else if (ctx.CONDITION_DOUBLE_PIPE() != null) outputString.append(ctx.CONDITION_DOUBLE_PIPE().getText());
            else if (ctx.PIPE() != null) outputString.append("-bor");
            else if (ctx.AMPERSAN() != null) outputString.append("-band");
            enterD_round_expr_maker(ctx.d_round_expr_maker());
        }
    }

    @Override
    public void enterD_round_expr(BashGrammarParser.D_round_exprContext ctx) {

        //     https://learn.microsoft.com/en-us/powershell/module/microsoft.powershell.core/about/about_arithmetic_operators?view=powershell-7.3
        //    | BOOL
        if (ctx.BOOL() != null) outputString.append(ctx.BOOL().getText());
            //    | STRING EQ EQ? STRING
        else if (ctx.STRING().size() > 0) {
            outputString.append(ctx.STRING(0));
            outputString.append(" -eq ");
            outputString.append(ctx.STRING(0));
        } else if (ctx.variable_or_number() != null) {
            //    | variable_or_number ( PLUS PLUS | MINUS MINUS ) //id++ id-- -- teoretycznie dziala w bashu dla id, zmiennej i liczby
            if (ctx.getChild(0) instanceof BashGrammarParser.Variable_or_numberContext) {
                enterVariable_or_number(ctx.variable_or_number());
                if (ctx.PLUS().size() > 0) outputString.append("++");
                else outputString.append("--");
            }
            //    | ( PLUS PLUS | MINUS MINUS ) variable_or_number //++id --id
            else if (ctx.getChild(2) instanceof BashGrammarParser.Variable_or_numberContext){
                if (ctx.PLUS().size() > 0) outputString.append("++");
                else outputString.append("--");
                enterVariable_or_number(ctx.variable_or_number());
            }
        }
        else {
            //    | expr (<<comparator>>)  expr
            enterExpr(ctx.expr(0));

            if (ctx.POINTER_LEFT().size()>0 && ctx.EQ().size()>0) outputString.append(" -le "); //:     <=
            else if (ctx.POINTER_RIGHT().size()>0 && ctx.EQ().size()>0) outputString.append(" -ge "); //:    >=
            else if (ctx.BOOL_NEGATION()!=null && ctx.EQ().size()>0) outputString.append(" -ne "); //:       !=
            else if (ctx.POINTER_LEFT().size()==1) outputString.append("-lt"); //:                           <
            else if (ctx.POINTER_RIGHT().size()==1) outputString.append("-gt"); //:                          >
            else if (ctx.POINTER_LEFT().size()==2) outputString.append("-shl"); //:                          <<
            else if (ctx.POINTER_RIGHT().size()==2) outputString.append("-shr"); //:                         >>
            else if (ctx.CONDITION_LE()!=null) outputString.append(" -le "); //:                             -le
            else if (ctx.CONDITION_EQ()!=null) outputString.append(" -eq "); //:                             -eq
            else if (ctx.CONDITION_GE()!=null) outputString.append(" -ge "); //:                             -ge
            else if (ctx.CONDITION_LT()!=null) outputString.append(" -lt "); //:                             -lt
            else if (ctx.CONDITION_GT()!=null) outputString.append(" -gt "); //:                             -gt
            else if (ctx.CONDITION_NEQ()!=null) outputString.append(" -neq "); //:                           -neq
            else if (ctx.EQ().size()>0) for (var eq:ctx.EQ()) outputString.append("="); //:                  == albo =

            enterExpr(ctx.expr(1));
        }

    }

    @Override
    public void enterExpr(BashGrammarParser.ExprContext ctx) {
        // TODO
        //    | variable_or_number
        if (ctx.variable_or_number()!=null){
            enterVariable_or_number(ctx.variable_or_number());
        }
        //    | L_PARENTH_ROUND expr R_PARENTH_ROUND
        if (ctx.expr().size()==1)
        {
            outputString.append("(");
            enterExpr(ctx.expr(0));
            outputString.append(")");
        }
        //  : expr (PLUS | MINUS | WILDCARD_OR_MULTIPLY | DIVIDE | MODULO | WILDCARD_OR_MULTIPLY WILDCARD_OR_MULTIPLY ) expr
        else if (ctx.expr().size()==2){
            enterExpr(ctx.expr(0));

            if (ctx.PLUS()!=null) outputString.append("+"); //:                           PLUS
            else if (ctx.MINUS()!=null) outputString.append("-"); //:                     Minus
            else if (ctx.WILDCARD_OR_MULTIPLY().size()==1) outputString.append("*"); //:  WILDCARD_OR_MULTIPLY
            else if (ctx.DIVIDE()!=null) outputString.append("/"); //:                    DIVIDE
            else if (ctx.MODULO()!=null) outputString.append("%"); //:                    MODULO
            else if (ctx.WILDCARD_OR_MULTIPLY().size()==2) outputString.append("**");//:  WILDCARD_OR_MULTIPLY WILDCARD_OR_MULTIPLY

            enterExpr(ctx.expr(1));
        }

    }

    @Override
    public void enterVariable_or_number(BashGrammarParser.Variable_or_numberContext ctx) {
        //    : VARIABLE
        if (ctx.VARIABLE()!=null) outputString.append(ctx.VARIABLE().getText());
        //    | id
        else if (ctx.id()!=null) enterId(ctx.id());
        //    | signed_number
        else if (ctx.signed_number()!=null) enterSigned_number(ctx.signed_number());
    }

    @Override
    public void enterId(BashGrammarParser.IdContext ctx) {
        //    :	ALPHA alphanumeric*
        outputString.append(ctx.getText());
    }

    @Override
    public void enterSigned_number(BashGrammarParser.Signed_numberContext ctx) {
        outputString.append(ctx.getText());
    }

    @Override
    public void enterSplitter_end_command(BashGrammarParser.Splitter_end_commandContext ctx) {
        outputString.append(ctx.getText());
    }
}
