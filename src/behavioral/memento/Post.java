package behavioral.memento;

// Originator
public class Post {

	private int id;
	private String title;
	private String content;

	public Post(int id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "POST    : " + id + "\n" + "TITLE   : " + title + "\n" + "CONTENT : " + content + "\n";
	}

	public PostMemento save() {
		return new PostMemento(title, content);
	}

	public void undo(PostMemento memento) {
		this.title = memento.getTitle();
		this.content = memento.getContent();
	}
	
}
