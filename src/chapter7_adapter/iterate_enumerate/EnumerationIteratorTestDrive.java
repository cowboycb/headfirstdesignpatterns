package chapter7_adapter.iterate_enumerate;

import java.util.*;

public class EnumerationIteratorTestDrive {
	public static void main (String[] args) {

		List<Integer> list = Arrays.asList(1, 56, 84, 152, 6, 973);
		Vector v = new Vector(list);
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
