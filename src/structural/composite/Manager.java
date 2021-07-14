package structural.composite;

import java.util.ArrayList;

/**
 * Composite – Composite stores child components and implements child related
 * operations in the component interface.
 */
public class Manager implements Employee {

	private String name;
	private String department;
	private ArrayList<Employee> subordinates;

	public Manager(String name, String department) {
		this.name = name;
		this.department = department;
		subordinates = new ArrayList<>();
	}

	public void addSubordinate(Employee employee) {
		subordinates.add(employee);
	}

	public void removeSubordinate(Employee employee) {
		subordinates.remove(employee);
	}

	public void showSubordinates() {
		subordinates.forEach(subordinate -> {
			subordinate.showDetails();
		});
	}

	@Override
	public void showDetails() {
		System.out.println("Manager " + name + " leads " + department);
	}

}
