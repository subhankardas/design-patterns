package creational.abstract_factory;

public class ShopRewardFactory extends RewardFactory {

	public ShopRewardFactory(int points) {
		super(points);
		System.out.println("Created shop reward factory.");
	}

	@Override
	public Reward getReward() {
		int points = getPoints();

		// Creates shop reward instance based on points
		if (points > 500)
			return new ShopReward(points, Level.PLATINUM);
		else if (points > 300)
			return new ShopReward(points, Level.GOLD);

		return new ShopReward(points, Level.SILVER);
	}

	@Override
	public boolean checkValidity(Reward reward) {
		// Some logic to check reward validity
		return reward.getPoints() > 0 && reward.getType() == Type.SHOP;
	}

}
