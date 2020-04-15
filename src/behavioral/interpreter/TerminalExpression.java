package behavioral.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

	String exp;

	public TerminalExpression(String exp) {
		this.exp = exp;
	}

	@Override
	public boolean interpret(String context) {
		StringTokenizer tokens = new StringTokenizer(context);
		while (tokens.hasMoreTokens()) {
			String token = tokens.nextToken();
			if (token.equals(exp)) {
				return true;
			}
		}
		return false;
	}

}
