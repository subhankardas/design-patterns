package structural.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbManager {

	// Using map as a db for simplicity
	private static Map<Long, User> dbsource;

	public DbManager() {
		dbsource = new HashMap<>();
		System.out.println("Database initialization done.");
	}

	/**
	 * Performs complex db operations to save a user. Assuming this method
	 * encapsulates logic to connect to db and run INSERT query to save a user.
	 */
	public User save(User user) {
		// Some complex logic to store a user in some database
		if (dbsource == null) {
			throw new RuntimeException("Database is not initialized.");
		} else if (user == null) {
			throw new RuntimeException("User cannot be null.");
		} else if (user.id == 0) {
			throw new RuntimeException("User ID cannot be zero.");
		} else {
			long userid = user.id;
			dbsource.put(userid, user);
		}

		return user;
	}

	/**
	 * Performs the DELETE query on the db, to remove a user.
	 */
	public boolean deleteById(long id) {
		boolean contains = false;

		// Some complex logic to delete by ID from some database
		if (dbsource == null) {
			throw new RuntimeException("Database is not initialized.");
		} else {
			contains = dbsource.containsKey(id);
			if (contains) {
				dbsource.remove(id);
			}
		}

		return contains;
	}

	/**
	 * Performs the SELECT * query on the db to get list of all users.
	 */
	public List<User> findAll() {
		List<User> users = new ArrayList<>();

		// Some complex logic to get all users from some database
		if (dbsource == null) {
			throw new RuntimeException("Database is not initialized.");
		} else {
			for (long key : dbsource.keySet()) {
				users.add(dbsource.get(key));
			}
		}

		return users;
	}

}

class User {

	long id;
	String name;
	String department;
	float salary;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}