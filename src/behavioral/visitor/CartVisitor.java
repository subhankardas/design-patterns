package behavioral.visitor;

public interface CartVisitor {

	/**
	 * Visit a book and calculate the price.
	 * 
	 * @param book Book
	 * @return Pricing
	 */
	double visit(Book book);

	/**
	 * Visit a fruit and calculate the price.
	 * 
	 * @param fruit Fruit
	 * @return Pricing
	 */
	double visit(Fruit fruit);

}
