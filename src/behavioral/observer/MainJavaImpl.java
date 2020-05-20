package behavioral.observer;

import java.util.Observable;

/**
 * 
 * Observer Pattern implemented using Java 8 API.
 * 
 */
public class MainJavaImpl {

	public static void main(String[] args) {

		NewObserver observer1 = new NewObserver("A123");
		NewObserver observer2 = new NewObserver("B456");

		NewObservable observable = new NewObservable();

		observable.addObserver(observer1);
		observable.addObserver(observer2);

		observable.publish("New Message!");

	}

}

class NewObserver implements java.util.Observer {

	private String id;

	public NewObserver(String id) {
		this.id = id;
	}

	@Override
	public void update(Observable ob, Object msg) {
		System.out.println("[ " + id + " ] -> " + msg);
	}

}

class NewObservable extends java.util.Observable {

	public void publish(String message) {
		setChanged();
		notifyObservers(message);
	}

}