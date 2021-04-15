package com.samuelvazquez.sortarrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int lengthArray = 0;
        System.out.println("Type the length of the array: ");
        lengthArray = scanner.nextInt();
        int [] array = getArray(lengthArray);
        printArray(array);
        sortArray1(array);
    }

    public static int[] getArray(int number) {
        int [] array = new int[number];
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static void printArray(int [] array) {
        for(int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void sortArray1(int [] array) {
        int [] sortedArray = array;
        for(int i = array.length-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(sortedArray[j] > sortedArray[j+1]) {
                    int temp = sortedArray[j+1];
                    sortedArray[j+1] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        printArray(array);
    }

    public static void sortArray(int [] array) {
        Arrays.sort(array);
        for(int x: array) {
            System.out.print(x + " ");
        }
    }

}
