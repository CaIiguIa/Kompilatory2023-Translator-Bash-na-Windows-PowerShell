// Generated from BashGrammar.g4 by ANTLR 4.12.0
package pl.edu.agh.kis.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BashGrammarParser}.
 */
public interface BashGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BashGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BashGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(BashGrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(BashGrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(BashGrammarParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(BashGrammarParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#single_case}.
	 * @param ctx the parse tree
	 */
	void enterSingle_case(BashGrammarParser.Single_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#single_case}.
	 * @param ctx the parse tree
	 */
	void exitSingle_case(BashGrammarParser.Single_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#until_loop}.
	 * @param ctx the parse tree
	 */
	void enterUntil_loop(BashGrammarParser.Until_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#until_loop}.
	 * @param ctx the parse tree
	 */
	void exitUntil_loop(BashGrammarParser.Until_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(BashGrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(BashGrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(BashGrammarParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(BashGrammarParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(BashGrammarParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(BashGrammarParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#for_loop_argument}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_argument(BashGrammarParser.For_loop_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#for_loop_argument}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_argument(BashGrammarParser.For_loop_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#numbers_pipeline_list_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterNumbers_pipeline_list_for_loop(BashGrammarParser.Numbers_pipeline_list_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#numbers_pipeline_list_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitNumbers_pipeline_list_for_loop(BashGrammarParser.Numbers_pipeline_list_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(BashGrammarParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(BashGrammarParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#number_float}.
	 * @param ctx the parse tree
	 */
	void enterNumber_float(BashGrammarParser.Number_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#number_float}.
	 * @param ctx the parse tree
	 */
	void exitNumber_float(BashGrammarParser.Number_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#variable_from_command}.
	 * @param ctx the parse tree
	 */
	void enterVariable_from_command(BashGrammarParser.Variable_from_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#variable_from_command}.
	 * @param ctx the parse tree
	 */
	void exitVariable_from_command(BashGrammarParser.Variable_from_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#splitter_end_command}.
	 * @param ctx the parse tree
	 */
	void enterSplitter_end_command(BashGrammarParser.Splitter_end_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#splitter_end_command}.
	 * @param ctx the parse tree
	 */
	void exitSplitter_end_command(BashGrammarParser.Splitter_end_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BashGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BashGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#expr_maker}.
	 * @param ctx the parse tree
	 */
	void enterExpr_maker(BashGrammarParser.Expr_makerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#expr_maker}.
	 * @param ctx the parse tree
	 */
	void exitExpr_maker(BashGrammarParser.Expr_makerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#d_round_expr_maker}.
	 * @param ctx the parse tree
	 */
	void enterD_round_expr_maker(BashGrammarParser.D_round_expr_makerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#d_round_expr_maker}.
	 * @param ctx the parse tree
	 */
	void exitD_round_expr_maker(BashGrammarParser.D_round_expr_makerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#d_round_expr}.
	 * @param ctx the parse tree
	 */
	void enterD_round_expr(BashGrammarParser.D_round_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#d_round_expr}.
	 * @param ctx the parse tree
	 */
	void exitD_round_expr(BashGrammarParser.D_round_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#variable_or_number}.
	 * @param ctx the parse tree
	 */
	void enterVariable_or_number(BashGrammarParser.Variable_or_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#variable_or_number}.
	 * @param ctx the parse tree
	 */
	void exitVariable_or_number(BashGrammarParser.Variable_or_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BashGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BashGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterSymbols(BashGrammarParser.SymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitSymbols(BashGrammarParser.SymbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(BashGrammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(BashGrammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(BashGrammarParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(BashGrammarParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#pipe_symbol}.
	 * @param ctx the parse tree
	 */
	void enterPipe_symbol(BashGrammarParser.Pipe_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#pipe_symbol}.
	 * @param ctx the parse tree
	 */
	void exitPipe_symbol(BashGrammarParser.Pipe_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void enterPipeline(BashGrammarParser.PipelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void exitPipeline(BashGrammarParser.PipelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#pipeline_list}.
	 * @param ctx the parse tree
	 */
	void enterPipeline_list(BashGrammarParser.Pipeline_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#pipeline_list}.
	 * @param ctx the parse tree
	 */
	void exitPipeline_list(BashGrammarParser.Pipeline_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(BashGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(BashGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(BashGrammarParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(BashGrammarParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#coprocess}.
	 * @param ctx the parse tree
	 */
	void enterCoprocess(BashGrammarParser.CoprocessContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#coprocess}.
	 * @param ctx the parse tree
	 */
	void exitCoprocess(BashGrammarParser.CoprocessContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(BashGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(BashGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(BashGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(BashGrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#character_chain}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_chain(BashGrammarParser.Character_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#character_chain}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_chain(BashGrammarParser.Character_chainContext ctx);
}