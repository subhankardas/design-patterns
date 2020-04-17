package behavioral.iterator;

import java.util.Iterator;

public class Watchlist implements Iterable<String> {

	final static int INIT_SIZE = 10;
	final static int GROW_SIZE = 5;

	String[] watch;
	int index;

	public Watchlist() {
		watch = new String[INIT_SIZE];
		index = 0;
	}

	public void add(String name) {
		if (index == watch.length) {
			String[] watchNext = new String[watch.length + GROW_SIZE];
			System.arraycopy(watch, 0, watchNext, 0, watch.length);
			watch = watchNext;
			watchNext = null;
		}
		watch[index] = name;
		index++;
	}

	@Override
	public Iterator<String> iterator() {
		return new WatchIterator(watch);
	}

}
