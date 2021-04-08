package behavioral.template;

public class DocProcessor extends FileProcessor {

	private String filename;

	public DocProcessor(String filename) {
		this.filename = filename;
	}

	@Override
	public void open() {
		System.out.println("Opening " + filename);
	}

	@Override
	public void read() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Reading line no. " + i + " of file " + filename);
		}
	}

	@Override
	public void close() {
		System.out.println("Closing " + filename);
	}

}
