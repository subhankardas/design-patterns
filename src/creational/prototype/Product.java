package creational.prototype;

public abstract class Product implements Cloneable {

	private String name;
	private double price;

	/**
	 * Implements object creation from existing objects using clone() method.
	 * @return A cloned product object.
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
