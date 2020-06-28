package behavioral.state;

import behavioral.state.impl.AirBound;
import behavioral.state.impl.Attack;
import behavioral.state.impl.Ready;
import behavioral.state.impl.Target;

// FINITE STATE MACHINE / CONTEXT
public class Missile {

	// STATES
	private State ready;
	private State airbound;
	private State target;
	private State attack;

	private State current;

	public Missile() {
		ready = new Ready(this);
		airbound = new AirBound(this);
		target = new Target(this);
		attack = new Attack();

		current = ready;
	}

	// ACTION
	public void launch() {
		System.out.println(current);

		// TRANSITION 1 HANDLE()
		current.next();

		System.out.println(current);

		// TRANSITION 2 HANDLE()
		current.next();

		System.out.println(current);

		// TRANSITION 3 HANDLE()
		current.next();

		System.out.println(current);

		// TRANSITION 4 HANDLE()
		current.next();
	}

	public State getState() {
		return current;
	}

	public void setState(State state) {
		this.current = state;
	}

	public State getReady() {
		return ready;
	}

	public State getAirbound() {
		return airbound;
	}

	public State getTarget() {
		return target;
	}

	public State getAttack() {
		return attack;
	}

}
