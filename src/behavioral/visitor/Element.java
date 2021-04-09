package behavioral.visitor;

public interface Element {

	/**
	 * Elements must accept a visitor.
	 * 
	 * @param visitor Visitor
	 * @return Pricing
	 */
	public double accept(CartVisitor visitor);

}
