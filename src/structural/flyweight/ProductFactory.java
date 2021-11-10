package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {

	// Catalog to store fly-weight objects for products
	private Map<Type, Product> catalog = new HashMap<>();

	// Factory method to return fly-weight objects
	public Product getProduct(Type type) {
		if (!catalog.containsKey(type)) {
			catalog.put(type, new Product(type));
		}
		return catalog.get(type);
	}

	public int getProductsCount() {
		return catalog.size();
	}

}
