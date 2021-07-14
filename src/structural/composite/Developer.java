package structural.composite;

/**
 * Leaf – Leaf defines behavior for primitive objects in the composition. It
 * represents leaf objects in the composition.
 */
public class Developer implements Employee {

	private String name;
	private String technology;

	public Developer(String name, String technology) {
		this.name = name;
		this.technology = technology;
	}

	@Override
	public void showDetails() {
		System.out.println("Developer " + name + " works on " + technology);
	}

}
