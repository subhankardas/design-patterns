package creational.factory;

public class KawasakiNinja extends Bike {

	public KawasakiNinja(Origin origin) {
		super(Type.SPORTS);
		this.setOrigin(origin);
	}

	@Override
	public String toString() {
		return "KawasakiNinja [type=" + getType() + ", origin=" + getOrigin() + "]";
	}

}
