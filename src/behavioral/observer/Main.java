package behavioral.observer;

/**
 * OBSERVER PATTERN
 * 
 * Observer pattern is used when there is one-to-many relationship between
 * objects such as if one object is modified, its dependent objects are to be
 * notified automatically. The Observer Design Pattern is really useful in
 * event-driven systems where many objects may depend on a state of another
 * object.
 * 
 * PROS:
 * 
 * 1. Allows loose coupling between object communicating via messages without
 * changes to Subject or Observer.
 * 
 * 2. Supports runtime binding of objects i.e subscribers can be added/removed
 * at any point of time.
 * 
 * 3. Can introduce new subscriber classes without having to change the
 * publisher’s code and vice-versa.
 * 
 * CONS:
 * 
 * 1. If implemented poorly, this will result in a coupled and stiff application
 * where it's really hard to test objects
 * 
 */
public class Main {

	public static void main(String[] args) {

		MessageSubscriber subscriber1 = new MessageSubscriber("ABC");
		MessageSubscriber subscriber2 = new MessageSubscriber("XYZ");
		MessageSubscriber subscriber3 = new MessageSubscriber("123");

		MessagePublisher publisher1 = new MessagePublisher();
		MessagePublisher publisher2 = new MessagePublisher();

		publisher1.attach(subscriber1);
		publisher1.attach(subscriber2);

		publisher2.attach(subscriber3);
		publisher2.attach(subscriber1);

		publisher1.notifyUpdate(new Message("Hello from Publisher 1!"));
		publisher2.notifyUpdate(new Message("Hello from Publisher 2!"));
	}

}
