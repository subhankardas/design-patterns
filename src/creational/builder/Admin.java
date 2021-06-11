package creational.builder;

@SuppressWarnings("unused")
public class Admin implements User {

	private long id;
	private String username;
	/*
	 * Note: Storing password in char[] makes it more secure as the string constant
	 * cannot be retrieved from dump memory. String literals are immutable i.e. when
	 * reinitialized the old password constant will still remain in memory and can
	 * be picked out of memory dump by hackers before garbage collection.
	 */
	private char[] password;
	private String role;

	public Admin(AdminBuilder builder) {
		this.id = builder.id;
		this.username = builder.username;
		this.password = builder.password;
		this.role = builder.role;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", role=" + role + "]";
	}

	public static class AdminBuilder implements UserBuilder {

		private long id;
		private String username;
		private char[] password;
		private String role;

		public AdminBuilder() {
			this.id = System.currentTimeMillis();
			this.role = "ADMIN";
		}

		@Override
		public User build() {
			return new Admin(this);
		}

		@Override
		public UserBuilder username(String username) {
			this.username = username;
			return this;
		}

		@Override
		public UserBuilder password(String password) {
			this.password = password.toCharArray();
			return this;
		}

	}

}