// Generated from C:/Users/vacla/Documents/Github/PRK/TASK05/grammar\VBG.g4 by ANTLR 4.10.1
package prk.calculator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VBGParser}.
 */
public interface VBGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VBGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(VBGParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VBGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(VBGParser.ExprContext ctx);
}