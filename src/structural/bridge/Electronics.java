package structural.bridge;

public class Electronics extends Product {

	public Electronics(Manager qaManager, Manager stockManager) {
		super(qaManager, stockManager);
	}

	@Override
	public void processForSales() {
		System.out.println("Processing electronics item for sales:");
		qaManager.process();
		stockManager.process();
	}

}
