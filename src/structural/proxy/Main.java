package structural.proxy;

/**
 * Proxy pattern allows us to create an intermediary that acts as an interface
 * to another resource, while also hiding the underlying complexity of the
 * component.
 * 
 * A proxy controls access to the original object, allowing you to perform
 * something either before or after the request gets through to the original
 * object.
 * 
 * PROS:
 * 
 * 1. You can control the service object without clients knowing about it.
 * 
 * 2 .You can manage the lifecycle of the service object when clients don’t care
 * about it.
 * 
 * 3. The proxy works even if the service object isn’t ready or is not
 * available.
 * 
 * 4. Open/Closed Principle. You can introduce new proxies without changing the
 * service or clients.
 * 
 * CONS:
 * 
 * 1. The code may become more complicated since you need to introduce a lot of
 * new classes.
 * 
 * 2. The response from the service might get delayed.
 */
public class Main {

	public static void main(String[] args) {

		// Use a proxy to create an expensive process
		ExpensiveProcess file = new DataFileProxy("sample-file.txt");

		// Process it as many times required
		file.process();
		file.process();

	}

}
