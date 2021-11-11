package structural.proxy;

/**
 * This simulates processing of a data file which is considered an expensive
 * process.
 */
public class DataFile implements ExpensiveProcess {

	private final String filename;

	public DataFile(String filename) {
		this.filename = filename;
		init();
	}

	private void init() {
		System.out.println("Loading file processing heavy configurations.");
	}

	@Override
	public void process() {
		System.out.println("Processing data file [" + filename + "]");
	}

	public void close() {
		System.out.println("Closing file resources.");
	}

}