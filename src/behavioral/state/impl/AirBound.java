package behavioral.state.impl;

import behavioral.state.Missile;
import behavioral.state.State;

public class AirBound implements State {

	private Missile missile;

	public AirBound(Missile missile) {
		this.missile = missile;
	}

	@Override
	public void next() {
		System.out.println("-> Acquiring target \n");
		missile.setState(missile.getTarget());
	}

	@Override
	public String toString() {
		return "[Missile] AIRBOUND \n";
	}

}
