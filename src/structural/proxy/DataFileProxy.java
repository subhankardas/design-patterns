package structural.proxy;

/**
 * Proxy class with the same interface as an original service object. This
 * creates a real service object and delegates all the work to it. The process()
 * implements all four types of proxy functions i.e. security, lazy loading,
 * remote access and housekeeping.
 */
public class DataFileProxy implements ExpensiveProcess {

	private final String filename;
	private static DataFile file; // Only single instance exists in a proxy

	public DataFileProxy(String filename) {
		this.filename = filename;
	}

	@Override
	public void process() {
		// 1. Protection proxy - adds security logic to object creation/access
		if (filename.contains(".exe")) {
			throw new RuntimeException("Unsupported file type.");
		}

		// 2. Virtual proxy - delays creation of expensive objects until required
		else if (file == null) {
			file = new DataFile(filename);
		}

		// 3. Remote proxy - delegates communication with real object
		file.process();

		// 4. Smart proxy - performs additional housekeeping work on access
		file.close();
	}

}
