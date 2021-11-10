package structural.flyweight;

public class Product {

	private final Type type; // Intrinsic state - share able
	private String name; // Extrinsic state - supplied by client

	public Product(Type type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + type + ", " + name + "]";
	}

}
