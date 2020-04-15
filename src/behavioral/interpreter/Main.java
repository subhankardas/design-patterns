package behavioral.interpreter;

/**
 * INTERPRETER PATTERN
 * 
 * Pattern implements an expression and interprets weather a given context
 * follow the grammar of the expression. The expression interface is implemented
 * as terminal expressions i.e leaf nodes or non-terminal expressions that join
 * terminal expressions i.e node with child nodes. The final expression is hence
 * called Abstract Syntax Tree (AST). The context is then pass through this tree
 * to be evaluated.
 * 
 * PROS:
 * 
 * 1. Good for implementing grammar, validations or rules engine
 * 
 * CONS:
 * 
 * 1. Complex implementation
 * 
 * 2. Each rule is a class
 * 
 * 3. Caters a specific case only
 * 
 */
public class Main {

	public static void main(String[] args) {
		String context1 = "Tiger";
		String context2 = "Lion Tiger";
		String context3 = "Lion Bear";
		String context4 = "Lion Tiger Bear";

		// Create terminal expression i.e a minimal expression with some logic
		Expression expLion = new TerminalExpression("Lion");
		Expression expTiger = new TerminalExpression("Tiger");
		Expression expBear = new TerminalExpression("Bear");

		// Create abstract expression tree
		// Bind terminal expressions using non-terminal expression
		// Exp. = (Lion OR Tiger) AND Bear
		Expression expLionOrTiger = new OrExpression(expLion, expTiger);
		Expression expLionOrTigerAndBear = new AndExpression(expLionOrTiger, expBear);

		// Evaluate expression tree on various contexts i.e check weather context follow
		// the expression grammar
		System.out.println(context1 + "  ->  " + expLionOrTigerAndBear.interpret(context1));
		System.out.println(context2 + "  ->  " + expLionOrTigerAndBear.interpret(context2));
		System.out.println(context3 + "  ->  " + expLionOrTigerAndBear.interpret(context3));
		System.out.println(context4 + "  ->  " + expLionOrTigerAndBear.interpret(context4));
	}

}
