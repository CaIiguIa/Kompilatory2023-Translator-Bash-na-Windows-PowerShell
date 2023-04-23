// Generated from BashGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BashGrammarParser}.
 */
public interface BashGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BashGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BashGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BashGrammarParser.ProgContext ctx);
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
}