package com.samuelvazquez.listitterator;

import java.util.*;


public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		LinkedList<String> flowerList = new LinkedList<String>();
		flowerList.add("Rose");
		flowerList.add("Lily");
		flowerList.add(2,"Tulip");
		flowerList.add("Sunflower");
		flowerList.add("Violet");
		flowerList.add("Iris");
		flowerList.add("Carnation");

		printList(flowerList);
		printListBackwards(flowerList);
		printListUsingIndexes(flowerList);
		System.out.println("Type the flower to delete:");
		String elementToDelete = scanner.nextLine();
		removeItem(flowerList,elementToDelete);
		printList(flowerList);

	}

	public static void printList(LinkedList<String> list) {
		int count = 1;
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(count + ". " + it.next());
			count++;
		}
		System.out.println("******************");
	}

	public static void printListBackwards(LinkedList<String> list) {
		int count = 1;
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()) {
			System.out.println(count + ". " + it.next());
			count++;
		}
		System.out.println("---------------------");
		while(it.hasPrevious()) {
			System.out.println(count-1 + ". " + it.previous());
			count--;
		}
		System.out.println("---------------------");
	}

	//using previousIndex and nextIndex
	public static void printListUsingIndexes(LinkedList<String> list) {
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.nextIndex()+1 + ". " + it.next());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		while(it.hasPrevious()) {
			System.out.println(it.previousIndex()+1 + ". " + it.previous());
		}
	}

	public static void removeItem(LinkedList<String> list, String element) {
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()) {
			String value = it.next().toLowerCase();
			if(value.equals(element.toLowerCase())) {
				it.remove();
			}
		}
	}
}



















