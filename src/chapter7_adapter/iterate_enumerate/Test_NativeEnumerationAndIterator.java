package chapter7_adapter.iterate_enumerate;

import java.util.*;

public class Test_NativeEnumerationAndIterator {
	public static void main (String args[]) {
        List<Integer> list = Arrays.asList(1, 56, 84, 152, 6, 973);

		Vector v = new Vector(list);
		Enumeration enumeration = v.elements();
        System.out.println("======= List Enumeration ======");
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		Iterator iterator = v.iterator();
        System.out.println("======= List Iterator ======");
        while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
