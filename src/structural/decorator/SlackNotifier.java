package structural.decorator;

/**
 * Concrete decorator, used to add extra functionality to simple notifier.
 */
public class SlackNotifier extends NotifierDecorator {

	public SlackNotifier(Notifier decoratedNotifier) {
		super(decoratedNotifier);
	}

	@Override
	public void send(String message) {
		decoratedNotifier.send(message);
		sendSlackNotification(message);
	}

	public void sendSlackNotification(String message) {
		System.out.println("SLACK NOTIFICATION: [" + message + "]");
	}

}
