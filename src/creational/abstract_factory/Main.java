package creational.abstract_factory;

/**
 * ABSTRACT FACTORY PATTERN - Abstract Factory patterns work around a
 * super-factory which creates other factories.
 * 
 * Abstract factory pattern implementation provides us a framework that allows
 * us to create objects that follow a general pattern. So at runtime, abstract
 * factory is coupled with any desired concrete factory which can create objects
 * of desired type.
 * 
 * PROS -
 * 
 * 1. Avoid tight coupling between concrete products and client code.
 * 
 * 2. Extract the product creation code into one place, making the code easier
 * to support.
 * 
 * 3. Introduce new variants of products without breaking existing client code.
 * 
 * CONS -
 * 
 * 1. Code may become more complicated than it should be, since a lot of new
 * interfaces and classes are introduced along with the pattern.
 */
public class Main {

	public static void main(String[] args) {

		// Create an abstract reward using abstract reward factory
		RewardFactory abstractRewardFactory = RewardFactory.getRewardFactory(2000);
		Reward abstractReward = abstractRewardFactory.getReward();

		// Create concrete reward instance [DO NOT DO THIS]
		Reward reward = new FoodReward(1111, Level.PLATINUM);

		System.out.println(abstractReward);
		System.out.println(reward);

		System.out.println("Abstract reward is valid: " + abstractRewardFactory.checkValidity(abstractReward));
		System.out.println("Reward is valid: " + abstractRewardFactory.checkValidity(reward));

	}

}
