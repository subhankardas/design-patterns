package creational.abstract_factory;

public abstract class RewardFactory {

	private int points;

	public RewardFactory(int points) {
		this.points = points;
	}

	public static RewardFactory getRewardFactory(int points) {
		// Creates reward factory instance based on points
		if (points > 1000) {
			return new ShopRewardFactory(points);
		}

		return new FoodRewardFactory(points);
	}

	/**
	 * Implements custom logic for creation of reward instance.
	 */
	public abstract Reward getReward();

	/**
	 * Implements custom logic for reward validity check.
	 */
	public abstract boolean checkValidity(Reward reward);

	public int getPoints() {
		return points;
	}

}
