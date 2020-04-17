package behavioral.iterator;

import java.util.Iterator;

/**
 * ITERATOR PATTERN
 * 
 * Iterator is an implementation that allows to iterate over a collection while
 * hiding the internal technique for navigating the collection. Iterators are
 * FAIL FAST i.e two iterators can modify the collection together without any
 * exception. Enumerators are same as Iterators but FAIL SAFE.
 * 
 * PROS:
 * 
 * 1. Efficient for larger data.
 * 
 * 2. Enables concurrent modification i.e FAIL FAST.
 * 
 * CONS:
 * 
 * 1. No control over index i.e cannot access a specific index and have to
 * iterate over that specific index.
 * 
 * 2. Some implementations are unidirectional navigating only.
 * 
 */
public class Main {

	public static void main(String[] args) {

		// Create collection and add elements
		Watchlist list = new Watchlist();

		list.add("Money Heist");
		list.add("Simpsons");
		list.add("Sherlock");

		// Create an iterator for the collection
		Iterator<String> iterator = list.iterator();

		// Navigating list using Iterator
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}

		System.out.println();

		// Navigating list using for each syntax which uses Iterator internally
		for (String name : list) {
			System.out.println(name);
		}
	}

}
