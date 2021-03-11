package behavioral.strategy;

/**
 * Concrete strategy implementation for VIP voters.
 */
public class VipVoterStrategy extends Strategy {

	@Override
	public boolean isValid(Voter voter) {
		String voterId = voter.getId();

		// Check for VIP voter ID i.e. 5 characters, starts with 22 and is eligible
		if (voterId.length() == 5 && voterId.startsWith("22") && isEligible(voterId))
			return true;

		return false;
	}

}
