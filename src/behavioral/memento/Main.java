package behavioral.memento;

/**
 * MEMENTO PATTERN
 * 
 * This pattern is used to store and revert state of an object. The rollback
 * functionality is a general implementation of memento pattern.
 * 
 * ORIGINATOR ---> MEMENTO <--- CARETAKER
 * 
 * CONS:
 * 
 * 1. Can be expensive if the memento object is large in size.
 * 
 * 2. Requires regular deletion or limit of the history.
 * 
 * 3. May risk exposing state.
 * 
 */
public class Main {

	public static void main(String[] args) {

		PostCaretaker caretaker = new PostCaretaker();

		// Save new post
		Post post = new Post(123, "Latest Update!!", "Java version 8 released today!");
		caretaker.save(post);

		System.out.println("---  SAVED  --- \n");
		System.out.println(post);

		// Change post
		post.setTitle("Late Update :(");
		post.setContent("Java version 9 released yesterday!");

		System.out.println("--- CHANGE  --- \n");
		System.out.println(post);

		// Revert changes
		caretaker.undo(post);

		System.out.println("---  UNDO   --- \n");
		System.out.println(post);

	}

}
