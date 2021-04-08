package behavioral.template;

/**
 * Abstract base class which ensures a template algorithm implementation.
 */
public abstract class FileProcessor {

	/**
	 * Abstract methods externalize the steps to be implemented by child class.
	 */
	public abstract void open();

	public abstract void read();

	public abstract void close();

	/**
	 * Template method which implements the actual algorithm.
	 */
	public void process() {
		open();
		read();
		close();
	}

}
