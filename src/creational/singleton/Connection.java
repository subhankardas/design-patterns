package creational.singleton;

/**
 * SINGLETON PATTERN - The singleton pattern is a design pattern that restricts
 * the instantiation of a class to one object. Has only one private constructor
 * without any parameters, so can be dynamically instantiated.
 * 
 * CONS :
 * 
 * 1. Often over used and slows down the application.
 * 
 * 2. Difficult to unit test and may not be thread safe.
 * 
 * 3. Confused with factory pattern. Whenever the get instance requires
 * parameters it should be a factory.
 */
public class Connection {

	// 1. Eagerly loaded instance - Object created once JVM starts
	// private static Connection instance = new Connection();

	// 1. Lazy loaded instance - created only on demand
	private static Connection instance = null;

	// 2. Private constructor to disable object creation from outside
	private Connection() {
		System.out.println("Singleton instance created.");
	}

	// 3. Only public method to get singleton instance
	public static Connection getInstance() {
		if (instance == null) {

			// 4. Synchronized instance creation to provide thread safety
			synchronized (Connection.class) {
				if (instance == null)
					instance = new Connection();
			}
		}
		return instance;
	}

}
