package creational.prototype;

public class Laptop extends Product {

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String details() {
		return "Laptop [brand=" + brand + ", name=" + getName() + ", price=" + getPrice() + "]";
	}

}
