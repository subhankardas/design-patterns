package structural.bridge;

public abstract class Product {

	protected Manager qaManager;
	protected Manager stockManager;

	public Product(Manager qaManager, Manager stockManager) {
		this.qaManager = qaManager;
		this.stockManager = stockManager;
	}

	public abstract void processForSales();

}
