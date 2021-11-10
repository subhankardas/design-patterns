package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class InventorySystem {

	private static long id = 0;
	private ProductFactory factory;
	private List<Order> orders;

	public InventorySystem() {
		factory = new ProductFactory();
		orders = new ArrayList<>();
	}

	public void purchase(Type type, String name) {
		// Get flyweight product
		Product product = factory.getProduct(type);
		product.setName(name);

		// Create an order
		Order order = new Order(++id, product);
		orders.add(order);

		System.out.println(order);
	}

	public void report() {
		System.out.println("Total no. of orders   : " + orders.size());
		System.out.println("Total no. of products : " + factory.getProductsCount());
	}

	public Order getOrder(int id) {
		return orders.get(id - 1);
	}

}

class Order {

	long id;
	Product product;

	public Order(long id, Product product) {
		this.id = id;
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order #" + id + ", Product=" + product;
	}

}
