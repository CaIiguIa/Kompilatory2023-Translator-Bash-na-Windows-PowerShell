// Generated from BashGrammar.g4 by ANTLR 4.12.0
package pl.edu.agh.kis.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BashGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BashGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BashGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(BashGrammarParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbols(BashGrammarParser.SymbolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(BashGrammarParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(BashGrammarParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(BashGrammarParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#pipe_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipe_symbol(BashGrammarParser.Pipe_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#pipeline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeline(BashGrammarParser.PipelineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#pipeline_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeline_list(BashGrammarParser.Pipeline_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(BashGrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(BashGrammarParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(BashGrammarParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#single_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_case(BashGrammarParser.Single_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#until_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_loop(BashGrammarParser.Until_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(BashGrammarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(BashGrammarParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(BashGrammarParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#for_loop_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_argument(BashGrammarParser.For_loop_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#numbers_pipeline_list_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbers_pipeline_list_for_loop(BashGrammarParser.Numbers_pipeline_list_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(BashGrammarParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#number_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_float(BashGrammarParser.Number_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#variable_from_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_from_command(BashGrammarParser.Variable_from_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#splitter_end_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplitter_end_command(BashGrammarParser.Splitter_end_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BashGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#expr_maker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_maker(BashGrammarParser.Expr_makerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#d_round_expr_maker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_round_expr_maker(BashGrammarParser.D_round_expr_makerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#d_round_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_round_expr(BashGrammarParser.D_round_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#variable_or_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_or_number(BashGrammarParser.Variable_or_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BashGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(BashGrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(BashGrammarParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#coprocess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoprocess(BashGrammarParser.CoprocessContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#alphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphanumeric(BashGrammarParser.AlphanumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link BashGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(BashGrammarParser.IdContext ctx);
}