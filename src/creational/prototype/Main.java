package creational.prototype;

/**
 * PROTOTYPE PATTERN - Prototype allows us to hide the complexity of making new
 * instances from the client. The concept is to copy an existing object rather
 * than creating a new instance from scratch, something that may include costly
 * operations. The existing object acts as a prototype and contains the state of
 * the object. The newly copied object may change same properties only if
 * required.
 * 
 * PROS -
 * 
 * 1. This approach saves costly resources and time, especially when the object
 * creation is a heavy process.
 * 
 * 2. Reduced sub-classing : The Prototype pattern lets you clone a prototype
 * instead of asking a factory method to make a new object. Hence you don’t need
 * a creator class hierarchy at all.
 * 
 * CONS -
 * 
 * 1. It also hides concrete product classes from the client.
 * 
 * 2. Overkill for a project that uses very few objects and/or does not have an
 * underlying emphasis on the extension of prototype chains.
 * 
 */
public class Main {

	public static void main(String[] args) {

		Registry productsRegistry = new Registry();

		// Fetch a new laptop instance from registry and set values
		Laptop laptop1 = (Laptop) productsRegistry.createProduct("LAPTOP");
		laptop1.setName("Legion X");
		laptop1.setBrand("Lenovo");
		laptop1.setPrice(140000);

		// Fetch another new laptop instance from registry and set values
		Laptop laptop2 = (Laptop) productsRegistry.createProduct("LAPTOP");
		laptop2.setName("Nitro 5");
		laptop2.setBrand("Acer");
		laptop2.setPrice(80000);

		// Fetch a new book instance from registry and set values
		Book book1 = (Book) productsRegistry.createProduct("BOOK");
		book1.setName("Java Advanced");
		book1.setAuthor("A.J. Williams");
		book1.setPrice(4500);

		System.out.println(laptop1);
		System.out.println(laptop1.details() + "\n");

		System.out.println(laptop2);
		System.out.println(laptop2.details() + "\n");

		System.out.println(book1);
		System.out.println(book1.details() + "\n");

	}

}
