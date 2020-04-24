package behavioral.mediator;

// Colleague: Bulk mail sending command.
public class BulkMailer implements Command {

	MailQueue queue;

	public BulkMailer(MailQueue queue) {
		this.queue = queue;
	}

	@Override
	public void execute() {
		// Initiate command action
		queue.send();
	}

}
