package creational.factory;

public class SuzukiVStrom extends Bike {

	public SuzukiVStrom(Origin origin) {
		super(Type.TOURER);
		this.setOrigin(origin);
	}

	@Override
	public String toString() {
		return "SuzukiVStrom [type=" + getType() + ", origin=" + getOrigin() + "]";
	}

}
