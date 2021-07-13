package structural.adapter;

/**
 * ADAPTEE: This represents a legacy user that needs to be migrated to the
 * latest user type to be able to store it in the database.
 */
public class LegacyUser {

	private int userId;
	private String name1;
	private String name2;
	private String contact;

	public LegacyUser(int userId, String name1, String name2, String contact) {
		this.userId = userId;
		this.name1 = name1;
		this.name2 = name2;
		this.contact = contact;
	}

	public int getUserId() {
		return userId;
	}

	public String getName1() {
		return name1;
	}

	public String getName2() {
		return name2;
	}

	public String getContact() {
		return contact;
	}

}
