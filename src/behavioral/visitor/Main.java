package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * The visitor design pattern is a way of separating an algorithm from an object
 * structure on which it operates. It is used when we have to perform an
 * operation on a group of similar kind of Objects. With the help of visitor
 * pattern, we can move the operational logic from the objects to another class.
 * 
 * A practical result of this separation is the ability to add new operations to
 * existing object structures without modifying the structures.
 * 
 * ELEMENT (ACCEPT) <--- VISITOR (VISIT)
 */
public class Main {

	private static List<Element> items = new ArrayList<Element>();

	public static void main(String[] args) {

		// Element 1 of type Book
		Book book = new Book("Power Of Habbits");
		book.setAuthor("M.C. Craig");
		book.setPrice(100);

		// Element 2 of type Fruit
		Fruit fruit = new Fruit("Apple");
		fruit.setPricePerKg(80);
		fruit.setWeight(2);

		items.add(book);
		items.add(fruit);

		System.out.println("Order Total: " + calculateOrderPrice() + " Rs.");

	}

	public static double calculateOrderPrice() {
		CartVisitor cart = new CartVisitorImpl();

		double total = 0;
		for (Element item : items) {
			// Element accepts the visitor, which contains the price algorithm
			total += item.accept(cart);
		}

		return total;
	}

}
