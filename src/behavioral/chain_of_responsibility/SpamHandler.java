package behavioral.chain_of_responsibility;

public class SpamHandler extends Handler {

	@Override
	public void handle(Message message) {
		System.out.println("[SPAM]        Deleting message...");
	}

}
