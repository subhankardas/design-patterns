package creational.abstract_factory;

public class FoodRewardFactory extends RewardFactory {

	public FoodRewardFactory(int points) {
		super(points);
		System.out.println("Created food reward factory.");
	}

	@Override
	public Reward getReward() {
		int points = getPoints();

		// Creates food reward instance based on points
		if (points > 1000)
			return new FoodReward(points, Level.PLATINUM);
		else if (points > 700)
			return new FoodReward(points, Level.GOLD);

		return new FoodReward(points, Level.SILVER);
	}

	@Override
	public boolean checkValidity(Reward reward) {
		// Some custom logic to check reward validity
		return reward.getPoints() > 0 && reward.getType() == Type.FOOD;
	}

}
