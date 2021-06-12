package creational.abstract_factory;

public class FoodReward extends Reward {

	public FoodReward(int points, Level level) {
		super(Type.FOOD);
		this.setPoints(points);
		this.setLevel(level);
	}

	@Override
	public String toString() {
		return "FoodReward [points=" + getPoints() + ", type=" + getType() + ", level=" + getLevel() + "]";
	}

}
