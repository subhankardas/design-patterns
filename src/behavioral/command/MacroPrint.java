package behavioral.command;

import java.util.List;

public class MacroPrint implements Command {

	List<Document> documents;

	public MacroPrint(List<Document> documents) {
		this.documents = documents;
	}

	@Override
	public void execute() {
		System.out.println("Executing Macro   ->");
		documents.forEach(document -> {
			String content = document.getContent();
			System.out.println("Printing Document -> " + content);
		});
	}

}
