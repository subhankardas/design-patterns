package behavioral.template;

public class ImageProcessor extends FileProcessor {

	private String filename;

	public ImageProcessor(String filename) {
		this.filename = filename;
	}

	@Override
	public void open() {
		System.out.println("Opening " + filename);
	}

	@Override
	public void read() {
		System.out.println("Displaying " + filename + " on screen");
	}

	@Override
	public void close() {
		System.out.println("Closing " + filename);
	}

}
