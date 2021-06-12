package creational.factory;

enum Type {
	OFFROAD, TOURER, SPORTS
}

enum Origin {
	JAPAN, KOREA
}

public abstract class Bike {

	private Type type;

	private Origin origin;

	public Bike(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Origin getOrigin() {
		return origin;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

}
