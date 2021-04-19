package com.samuelvazquez.generics.iterable;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Armoury implements Iterable<Suit> {
	private List<Suit> list = null;

	public Armoury() {
		list = new LinkedList<>();
		list.add(new Suit("HOTROD", 22));
		list.add(new Suit("SILVER CENTURION", 33));
		list.add(new Suit("SOUTHPAW", 34));
		list.add(new Suit("HULKBUSTER 2.0", 48));
		list.add(new Suit("MEXICAN REVOLVER 1.0", 55));
		list.add(new Suit("RED SNAKE 1.0", 64));
		list.add(new Suit("ZARAPE BUSTER 1.0", 70));
		list.add(new Suit("TACO KILLER 1.0", 72));
	}

	//overwritten method, it will create a new instance containing the elements
	//of the collection called 'list'
	@Override
	public Iterator<Suit> iterator() {
		return new CustomIterator<Suit>(list);
	}

	// Custom Iterator
	// Generic class E since we do not need to specify an exact class
	public class CustomIterator<E> implements Iterator<E> {

		// index to avoid out of bounds
		int indexPosition = 0;

		// We will iterate through the collection as a List
		List<E> internalList;
		public CustomIterator(List<E> internalList) {
			this.internalList = internalList;
		}

		// avoiding out of bounds with +1 condition
		public boolean hasNext() {
			if (internalList.size() >= indexPosition +1) {
				return true;
			}
			return false;
		}

		// This is our custom .next() method
		public E next() {
			E val = internalList.get(indexPosition);

			// indexPosition +=2" skips every second element in a collection.
			indexPosition += 2;
			return val;
		}
		// In this example we do not need a .remove() method, but it can also be
		// written if required
	}
}
