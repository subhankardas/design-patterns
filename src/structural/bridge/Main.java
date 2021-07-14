package structural.bridge;

/**
 * The Bridge design pattern allows you to separate the abstraction from the
 * implementation. Here we’re QA testing and checking stick for the two
 * different products using Bridge design pattern. The Bridge pattern is an
 * application of the old advice, “prefer composition over inheritance”. It
 * becomes handy when you must subclass different times in ways that are
 * orthogonal with one another.
 * 
 * The bridge pattern allows the Abstraction and the Implementation to be
 * developed independently and the client code can access only the Abstraction
 * part without being concerned about the Implementation part.
 * 
 * Here the product processing is abstracted and implemented using two separate
 * managers. This allows us to create variations of processing flows for
 * different products which would not have been possible in case of inheritance.
 * 
 * PROS :
 * 
 * 1. It is used mainly for implementing platform independence feature.
 * 
 * 2. It adds one more method level redirection to achieve the objective.
 * 
 * 3. Use bridge pattern to run-time binding of the implementation. Use bridge
 * pattern to map orthogonal class hierarchies.
 * 
 * CONS :
 * 
 * 1. Increases complexity and difficult to plan.
 * 
 */
public class Main {

	public static void main(String[] args) {
		Manager qaManager = new QualityAssuranceManager();
		Manager stockManager = new StockManager();

		Product product1 = new FoodItem(qaManager, stockManager);
		Product product2 = new Electronics(qaManager, stockManager);

		product1.processForSales();
		product2.processForSales();
	}

}
