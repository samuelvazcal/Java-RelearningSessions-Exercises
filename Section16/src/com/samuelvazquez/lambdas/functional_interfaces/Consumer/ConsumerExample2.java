package com.samuelvazquez.lambdas.functional_interfaces.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerExample2 {
	public static void main(String[] args) {

		// Consumer to multiply 2 to every integer of a list
		Consumer<List<Integer>> modify = list -> {
			for(int i = 0; i < list.size();i++) {
				list.set(i,2*list.get(i));
			}
		};

		// Consumer to display a list of integers
		Consumer<List<Integer>> dispList = list -> {
			list.forEach(a -> System.out.print(a + " "));
		};

		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

		// andThen() return a composed Consumer wherein the parameterized
		// Consumer will be executed after the first one
		modify.andThen(dispList).accept(list);
		System.out.println("\n~~~~~~~~~");
		dispList.andThen(modify).accept(list);

	}
}
