package behavioral.state.impl;

import behavioral.state.Missile;
import behavioral.state.State;

public class Ready implements State {

	private Missile missile;

	public Ready(Missile missile) {
		this.missile = missile;
	}

	@Override
	public void next() {
		System.out.println("-> Launching missile \n");
		missile.setState(missile.getAirbound());
	}

	@Override
	public String toString() {
		return "[Missile] READY \n";
	}

}
