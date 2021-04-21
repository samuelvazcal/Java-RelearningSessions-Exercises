package com.samuelvazquez.binarysearch.arrays;

import java.util.Arrays;
import java.util.Collections;


public class arrays {
	public static void main(String[] args) {
		int [] intArray = {1,8,4,7,30,12,27};
		double [] doubleArray = {1.7, 4.8, 2.8,11.7,25.1,8.6,18.9};
		char [] charArray = {'a','n','b','y','s','v','c'};
		Integer [] objectArray = {8,27,64,125,256};

		Arrays.sort(intArray);
		Arrays.sort(doubleArray);
		Arrays.sort(charArray);
		Arrays.sort(objectArray);

		System.out.println("After sorting process");
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(doubleArray));
		System.out.println(Arrays.toString(charArray));
		System.out.println(Arrays.toString(objectArray));


		int intKey = 7;
		double doubleKey = 25.1;
		char charKey = 'y';

		System.out.println("binary Search working: ");
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArray,intKey));
		System.out.println(doubleKey + " found at index " + Arrays.binarySearch(doubleArray,doubleKey));
		System.out.println(charKey + " found at index " + Arrays.binarySearch(charArray,charKey));

		//sorting object array in descending order
		Arrays.sort(objectArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(objectArray));

		//sorting primitive array in descending order
		reverse(intArray);
		System.out.println(Arrays.toString(intArray));
	}

	public static void reverse(int[] input) {
		int last = input.length - 1;
		int middle = input.length / 2;
		for(int i = 0; i <= middle; i++) {
			int temp = input[i];
			input[i] = input[last-i];
			input[last-i] = temp;
		}
	}
}
