package behavioral.state.impl;

import behavioral.state.State;

public class Attack implements State {

	@Override
	public void next() {
		System.out.println("-> Target destroyed \n");
	}

	@Override
	public String toString() {
		return "[Missile] ATTACK \n";
	}

}
