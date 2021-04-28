package com.samuelvazquez.lambdas.functional_interfaces.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerExample3 {
	public static void main(String[] args) {
		Consumer<String> message = msg -> System.out.println(msg);
		message.accept("Mexico");
		//System.out.println("----------------");
		Consumer<List<String>> compList = list -> {
			for(int i = 0; i < list.size(); i++) {
				//System.out.println((i+1) + " " + list.get(i));
				list.set(i,i+ " " + list.get(i));
			}
		};

		Consumer<List<String>> printList = list -> {
			list.forEach(a -> System.out.println(a));
		};

		List<String> theList = new ArrayList<>(Arrays.asList("Michael","Jim","Stanley","Pam"));

		compList.accept(theList);
		printList.accept(theList);

		System.out.println("~~~~~~~~");
		compList.andThen(printList).accept(theList);

	}
}
