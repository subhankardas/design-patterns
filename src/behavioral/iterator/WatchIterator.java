package behavioral.iterator;

import java.util.Iterator;

public class WatchIterator implements Iterator<String> {

	private String[] watch;
	private int index = 0;

	public WatchIterator(String[] watch) {
		this.watch = watch;
	}

	@Override
	public boolean hasNext() {
		return index < watch.length && watch[index] != null;
	}

	@Override
	public String next() {
		return watch[index++];
	}

}
