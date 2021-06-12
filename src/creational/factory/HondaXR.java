package creational.factory;

public class HondaXR extends Bike {

	public HondaXR(Origin origin) {
		super(Type.OFFROAD);
		this.setOrigin(origin);
	}

	@Override
	public String toString() {
		return "HondaXR [type=" + getType() + ", origin=" + getOrigin() + "]";
	}

}
