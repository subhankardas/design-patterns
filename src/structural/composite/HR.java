package structural.composite;

/**
 * Leaf – Leaf defines behavior for primitive objects in the composition. It
 * represents leaf objects in the composition.
 */
public class HR implements Employee {

	private String name;
	private String department;

	public HR(String name, String department) {
		this.name = name;
		this.department = department;
	}

	@Override
	public void showDetails() {
		System.out.println("HR " + name + " handles " + department);
	}

}
