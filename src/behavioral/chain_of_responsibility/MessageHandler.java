package behavioral.chain_of_responsibility;

public class MessageHandler extends Handler {

	@Override
	public void handle(Message message) {
		if (MessageType.PRIMARY == message.getType()) {
			System.out.println("[PRIMARY]     Displaying  message...");
		} else {
			successor.handle(message);
		}
	}

}
