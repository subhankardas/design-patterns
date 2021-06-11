package creational.builder;

public interface UserBuilder {

	UserBuilder username(String username);

	UserBuilder password(String password);

	/**
	 * The build method builds the actual admin user object which sets member
	 * variables from the builder object the constructor receives.
	 */
	User build();

}
