package structural.adapter;

import java.util.ArrayList;

public class UserDB {

	private static ArrayList<UserI> users = new ArrayList<>();

	public void getUsers() {
		users.forEach(user -> {
			System.out.println(user);
		});
		System.out.println();
	}

	public void addUser(UserI user) {
		users.add(user);
	}

}
