package pl.edu.agh.kis;

import pl.edu.agh.kis.log.Logger;
import pl.edu.agh.kis.parser.BashGrammarBaseListener;
import pl.edu.agh.kis.parser.BashGrammarParser;
import pl.edu.agh.kis.settings.ProgramConfig;
import pl.edu.agh.kis.translations.Translator;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TODO: function_out.ps1 nie tłumaczy $1 na $args[0] dlatego że isInFunction zwraza false zawsze, mimo,że wchodzimy do funkcji, potem siętym zajmę

public class BashToPowershell extends BashGrammarBaseListener {
    private static final Translator translator = Translator.getInstance();
    private final StringBuilder outputString;
    public final int defaultFunctionDepth = 0;
    public int functionDepth;
    private boolean addNL=true;

    private Stack<String> indent = new Stack<>();

    BashToPowershell() {
        this.outputString = new StringBuilder();
        this.functionDepth = this.defaultFunctionDepth;
    }

    public String getOutputString() {
        return outputString.toString();
    }

    @Override
    public void enterProgram(BashGrammarParser.ProgramContext ctx) {
        //  This append below is not needed for a Windows powershell program
        //outputString.append(ctx.COMMENT().toString()); //COMMENT

        for (var instruct : ctx.instruction()) {   //  Instruction*
            enterInstruction(instruct);
        }
    }

    public boolean isInFunction() {
        return functionDepth > this.defaultFunctionDepth;
    }

    @Override
    public void enterInstruction(BashGrammarParser.InstructionContext ctx) {
//                :	COMMENT
        if (!ProgramConfig.getInstance().skipComments() && ctx.COMMENT() != null) {
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
//                |	pipeline_list
//        else if (ctx.pipeline() != null) {
//            enterPipeline(ctx.pipeline());
//        }
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
        final int commandPosition = 0;
        final int shiftFromCommandToArguments = 1;
        //(TIME MINUSP?)? (BOOL_NEGATION)? word (pipe_symbol word)* (SINGLE_SEMICOLON|NEW_LINE)
        //!TODO: argumenty do time

        if (ctx.TIME() != null) {
            outputString.append("Measure-Command { ");
        }


        enterWord(ctx.word(commandPosition));
        for (int childID = commandPosition + shiftFromCommandToArguments; childID < ctx.word().size(); childID++) {
            outputString.append(ctx.pipe_symbol(childID - shiftFromCommandToArguments).getText());
            enterWord(ctx.word(childID));
        }


        if (ctx.TIME() != null) {
            outputString.append("}");
        }
        if (ctx.splitter_end_command() != null && addNL) outputString.append("\n");
        addNL=true;
    }

    @Override
    public void enterWord(BashGrammarParser.WordContext ctx) {
        String command = ctx.command(0).getText();
        for (int i = 0; i < command.length(); ++i) {
            if (command.charAt(i) == ' ') {
                outputString.append(" ");
            }
        }
        outputString.append(translator.translate(command.replaceAll(" ", "")));

        for (int i = 1; i < ctx.getChildCount(); i++)
            enterCommand(command, ctx.command(i));

    }


    public void enterCommand(String commandStart, BashGrammarParser.CommandContext ctx) {
        final int groupNumber = 1;
        final int charNumberLocation = 1;
        if (ctx.symbols() != null) {
            enterSymbols(ctx.symbols());
        } else if (ctx.argument() != null) {
            enterArgument(commandStart, ctx.argument());
        } else if (ctx.variable_from_command() != null) {
            enterVariable_from_command(ctx.variable_from_command());
        } else if (ctx.VARIABLE() != null) {
            outputString.append(ctx.VARIABLE().getText());
        } else { //either string or char_chain
            if (isInFunction()) {
                Pattern pattern = Pattern.compile("$[0-9]");
                Matcher matcher = pattern.matcher(ctx.getText());
                if (matcher.find()) {
                    char c = matcher.group(groupNumber).charAt(charNumberLocation);
                    System.out.println(ctx.getText().replace(matcher.group(groupNumber), "$args[" + c + " - 1]"));
                    outputString.append(ctx.getText().replace(matcher.group(groupNumber), "$args[" + c + " - 1]"));
                } else {
                    outputString.append(translator.translate(ctx.getText()));
                }
            } else {
                outputString.append(translator.translate(ctx.getText()));
            }
        }
    }

    @Override
    public void enterSymbols(BashGrammarParser.SymbolsContext ctx) {
        //dla kazdego po splicie tlumacz
//        boolean spaceFlag = false;
//        for (var str : ctx.getText().stripTrailing().split(" ")) {
//            if (spaceFlag) outputString.append(" "); //add space only after first word
//            spaceFlag = true;
//            outputString.append(translator.translate(str).replaceAll(" ", ""));//remove redundant spaces
//        }

//        for (var str : ctx.getText().stripTrailing().split(" ")) {
//
//        }
        outputString.append(ctx.getText());
    }

    public void enterArgument(String commandStart, BashGrammarParser.ArgumentContext ctx) {
        //  TODO: nie mam pojęcia czemu tu jest 0 jakbyś dodał stałą.

        List<String> args = new ArrayList<>(List.of(ctx.getText().split(" ")));

//        args.remove(0);

        outputString.append(translator.translateCommand(commandStart, args));

//        enterSymbols(ctx.symbols());
    }

    @Override
    public void enterVariable_from_command(BashGrammarParser.Variable_from_commandContext ctx) {
        outputString.append("$(");

        enterPipeline_list(ctx.pipeline_list());

        outputString.append(")");
    }

    @Override
    public void enterAssign(BashGrammarParser.AssignContext ctx) {
//        :   var EQ (pipeline|(number_float splitter_end_command))
        enterVar(ctx.var());

        outputString.append(ctx.EQ().getText());
        if (ctx.pipeline() != null) {
            outputString.append("$(");
            addNL=false;
            enterPipeline(ctx.pipeline());
            outputString.append(")\n");
        } else {
            enterNumber_float(ctx.number_float());
            enterSplitter_end_command(ctx.splitter_end_command());
        }

    }

    @Override
    public void enterNumber_float(BashGrammarParser.Number_floatContext ctx) {
        outputString.append(ctx.getText());
    }

    @Override
    public void enterVar(BashGrammarParser.VarContext ctx) {
//: DOLLAR_SIGN? ALPHA alphanumeric+
        outputString.append("$"); //* ogólnie raczej lepiej jest zawsze oznajmiać że zmienna
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
        indent.add(ctx.WHILE_LOOP_BEGIN().getText().replace("while", ""));
        outputString.append(ctx.WHILE_LOOP_BEGIN().getText());

        enterExpr_maker(ctx.expr_maker());

        //  TODO: nie mam pojęcia czemu tu jest 0 jakbyś dodał stałą.
        if (ctx.splitter_end_command(0).getText().equals(";")){
            outputString.append(" {");
        }
        else {
            outputString.append("\n").append(indent.peek()).append("{");
        }

        for (var intruct : ctx.instruction()) {
            enterInstruction(intruct);
        }

        outputString.append(indent.pop()).append("}");
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

            if (ctx.CONDITION_DOUBLE_AMPERSAND() != null) outputString.append(" -and ");
            else if (ctx.CONDITION_DOUBLE_PIPE() != null) outputString.append(" -or ");
            else if (ctx.PIPE() != null) outputString.append(" -bor ");
            else if (ctx.AMPERSAN() != null) outputString.append(" -band ");

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
            if (ctx.CONDITION_DOUBLE_AMPERSAND() != null) outputString.append(" -and ");
            else if (ctx.CONDITION_DOUBLE_PIPE() != null) outputString.append(" -or ");
            else if (ctx.PIPE() != null) outputString.append("-bor");
            else if (ctx.AMPERSAN() != null) outputString.append("-band");
            enterD_round_expr_maker(ctx.d_round_expr_maker());
        }
    }

    @Override
    public void enterD_round_expr(BashGrammarParser.D_round_exprContext ctx) {

        //     https://learn.microsoft.com/en-us/powershell/module/microsoft.powershell.core/about/about_arithmetic_operators?view=powershell-7.3
        //    | BOOL
        if (ctx.variable_from_command() != null) {
            outputString.append("Test-Path -Path C:\\temp\\important_file.txt -PathType Leaf");
            enterVariable_from_command(ctx.variable_from_command());
        } else if (ctx.STRING().size() == 1) {
            outputString.append("Test-Path -Path ");
            outputString.append(ctx.STRING(0).getText());
            outputString.append(" -PathType Leaf");
        } else if (ctx.VARIABLE() != null) {
            outputString.append("Test-Path -Path ");
            outputString.append(ctx.VARIABLE().getText());
            outputString.append(" -PathType Leaf");
        }


        else if (ctx.BOOL() != null) outputString.append(ctx.BOOL().getText());
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
            else if (ctx.getChild(2) instanceof BashGrammarParser.Variable_or_numberContext) {
                if (ctx.PLUS().size() > 0) outputString.append("++");
                else outputString.append("--");
                enterVariable_or_number(ctx.variable_or_number());
            }
        } else {
            //    | expr (<<comparator>>)  expr
            enterExpr(ctx.expr(0));

            if (ctx.POINTER_LEFT().size() > 0 && ctx.EQ().size() > 0) outputString.append(" -le "); //:     <=
            else if (ctx.POINTER_RIGHT().size() > 0 && ctx.EQ().size() > 0) outputString.append(" -ge "); //:    >=
            else if (ctx.BOOL_NEGATION() != null && ctx.EQ().size() > 0) outputString.append(" -ne "); //:       !=
            else if (ctx.POINTER_LEFT().size() == 1) outputString.append("-lt"); //:                           <
            else if (ctx.POINTER_RIGHT().size() == 1) outputString.append("-gt"); //:                          >
            else if (ctx.POINTER_LEFT().size() == 2) outputString.append("-shl"); //:                          <<
            else if (ctx.POINTER_RIGHT().size() == 2) outputString.append("-shr"); //:                         >>
            else if (ctx.CONDITION_LE() != null) outputString.append(" -le "); //:                             -le
            else if (ctx.CONDITION_EQ() != null) outputString.append(" -eq "); //:                             -eq
            else if (ctx.CONDITION_GE() != null) outputString.append(" -ge "); //:                             -ge
            else if (ctx.CONDITION_LT() != null) outputString.append(" -lt "); //:                             -lt
            else if (ctx.CONDITION_GT() != null) outputString.append(" -gt "); //:                             -gt
            else if (ctx.CONDITION_NEQ() != null) outputString.append(" -neq "); //:                           -neq
            else if (ctx.EQ().size() >0)  outputString.append(" -eq "); //:                  == albo =

            enterExpr(ctx.expr(1));
        }

    }

    @Override
    public void enterExpr(BashGrammarParser.ExprContext ctx) {
        // TODO
        //    | variable_or_number
        if (ctx.STRING() != null) {
            outputString.append(ctx.STRING().getText());
        } else if (ctx.variable_or_number() != null) {
            enterVariable_or_number(ctx.variable_or_number());
        }
        //    | L_PARENTH_ROUND expr R_PARENTH_ROUND
        else if (ctx.expr().size() == 1) {
            outputString.append("(");
            enterExpr(ctx.expr(0));
            outputString.append(")");
        }
        //  : expr (PLUS | MINUS | WILDCARD_OR_MULTIPLY | DIVIDE | MODULO | WILDCARD_OR_MULTIPLY WILDCARD_OR_MULTIPLY ) expr
        else if (ctx.expr().size() == 2) {
            enterExpr(ctx.expr(0));

            if (ctx.PLUS() != null) outputString.append("+"); //:                           PLUS
            else if (ctx.MINUS() != null) outputString.append("-"); //:                     Minus
            else if (ctx.WILDCARD_OR_MULTIPLY().size() == 1) outputString.append("*"); //:  WILDCARD_OR_MULTIPLY
            else if (ctx.DIVIDE() != null) outputString.append("/"); //:                    DIVIDE
            else if (ctx.MODULO() != null) outputString.append("%"); //:                    MODULO
            else if (ctx.WILDCARD_OR_MULTIPLY().size() == 2) outputString.append("**");//:  WILDCARD_OR_MULTIPLY WILDCARD_OR_MULTIPLY

            enterExpr(ctx.expr(1));
        }

    }

    @Override
    public void enterVariable_or_number(BashGrammarParser.Variable_or_numberContext ctx) {
        //    : VARIABLE
        if (ctx.VARIABLE() != null) outputString.append(ctx.VARIABLE().getText());
            //    | id
        else if (ctx.id() != null) enterId(ctx.id());
            //    | signed_number
        else if (ctx.signed_number() != null) enterSigned_number(ctx.signed_number());
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

    @Override
    public void enterPipe_symbol(BashGrammarParser.Pipe_symbolContext ctx) {
        outputString.append("|");
        if (ctx.AMPERSAN() != null) outputString.append("&");
    }

    @Override
    public void enterCase_break(BashGrammarParser.Case_breakContext ctx) {
        outputString.append(indent.pop()).append("}");

    }

    @Override
    public void enterSingle_case(BashGrammarParser.Single_caseContext ctx) {
        //przepisz wszystko aż do ")", jak dodamy variable_from_command jako możliwe wartości zmiennej, to trzeba będzie rozbić single_case na podprodukcje bo
        // się nie będzie dało łatwo przełumaczyć
        indent.add(ctx.children.get(0).getText().replaceAll("[^ \t]", ""));
        for (var child : ctx.children) {
            if (Objects.equals(child.getText(), ctx.R_PARENTH_ROUND().getText())) break;
            outputString.append(child.getText());
        }
        outputString.append("{\n");
        for (var instr : ctx.instruction())
            enterInstruction(instr);
        enterCase_break(ctx.case_break());
        enterSplitter_end_command(ctx.splitter_end_command());
    }

    @Override
    public void enterCase_statement(BashGrammarParser.Case_statementContext ctx) {
        indent.add(ctx.CASE_START().getText().replaceAll("case", ""));
        outputString.append(indent.peek()); //indent
        outputString.append("switch (");

        if (ctx.VARIABLE()!=null) outputString.append(ctx.VARIABLE().getText());
        else if (ctx.STRING()!=null) outputString.append(ctx.STRING().getText());
        else if (ctx.variable_from_command()!=null) enterVariable_from_command(ctx.variable_from_command());

        outputString.append(")");

        if (ctx.LOOP_IN()!=null) outputString.append("{");
        enterSplitter_end_command(ctx.splitter_end_command(0));

        for (var scase:ctx.single_case()) enterSingle_case(scase);

        if (ctx.CASE_DEFAULT()!=null){
            indent.add(ctx.CASE_DEFAULT().getText().replace("*)", ""));
            outputString.append(indent.peek()).append("default {");
            for (var instr:ctx.instruction()) enterInstruction(instr);
            outputString.append(indent.pop()).append("}");
        }

        enterSplitter_end_command(ctx.splitter_end_command(0));
        outputString.append(indent.pop()).append("}");
        enterSplitter_end_command(ctx.splitter_end_command(0));
    }

    @Override
    public void enterIf_statement(BashGrammarParser.If_statementContext ctx) {

        indent.add(ctx.IF_START().getText().replaceAll("if", ""));
        outputString.append(ctx.IF_START().getText());
        outputString.append("(");
        enterExpr_maker(ctx.expr_maker());
        outputString.append(")");
        outputString.append("\n");
        outputString.append(indent.peek()).append("{");

        for(var instr:ctx.instruction()) enterInstruction(instr);

        outputString.append(indent.peek()).append("}\n");

        if (ctx.if_elsif().size()>0){
            for (var elsif:ctx.if_elsif()) enterIf_elsif(elsif);
        }
        if (ctx.if_else()!=null) enterIf_else(ctx.if_else());
        indent.pop();
    }

    @Override
    public void enterIf_elsif(BashGrammarParser.If_elsifContext ctx) {
        outputString.append(indent.peek()).append("elsif {");
        outputString.append("(");
        enterExpr_maker(ctx.expr_maker());
        outputString.append(")");
        enterSplitter_end_command(ctx.splitter_end_command());
        for(var instr:ctx.instruction()) enterInstruction(instr);
        outputString.append(indent.peek()).append("}\n");
    }

    @Override
    public void enterIf_else(BashGrammarParser.If_elseContext ctx) {
        outputString.append(indent.peek()).append("else {");
        for(var instr:ctx.instruction()) enterInstruction(instr);
        outputString.append(indent.peek()).append("}\n");
    }

    @Override
    public void enterFor_loop(BashGrammarParser.For_loopContext ctx) {
        indent.add(ctx.FOR_LOOP_BEGIN().getText().replaceAll("for", ""));
        if (ctx.for_loop_argument().LOOP_IN()==null) outputString.append(indent).append(ctx.FOR_LOOP_BEGIN().getText());
        else outputString.append(indent.peek()).append("foreach ");
        enterFor_loop_argument(ctx.for_loop_argument());
        outputString.append(" {");
        enterSplitter_end_command(ctx.splitter_end_command(0));

        for (var instr: ctx.instruction()) enterInstruction(instr);

        enterSplitter_end_command(ctx.splitter_end_command(0));
        outputString.append(indent.pop()).append("}");
        enterSplitter_end_command(ctx.splitter_end_command(0));
    }

    @Override
    public void enterFor_loop_argument(BashGrammarParser.For_loop_argumentContext ctx) {
        outputString.append("(");

        if (ctx.L_PARENTH_ROUND().size()>0) {
            enterExpr(ctx.expr(0));
            outputString.append(";");
            enterExpr_maker(ctx.expr_maker());
            outputString.append(";");
            if (ctx.expr().size()>1) enterExpr(ctx.expr(1));
            else if (ctx.assign()!=null) enterAssign(ctx.assign());
            else if (ctx.d_round_expr()!=null) enterD_round_expr(ctx.d_round_expr());
        } else if (ctx.LOOP_IN()!=null){
            outputString.append("$");
            for (var al:ctx.alphanumeric()) outputString.append(al.getText().replaceAll(" ", ""));
            outputString.append(ctx.LOOP_IN().getText());
            outputString.append(" ");
            if (ctx.numbers_pipeline_list_for_loop()!=null) enterNumbers_pipeline_list_for_loop(ctx.numbers_pipeline_list_for_loop());
            else enterVariable_from_command(ctx.variable_from_command());
        }
        outputString.append(")");

        // TODO: reszty produkcji chyba nie ma w powershellu, trzeba na około
        // TODO: dać ostrzeżenie czy coś
        // Dodane :D jak się logera używa
        // Logger.getInstance().addLog("");
    }

    @Override
    public void enterBlock(BashGrammarParser.BlockContext ctx) {
        if (ctx.L_PARENTH_ROUND()!=null){
            outputString.append("(");

            for (var instr: ctx.instruction()) enterInstruction(instr);

            outputString.append(")");
        }
        else {
            outputString.append("{\n");

            for (var instr: ctx.instruction()) enterInstruction(instr);

            outputString.append("}");
        }
    }

    @Override
    public void enterFunction(BashGrammarParser.FunctionContext ctx) {
        functionDepth++;
        outputString.append("function ");

        for (var al : ctx.alphanumeric()) outputString.append(al.getText());

        enterBlock(ctx.block());
        functionDepth--;
    }

    @Override
    public void enterUntil_loop(BashGrammarParser.Until_loopContext ctx) {
        //zakładam że dosłownie while z odwrotnym warunkiem
        indent.add(ctx.UNTIL_LOOP_BEGIN().getText().replace("until", " "));
        outputString.append(indent.peek()).append("while");
//        this.invertWhile=true;
        outputString.append(" -not");
        enterExpr_maker(ctx.expr_maker());

        outputString.append(ctx.splitter_end_command(0).getText().equals(";") ? " " : "\n");
        outputString.append("{");

        for (var intruct : ctx.instruction()) {
            enterInstruction(intruct);
        }

        outputString.append(indent.pop()).append("}");
        enterSplitter_end_command(ctx.splitter_end_command(1));
    }

    @Override
    public void enterCoprocess(BashGrammarParser.CoprocessContext ctx) {
        //bash        COPROCESS_START (alphanumeric)* word //redirections
        //powershell  $(alphanumeric)* = Start-Job –ScriptBlock {
                                            //  word
                                            //}
        if (ctx.alphanumeric().size() > 0) {
            outputString.append("$");
            for (var al:ctx.alphanumeric()) outputString.append(al.getText());
            outputString.append("=");
        }
        outputString.append("Start-Job –ScriptBlock {");
        enterWord(ctx.word());
        outputString.append("}");
    }

    @Override
    public void enterSelect(BashGrammarParser.SelectContext ctx) {
        // to nie ma prawa działać
        // SELECT alphanumeric+ (LOOP_IN word)? splitter_end_command LOOP_MIDDLE pipeline_list LOOP_END
        indent.add(ctx.SELECT().getText().replace("select", ""));
        outputString.append(indent.peek()).append("foreach ($");
        for (var al:ctx.alphanumeric()) outputString.append(al.getText().replaceAll(" ", ""));

        outputString.append(" in ");
        if (ctx.LOOP_IN() != null) {
            enterWord(ctx.word());
        }
        else {
            outputString.append("$");
            for (var al:ctx.alphanumeric()) outputString.append(al.getText());
        }
        outputString.append(") {");
        for (var intruct : ctx.instruction()) {
            enterInstruction(intruct);
        }
        outputString.append(indent.pop()).append("}");
    }

    @Override
    public void enterNumbers_pipeline_list_for_loop(BashGrammarParser.Numbers_pipeline_list_for_loopContext ctx) {
        final int firstArgumentPosition = 0;
        final int secondArgumentPosition = 0;
        final String joinBetweenArguments = "..";
//        numbers_pipeline_list_for_loop // {1..5} ALBO 1 2 3 4 5 ALBO 1 2 3 4 5 .. N ALBO {0..10..2}
//        : '{' signed_number '..' signed_number '}'
        enterSigned_number(ctx.signed_number(firstArgumentPosition));
        outputString.append(joinBetweenArguments);
        enterSigned_number(ctx.signed_number(secondArgumentPosition));
    }
}
