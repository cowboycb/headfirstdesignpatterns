package chapter7_adapter.iterate_enumerate;

import java.util.*;

public class EnumerationIterator implements Iterator {
	Enumeration enumeration;
 
	public EnumerationIterator(Enumeration enumeration) {
		this.enumeration = enumeration;
	}
 
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}
 
	public Object next() {
		return enumeration.nextElement();
	}
 
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
