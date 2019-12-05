package chapter7_adapter.iterate_enumerate;

import java.util.*;

public class IteratorEnumerationTestDrive {
	public static void main (String args[]) {
		List<Integer> list = Arrays.asList(1, 56, 84, 152, 6, 973);

		Enumeration enumeration = new IteratorEnumeration(list.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
