package structural.decorator;

/**
 * Decorator is a structural design pattern that lets you attach new behaviors
 * to objects by placing these objects inside special wrapper objects that
 * contain the behaviors. Using inheritance we have to override the whole
 * functionality but cannot alter it, subclasses can inherit only one parent
 * class behavior but not multiple behaviors at the same time. So we need to use
 * composition along with inheritance to achieve this pattern.
 * 
 * CLIENT ---> COMPONENT { execute() } <--- DECORACTOR 1 { execute() + extra() } <--- BASE DECORACTOR { execute() }
 * 
 * PROS:
 * 
 * 1. You can extend an object’s behavior without making a new subclass.
 * 
 * 2. You can add or remove responsibilities from an object at runtime.
 * 
 * 3. You can combine several behaviors by wrapping an object into multiple
 * decorators.
 * 
 * 4. Single Responsibility Principle. You can divide a monolithic class that
 * implements many possible variants of behavior into several smaller classes.
 * 
 * CONS:
 * 
 * 1. It’s hard to remove a specific wrapper from the wrappers stack.
 * 
 * 2. It’s hard to implement a decorator in such a way that its behavior doesn’t
 * depend on the order in the decorators stack.
 * 
 * 3. The initial configuration code of layers might look pretty ugly.
 */
public class Main {

	public static void main(String[] args) {

		Notifier slackFacebookNotifier = new SlackNotifier(new FacebookNotifier(new SimpleNotifier()));
		Notifier emailSlackNotifier = new EmailNotifier(new SlackNotifier(new SimpleNotifier()));

		slackFacebookNotifier.send("Hello John Doe!");
		emailSlackNotifier.send("You received a new assignment.");

	}
}
