package behavioral.memento;

// Memento
public class PostMemento {

	private String title;
	private String content;

	public PostMemento(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

}
