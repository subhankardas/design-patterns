package structural.composite;

/**
 * Composite pattern is used where we need to treat a group of objects in
 * similar way as a single object. Composite pattern composes objects in term of
 * a tree structure to represent part as well as whole hierarchy. This type of
 * design pattern comes under structural pattern as this pattern creates a tree
 * structure of group of objects.
 * 
 * This pattern creates a class that contains group of its own objects. This
 * class provides ways to modify its group of same objects.
 * 
 * COMPOSITE ---> LEAF / CHILD
 *           ---> LEAF / CHILD
 * 
 * PROS:
 * 
 * 1. Work with complex tree structures more conveniently, use polymorphism and
 * recursion to advantage.
 *
 * 2. Introduce new element types into the app without breaking the existing
 * code, which now works with the object tree.
 * 
 * CONS:
 * 
 * 1. Difficult to restrict and implementation can be costly.
 */
public class Main {

	public static void main(String[] args) {
		Manager manager1 = new Manager("Aryan", "Engineering");
		Manager manager2 = new Manager("Deepak", "Management");

		Developer dev1 = new Developer("Subho", "Java");
		Developer dev2 = new Developer("Amit", "UI/UX");

		HR hr1 = new HR("Soumya", "Recruitment");
		HR hr2 = new HR("Manish", "Training");

		// Add developers as subordinates for manager 1
		manager1.addSubordinate(dev1);
		manager1.addSubordinate(dev2);

		// Add HRs as subordinates for manager 2
		manager2.addSubordinate(hr1);
		manager2.addSubordinate(hr2);

		manager1.showDetails();
		System.out.println("Subordinates:");
		manager1.showSubordinates();

		System.out.println();

		manager2.showDetails();
		System.out.println("Subordinates:");
		manager2.showSubordinates();
	}

}
