package behavioral.state;

/**
 * STATE PATTERN
 * 
 * State pattern is used when an object change its behavior based on its
 * internal state. To change behavior of an object different variables are
 * stored inside a object like structure within the actual object and use
 * if-else blocks to perform different actions based on current state. State
 * pattern is used to overcome this cyclomatic complexity i.e lesser if-else
 * statements. Hence its used to achieve loose-coupled systematic state
 * machines.
 * 
 * 		CONTEXT 	---> STATE			---> STATE A [ handle() implementation ]
 * 
 * 		request()    	handle()		 ---> STATE B [ handle() implementation ]
 * 
 * PROS:
 * 
 * 1. Easier to add new states and behaviors.
 * 
 * 2. Removes logic from context and dependency on if-else hence reducing
 * cyclomatic complexity.
 * 
 * CONS:
 * 
 * 1. Requires more classes to implement. Hence complete knowledge of all the 
 * states an is required to make changes to the over all behavior.
 * 
 */
public class Main {

	public static void main(String[] args) {

		Missile missile = new Missile(); 		// CONTEXT
		missile.launch(); 					   // REQUEST()

	}

}
