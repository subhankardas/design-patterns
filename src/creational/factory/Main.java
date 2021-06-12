package creational.factory;

/**
 * FACTORY PATTERN - In Factory pattern, we create object without exposing the
 * creation logic to the client and refer to newly created object using a common
 * interface.
 * 
 * PROS -
 * 
 * 1. Factory encapsulates the responsibility and the process of creating
 * product objects, it isolates clients from implementation classes.
 * 
 * 2. Adaptable to environments more easily.
 * 
 * 3. Exchanging instance types becomes easier, just need to change the concrete
 * factory.
 * 
 * CONS -
 * 
 * 1. Difficult to add support for new type of objects.
 */
public class Main {

	public static void main(String[] args) {

		// Get instances from factory based on passed type parameters
		Bike offroad = BikeFactory.getBike(Type.OFFROAD);
		Bike sports = BikeFactory.getBike(Type.SPORTS);
		Bike tourer = BikeFactory.getBike(Type.TOURER);

		System.out.println(offroad);
		System.out.println(sports);
		System.out.println(tourer);

	}

}
