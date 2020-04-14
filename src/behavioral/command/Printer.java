package behavioral.command;

public class Printer {

	public void executeCommand(Command command) {
		command.execute();
	}

}
