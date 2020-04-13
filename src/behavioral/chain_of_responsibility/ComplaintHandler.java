package behavioral.chain_of_responsibility;

public class ComplaintHandler extends Handler {

	@Override
	public void handle(Message message) {
		if (MessageType.COMPLAINT == message.getType()) {
			System.out.println("[COMPLAINT]   Forwarding message...");
		} else {
			successor.handle(message);
		}
	}

}
