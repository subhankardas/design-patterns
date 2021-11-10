package structural.facade;

/**
 * Facade is a structural design pattern that provides a simplified interface to
 * a library, a framework, or any other complex set of classes. A facade is a
 * class that provides a simple interface to a complex subsystem which contains
 * lots of moving parts. A facade might provide limited functionality in
 * comparison to working with the subsystem directly. However, it includes only
 * those features that clients really care about.
 * 
 * Having a facade is handy when you need to integrate your app with a
 * sophisticated library that has dozens of features, but you just need a tiny
 * bit of its functionality.
 * 
 * PROS:
 * 
 * 1. You can isolate your code from the complexity of a subsystem.
 * 
 * CONS:
 * 
 * 1. A facade can become a god object coupled to all classes of an app.
 */
public class Main {

	public static void main(String[] args) {
		// Here we will use the db facade instead of the db manager API
		DbFacade dbsource = new DbFacade();

		// Using the facade interface for db operations
		try {
			// Saving the user
			User user = new User();
			user.id = 123l;
			user.name = "Subhankar";
			user.department = "Engineering";
			user.salary = 10000f;
			dbsource.save(user);

			System.out.println("User records before delete:");
			for (User usr : dbsource.findAll()) {
				System.out.println(usr);
			}

			// Deleting the user
			dbsource.deleteById(123);

			System.out.println("User records after delete:");
			for (User usr : dbsource.findAll()) {
				System.out.println(usr);
			}

			// Exception should be thrown when user is null
			dbsource.save(null);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

}
