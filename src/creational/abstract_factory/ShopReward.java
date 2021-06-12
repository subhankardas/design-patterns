package creational.abstract_factory;

public class ShopReward extends Reward {

	public ShopReward(int points, Level level) {
		super(Type.SHOP);
		this.setPoints(points);
		this.setLevel(level);
	}

	@Override
	public String toString() {
		return "ShopReward [points=" + getPoints() + ", type=" + getType() + ", level=" + getLevel() + "]";
	}

}
