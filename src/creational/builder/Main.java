package creational.builder;

/**
 * BUILDER PATTERN - Builder pattern aims to “separate the construction of a
 * complex object from its representation so that the same construction process
 * can create different representations.” It is used to construct a complex
 * object step by step and the final step will return the object. The process of
 * constructing an object should be generic so that it can be used to create
 * different representations of the same object.
 * 
 * PROS :
 * 
 * 1. The parameters to the constructor are reduced and are provided in highly
 * readable method calls. Builder design pattern also helps in minimizing the
 * number of parameters in constructor and thus there is no need to pass in null
 * for optional parameters to the constructor.
 * 
 * 2. Object is always instantiated in a complete state.
 * 
 * 3. Immutable objects can be build without much complex logic in object
 * building process.
 * 
 * CONS :
 * 
 * 1. The number of lines of code increase at least to double in builder
 * pattern, but the effort pays off in terms of design flexibility and much more
 * readable code.
 * 
 * 2. Requires creating a separate ConcreteBuilder for each different type of
 * Product.
 */
public class Main {

	public static void main(String[] args) {

		// Create admin user using admin builder
		UserBuilder adminBuilder = new Admin.AdminBuilder();
		User admin = adminBuilder.username("Subhankar Das").password("password123").build();

		// Create devops user using devops builder
		UserBuilder devopsBuilder = new DevOps.DevOpsBuilder();
		User devops = devopsBuilder.username("Sumit Kumar").password("password456").build();

		System.out.println(admin);
		System.out.println(devops);

	}

}
