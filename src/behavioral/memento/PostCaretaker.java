package behavioral.memento;

import java.util.Stack;

public class PostCaretaker {

	private Stack<PostMemento> postHistory = new Stack<>();

	public void save(Post post) {
		postHistory.push(post.save());
	}

	public void undo(Post post) {
		post.undo(postHistory.pop());
	}

}
