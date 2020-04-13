package behavioral.chain_of_responsibility;

public class Message {

	private MessageType type;

	public Message(MessageType type) {
		this.type = type;
	}

	public MessageType getType() {
		return type;
	}

}
