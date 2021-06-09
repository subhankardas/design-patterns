package creational.singleton;

public class Main {

	public static void main(String[] args) {

		Connection connection1 = Connection.getInstance();
		Connection connection2 = Connection.getInstance();

		System.out.println("Connection 1: " + connection1);
		System.out.println("Connection 2: " + connection2);

		if (connection1 == connection2) {
			System.out.println("Only one connection instance is created.");
		}

	}

}
