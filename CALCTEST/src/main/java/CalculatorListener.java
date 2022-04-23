// Generated from C:/Users/vacla/Documents/Github/PRK/TASK05\Calculator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(CalculatorParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(CalculatorParser.OperationContext ctx);
}