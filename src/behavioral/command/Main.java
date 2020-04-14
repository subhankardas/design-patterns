package behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * COMMAND PATTERN
 * 
 * Encapsulates request as an object. Decouples sender from processor. Sometimes
 * may depend on other patterns. Useful when UNDO functionality needs to be
 * implemented.
 * 
 * Use Case:
 * 
 * Invoker (Printer) -> Command (Print) -> Receiver (Document)
 * 
 * 
 * Invoker: Simply executes a command
 * 
 * Command: Performs logic operations
 * 
 * Receiver: Performs the action
 * 
 * Ex.: Runnable
 *
 */
public class Main {

	public static void main(String[] args) {
		// Create the receiver
		Document document1 = new Document("This file contains text!");
		Document document2 = new Document("This file contains numbers!");

		// Create the command that invokes the receiver i.e command -> receiver
		Print print = new Print(document1);

		// Create the invoker that executes the command i.e invoker -> command
		Printer printer = new Printer();

		// Execute the command
		printer.executeCommand(print);

		// --- MACRO COMMAND --- //
		// Create list of documents
		List<Document> documents = new ArrayList<>();
		documents.add(document1);
		documents.add(document2);

		// Execute macro command that executes multiple commands
		MacroPrint mprint = new MacroPrint(documents);
		printer.executeCommand(mprint);
	}

}
