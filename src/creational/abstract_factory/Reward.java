package creational.abstract_factory;

enum Type {
	FOOD, SHOP
}

enum Level {
	SILVER, GOLD, PLATINUM
}

/*
 * Parent class for a family of products with the specific types and level.
 */
public abstract class Reward {

	private int points;

	private Type type;

	private Level level;

	public Reward(Type type) {
		this.type = type;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

}
