package structural.bridge;

public class FoodItem extends Product {

	public FoodItem(Manager qaManager, Manager stockManager) {
		super(qaManager, stockManager);
	}

	@Override
	public void processForSales() {
		System.out.println("Processing food item for sales:");
		qaManager.process();
		stockManager.process();
	}

}
