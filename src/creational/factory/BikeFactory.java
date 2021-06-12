package creational.factory;

public class BikeFactory {

	/**
	 * Responsible for creation of all types of bike instances based on the type
	 * parameters passed.
	 */
	public static Bike getBike(Type type) {
		switch (type) {
		case OFFROAD:
			return new HondaXR(Origin.JAPAN);
		case SPORTS:
			return new KawasakiNinja(Origin.KOREA);
		case TOURER:
			return new SuzukiVStrom(Origin.JAPAN);
		}
		return null;
	}

}
