package behavioral.visitor;

public class Book implements Element {

	private String name;
	private double price;
	private String author;

	public Book(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public double accept(CartVisitor visitor) {
		return visitor.visit(this);
	}

}
