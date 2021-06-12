package creational.prototype;

public class Book extends Product {

	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String details() {
		return "Book [author=" + author + ", name=" + getName() + ", price=" + getPrice() + "]";
	}

}
