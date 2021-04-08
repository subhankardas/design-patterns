package behavioral.template;

/**
 * Template method design pattern is to define an algorithm as a skeleton of
 * operations and leave the details to be implemented by the child classes. The
 * overall structure and sequence of the algorithm is preserved by the parent
 * class. This pattern is used to implement IoC containers.
 * 
 * We have a preset structure method called template method which consists of
 * steps. This steps can be an abstract method which will be implemented by its
 * subclasses.
 * 
 * ABSTRACT BASE <--- CONCRETE CLASS
 * 
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Image File:");
		FileProcessor image = new ImageProcessor("boat.jpeg");
		image.process();

		System.out.println();

		System.out.println("Text File:");
		FileProcessor file = new DocProcessor("report.txt");
		file.process();
	}

}
