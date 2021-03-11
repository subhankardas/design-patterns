package behavioral.strategy;

/**
 * Concrete strategy implementation for civic voters.
 */
public class CivicVoterStrategy extends Strategy {

	@Override
	public boolean isValid(Voter voter) {
		String voterId = voter.getId();

		// Check for civic voter ID i.e. 10 characters and is eligible
		if (voterId.length() == 10 && isEligible(voterId))
			return true;

		return false;
	}

}
