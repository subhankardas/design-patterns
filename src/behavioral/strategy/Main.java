package behavioral.strategy;

/**
 * STRATEGY PATTERN :
 * 
 * In Strategy pattern, a class behavior or its algorithm can be changed at run
 * time. This type of design pattern comes under behavior pattern.
 * 
 * In Strategy pattern, we create objects which represent various strategies and
 * a context object whose behavior varies as per its strategy object. The
 * strategy object changes the executing algorithm of the context object.
 * 
 * Ex.: Comparator
 * 
 * PROS: The main objective of this pattern is to externalize and encapsulate
 * if/else conditions into various strategies. While strategies are independent
 * of each other.
 * 
 * CONS: Client has to be aware of the strategies. Increases amount of classes.
 */
public class Main {

	public static void main(String[] args) {

		// Valid VIP Voter
		Voter voter1 = new Voter("22123", "Subhankar", "WB", new VipVoterStrategy());

		// Invalid VIP Voter
		Voter voter2 = new Voter("21123", "Arijit", "OR", new VipVoterStrategy());

		System.out.println(voter1.getName() + " is VIP Voter: " + voter1.isValid());
		System.out.println(voter2.getName() + " is VIP Voter: " + voter2.isValid());

		// Valid Civic Voter
		Voter voter3 = new Voter("3312345678", "Wasif", "TL", new CivicVoterStrategy());

		// Invalid Civic Voter
		Voter voter4 = new Voter("33123456789", "Arjun", "HR", new CivicVoterStrategy());

		System.out.println(voter3.getName() + " is Civic Voter: " + voter3.isValid());
		System.out.println(voter4.getName() + " is Civic Voter: " + voter4.isValid());

	}

}
