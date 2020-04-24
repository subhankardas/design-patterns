package behavioral.mediator;

/**
 * MEDIATOR PATTERN
 * 
 * Provides loose coupling between different communicating objects. This pattern
 * also provides a central point of contact when communicating logic is complex.
 * Mediator should be more specific to a use case scenario. Can be used with
 * command pattern to simplify implementation.
 * 
 * 
 * COMMAND --> MEDIATOR --> COLLEAGUE
 * 
 * ACTION TO PERFORM --> LOGIC COMMUNICATING THE ACTION --> ACTION
 * 
 * 
 * CONS:
 * 
 * 1. Large mediator classes can increase dependency among objects.
 * 
 * 2. Cannot use in cases where no. of mediator can grow as it will increase
 * complexity.
 * 
 */
public class Main {

	public static void main(String[] args) {

		// Create mediator for bulk mailer
		MailQueue queue = new MailQueue();

		queue.add("subho@email.com");
		queue.add("sayan@gmail.com");
		queue.add("sanka@yahoo.com");

		// Create command with mediator for email queue
		Command command = new BulkMailer(queue);
		command.execute();

	}

}
