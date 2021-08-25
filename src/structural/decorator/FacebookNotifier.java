package structural.decorator;

/**
 * Concrete decorator, used to add extra functionality to simple notifier.
 */
public class FacebookNotifier extends NotifierDecorator {

	public FacebookNotifier(Notifier decoratedNotifier) {
		super(decoratedNotifier);
	}

	@Override
	public void send(String message) {
		decoratedNotifier.send(message);
		sendFacebookNotification(message);
	}

	public void sendFacebookNotification(String message) {
		System.out.println("FBOOK NOTIFICATION: [" + message + "]");
	}

}
