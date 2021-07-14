package structural.bridge;

public class StockManager implements Manager {

	@Override
	public void process() {
		System.out.println("Checking stock availability... \n");
	}

}
