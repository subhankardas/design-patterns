package behavioral.state.impl;

import behavioral.state.Missile;
import behavioral.state.State;

public class Target implements State {

	private Missile missile;

	public Target(Missile missile) {
		this.missile = missile;
	}

	@Override
	public void next() {
		System.out.println("-> Locking attack \n");
		missile.setState(missile.getAttack());
	}

	@Override
	public String toString() {
		return "[Missile] TARGET \n";
	}

}
