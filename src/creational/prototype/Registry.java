package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Product> products;

	public Registry() {
		products = new HashMap<>();
		load();
	}

	/**
	 * Creates a new instance from a cloned instance from the registry.
	 */
	public Product createProduct(String type) {
		Product product = null;
		try {
			product = (Product) products.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return product;
	}

	/**
	 * Loads registry with new instances for each type of product.
	 */
	private void load() {
		Laptop laptop = new Laptop();
		laptop.setName("Default Name");
		laptop.setBrand("Default Brand");
		laptop.setPrice(0);

		Book book = new Book();
		book.setName("Default Name");
		book.setAuthor("Unknown Author");
		book.setPrice(0);

		products.put("LAPTOP", laptop);
		products.put("BOOK", book);
	}

}
