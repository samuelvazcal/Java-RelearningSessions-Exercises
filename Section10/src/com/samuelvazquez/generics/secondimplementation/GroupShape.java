package com.samuelvazquez.generics.secondimplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class GroupShape<T extends Shape> implements Iterable<T>{
	private ArrayList<T> elements = new ArrayList<T>();
	private String name;

	public int getSize() {
		return elements.size();
	}

	public GroupShape(String name) {
		this.name = name;
	}

	public boolean addFigure(T shape) {
		if(elements.contains(shape)) {
			System.out.println(("It's already on this group"));
			return false;
		} else {
			elements.add(shape);
			System.out.println(("Added to the group "));
			return true;
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<T>(elements);
	}

	public class MyIterator<T> implements Iterator<T> {

		int indexPosition = 0;

		List<T> internalList;
		public MyIterator(List<T> internalList) {
			this.internalList = internalList;
		}

		public boolean hasNext() {
			if (internalList.size() >= indexPosition +1) {
				return true;
			}
			return false;
		}

		public T next() {
			T val = internalList.get(indexPosition);

			// indexPosition +=2" skips every second element in a collection.
			indexPosition += 1;
			return val;
		}
	}
}
