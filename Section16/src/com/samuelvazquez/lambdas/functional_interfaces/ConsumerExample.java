package com.samuelvazquez.lambdas.functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerExample {
	public static void main(String[] args) {
		//Consumer to display a number
		Consumer<Integer> display = a -> System.out.println(a);
		//Implement display using accept
		display.accept(10);

		System.out.println("~~~~~~~~~~~~~~~\n");

		//Consumer to multiply 2 to every integer of a list
		Consumer<List<Integer>> modify = list -> {
			int total = 0;
			for(int i = 0; i<list.size();i++) {
				list.set(i,2*list.get(i));
				total += list.get(i);
			}
			System.out.println(total);
		};

		modify.accept(Arrays.asList(1,2,3,4,5,6,7));

		System.out.println("~~~~~~~~~~~~~~~\n");

		//Consumer to display a list of numbers
		Consumer<List<Integer>> dispList = list -> list.forEach(a -> System.out.print(a + " "));

		dispList.accept(Arrays.asList(2,4,6,8,10,12,14,16,18,20));

		System.out.println("\n~~~~~~~~~~~~~~~\n");

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);

		//Implement modify using accept()
		modify.accept(list);

		//Implement dispList using accept()
		dispList.accept(list);

		System.out.println("~~~~~~~~~~~~+");
		modify.andThen(dispList).accept(list);

	}
}
