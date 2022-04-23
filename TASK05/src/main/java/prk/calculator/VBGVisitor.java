// Generated from C:/Users/vacla/Documents/Github/PRK/TASK05/grammar\VBG.g4 by ANTLR 4.10.1
package prk.calculator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VBGParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VBGVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VBGParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(VBGParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link VBGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(VBGParser.ExprContext ctx);
}