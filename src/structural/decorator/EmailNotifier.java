package structural.decorator;

/**
 * Concrete decorator, used to add extra functionality to simple notifier.
 */
public class EmailNotifier extends NotifierDecorator {

	public EmailNotifier(Notifier decoratedNotifier) {
		super(decoratedNotifier);
	}

	@Override
	public void send(String message) {
		decoratedNotifier.send(message);
		sendEmailNotification(message);
	}

	public void sendEmailNotification(String message) {
		System.out.println("EMAIL NOTIFICATION: [" + message + "]");
	}

}
