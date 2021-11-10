package structural.flyweight;

/**
 * Flyweight is a structural design pattern that lets you use memory efficiently
 * by sharing common parts of state between multiple objects instead of keeping
 * all of the data in each object. Its used when we need to create large number
 * of similar objects.
 * 
 * One important feature of flyweight objects is that they are immutable. This
 * means that they cannot be modified once they have been constructed. It
 * encompass both creation(factory) and structural(flyweight) patterns.
 * 
 * PROS:
 * 
 * 1. You can save lots of RAM, assuming your program has tons of similar
 * objects.
 * 
 * CONS:
 * 
 * 1. You might be trading RAM over CPU cycles when some of the context data
 * needs to be recalculated each time somebody calls a flyweight method.
 * 
 * 2. The code becomes much more complicated. Lots of moving pieces.
 */
public class Main {

	public static void main(String[] args) {
		InventorySystem inventory = new InventorySystem();

		// Create lots of orders (this should not create lots of new product objects)
		inventory.purchase(Type.HEADPHONE, "JBL S1000X");
		inventory.purchase(Type.LAPTOP, "Lenovo Thinkpad");
		inventory.purchase(Type.HEADPHONE, "INFY TX23");
		inventory.purchase(Type.MOBILE, "Motorola G5");
		inventory.purchase(Type.LAPTOP, "HP CanvaX");
		inventory.purchase(Type.LAPTOP, "Dell XPS");
		inventory.purchase(Type.HEADPHONE, "Bose JT3T");
		inventory.purchase(Type.LAPTOP, "Asus TXTF Gaming");

		// This will show that only 3 products were created for 8 orders
		inventory.report();

		Order order1 = inventory.getOrder(1);
		Order order3 = inventory.getOrder(3);

		// This shows that products used by orders are the same
		if (System.identityHashCode(order1.product) != System.identityHashCode(order3.product)) {
			throw new RuntimeException("Products are not the same.");
		}
	}

}
