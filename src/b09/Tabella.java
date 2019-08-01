package b09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class Tabella {
	private ArrayList<Integer> a = new ArrayList<Integer>();

	public void add(int b) {
		a.add(b);
	}

	public boolean check(int b) {
		return a.contains(b);
	}

	public Collection<Integer> getData() {
		ArrayList<Integer> sorted = new ArrayList<Integer>(a);
		sorted.sort(null);
		return sorted;
	}

}
