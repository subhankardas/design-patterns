package structural.adapter;

/**
 * The adapter pattern convert the interface of a class into another interface
 * clients expect. Adapter lets classes work together that couldn’t otherwise
 * because of incompatible interfaces. In simple words this pattern makes legacy
 * code work with the latest design. Client receive the results of the call and
 * is unaware of adapter’s presence.
 * 
 * ADAPTEE --> ADAPTER --> TARGET
 * 
 * PROS :
 * 
 * 1. Helps achieve reusability and flexibility.
 * 
 * 2. Client class is not complicated by having to use a different interface and
 * can use polymorphism to swap between different implementations of adapters.
 * 
 * CONS :
 * 
 * 1. All requests are forwarded, so there is a slight increase in the overhead.
 * 
 * 2. Sometimes many adaptations are required along an adapter chain to reach
 * the type which is required.
 */
public class Main {

	public static void main(String[] args) {
		UserDB db = new UserDB();

		// This is a simple user thats accepted by the DB
		UserI user1 = new User(1, "Subhankar", "Das", "test@email.com");

		System.out.println("Adding a simple user to DB...");
		db.addUser(user1);
		db.getUsers();

		// Here we need to use an adapter to convert our legacy user to simple user
		UserI user2 = new LegacyUserAdapter(new LegacyUser(999, "Sayan", "Das", "email@test.co"));

		System.out.println("Adding a legacy user to DB...");
		db.addUser(user2);
		db.getUsers();
	}

}
