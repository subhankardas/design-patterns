package behavioral.chain_of_responsibility;

/**
 * CHAIN OF RESPONSIBILITY
 * 
 * Implemented by creating chain of handlers and passing the request through the
 * chain. Each handler is responsible for a task, if unable to process it passes
 * the request to next handler in the chain.
 * 
 * PROS:
 * 
 * 1. Decoupling senders and receivers.
 * 
 * 2. Each receiver contains reference to the next receiver.
 * 
 * 3. Promotes loose coupling i.e new handler can be added to modify the chain.
 * 
 * 4. Handler may or may not process the request.
 * 
 * CONS:
 * 
 * 1. Handling / handler guarantee.
 *
 * 2. Performance issues may occur if length of chain increases.
 * 
 * 3. Flow of the request is untraceable.
 */
public class Main {

	public static void main(String[] args) {
		// Create the responsibility handlers
		Handler primary = new MessageHandler();
		Handler complaint = new ComplaintHandler();
		Handler spam = new SpamHandler();

		// Create the chain of responsibilities i.e. primary -> complaint -> spam
		primary.setSuccessor(complaint);
		complaint.setSuccessor(spam);

		// Create the requests i.e. messages
		Message message1 = new Message(MessageType.PRIMARY);
		Message message2 = new Message(MessageType.COMPLAINT);
		Message message3 = new Message(MessageType.SPAM);

		// Handle requests i.e pass through the chain
		primary.handle(message1);
		primary.handle(message2);
		primary.handle(message3);
	}

}
