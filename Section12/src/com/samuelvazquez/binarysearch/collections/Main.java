package com.samuelvazquez.binarysearch.collections;

import java.util.*;


public class Main {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(7);
		list1.add(18);
		list1.add(4);
		list1.add(15);

		List<Domain> list2 = new ArrayList<Domain>();
		list2.add(new Domain(1,"www.nowhere.com"));
		list2.add(new Domain(2,"twoplustwo.com"));
		list2.add(new Domain(7,"learningJava.io"));
		list2.add(new Domain(8,"www.6pm-yeah.com"));
		list2.add(new Domain(10,"TodayisTuesday.net"));

		Comparator<Domain> c = new Comparator<Domain>() {
			public int compare(Domain u1, Domain u2) {
				return u1.getId().compareTo(u2.getId());
			}
		};

		//System.out.println(Arrays.toString(list2.toArray()));

		int index = Collections.binarySearch(list2,new Domain(8, null),c);
		System.out.println("Found at index ***" + index);

		Collections.sort(list1);

		System.out.println(Arrays.toString(list1.toArray()));

		//Testing purposes
		//sorting collection in descending order
		//Collections.sort(list1, Collections.reverseOrder());
		//printing out collection
		//System.out.println(Arrays.toString(list1.toArray()));

		int index1List1 = 7;
		int index2List1 = 10;

		System.out.println(index1List1 + " was found at index " + Collections.binarySearch(list1,index1List1));
		System.out.println(index2List1 + " was found at index " + Collections.binarySearch(list1,index2List1));
	}
}

class Domain {
	private int id;
	private String url;

	//Constructor
	public Domain(int id, String url) {
		this.id = id;
		this.url = url;
	}

	public Integer getId() {
		return id;
	}
}
