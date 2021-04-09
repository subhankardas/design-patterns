package behavioral.visitor;

public class Fruit implements Element {

	private String name;
	private float weight;
	private double pricePerKg;

	public Fruit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	@Override
	public double accept(CartVisitor visitor) {
		return visitor.visit(this);
	}

}
