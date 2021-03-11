package behavioral.strategy;

/**
 * Abstract implementation for all validation strategies with some common logic.
 */
public abstract class Strategy {

	public abstract boolean isValid(Voter voter);

	/**
	 * Common eligibility criteria check logic that exists for all concrete
	 * strategies. For example all IDs must be within 10 characters, cannot start
	 * with 11 and end with 99.
	 */
	protected boolean isEligible(String id) {
		if (id.length() > 10)
			return false;
		else if (id.startsWith("11"))
			return false;
		else if (id.endsWith("99"))
			return false;

		return true;
	}

}
