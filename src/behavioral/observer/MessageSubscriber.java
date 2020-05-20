package behavioral.observer;

public class MessageSubscriber implements Observer {

	private String subsciberID;

	public MessageSubscriber(String id) {
		subsciberID = id;
	}

	@Override
	public void update(Message msg) {
		System.out.println("[ " + subsciberID + " ] -> " + msg.getContent());
	}

}
