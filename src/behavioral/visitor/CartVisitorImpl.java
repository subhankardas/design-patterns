package behavioral.visitor;

/**
 * This visitor implementation actually visits all the elements and designs the
 * various types of pricing based on the element type.
 */
public class CartVisitorImpl implements CartVisitor {

	@Override
	public double visit(Book book) {
		System.out.println("Calculating price for " + book.getName() + " by " + book.getAuthor());
		if (book.getPrice() > 50) {
			System.out.println("Item gets a discount on price");
			return book.getPrice() - 5;
		} else {
			return book.getPrice();
		}
	}

	@Override
	public double visit(Fruit fruit) {
		System.out.println("Calculating price for " + fruit.getWeight() + " Kg. of " + fruit.getName());
		return fruit.getPricePerKg() * fruit.getWeight();
	}

}
