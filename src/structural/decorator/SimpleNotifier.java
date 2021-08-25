package structural.decorator;

/**
 * Simple concrete component.
 */
public class SimpleNotifier implements Notifier {

	@Override
	public void send(String message) {
		System.out.println("Sending [" + message + "] notification...");
	}

}
