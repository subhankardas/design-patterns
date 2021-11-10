package structural.facade;

import java.util.List;

/**
 * Facade class simplifies the client interface. Making it easier to use the db
 * manager API.
 */
public class DbFacade {

	private DbManager dbsource;

	public DbFacade() {
		dbsource = new DbManager();
	}

	public User save(User user) throws RuntimeException {
		return dbsource.save(user);
	}

	public boolean deleteById(long id) throws RuntimeException {
		return dbsource.deleteById(id);
	}

	public List<User> findAll() throws RuntimeException {
		return dbsource.findAll();
	}

}
