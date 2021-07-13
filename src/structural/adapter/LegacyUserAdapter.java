package structural.adapter;

/**
 * ADAPTER : The adapter translates that request on the adaptee using the
 * adaptee interface.
 */
public class LegacyUserAdapter implements UserI {

	private LegacyUser user;

	public LegacyUserAdapter(LegacyUser user) {
		this.user = user;
	}

	@Override
	public int getId() {
		return user.getUserId();
	}

	@Override
	public String getFirstName() {
		return user.getName1();
	}

	@Override
	public String getLastName() {
		return user.getName2();
	}

	@Override
	public String getEmail() {
		return user.getContact();
	}

	@Override
	public String toString() {
		return "[ID=" + getId() + ", First Name=" + getFirstName() + ", Last Name=" + getLastName() + ", Email="
				+ getEmail() + "]";
	}

}
