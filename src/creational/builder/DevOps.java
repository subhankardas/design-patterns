package creational.builder;

@SuppressWarnings("unused")
public class DevOps implements User {

	private long id;
	private String username;
	private char[] password;
	private String role;

	public DevOps(DevOpsBuilder builder) {
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
		return "DevOps [id=" + id + ", username=" + username + ", role=" + role + "]";
	}

	public static class DevOpsBuilder implements UserBuilder {

		private long id;
		private String username;
		private char[] password;
		private String role;

		public DevOpsBuilder() {
			this.id = System.currentTimeMillis();
			this.role = "DEVOPS";
		}

		@Override
		public User build() {
			return new DevOps(this);
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