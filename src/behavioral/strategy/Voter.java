package behavioral.strategy;

/**
 * Context class that is aware of the strategy its going to use to validate
 * different types of voters. It will use the abstract strategy to determine if
 * the voter is valid or not. The strategy will be selected from the client at
 * runtime and hence switching between various validation strategies available.
 */
public class Voter {

	private String id;
	private String name;
	private String state;
	private Strategy strategy;

	public Voter(String id, String name, String state, Strategy strategy) {
		this.id = id;
		this.name = name;
		this.state = state;
		this.strategy = strategy;
	}

	public boolean isValid() {
		return strategy.isValid(this);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
