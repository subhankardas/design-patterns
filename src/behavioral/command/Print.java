package behavioral.command;

public class Print implements Command {

	Document document;

	public Print(Document document) {
		this.document = document;
	}

	@Override
	public void execute() {
		String content = document.getContent();
		System.out.println("Printing Document -> " + content);
	}

}
