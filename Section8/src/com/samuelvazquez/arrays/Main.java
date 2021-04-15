package com.samuelvazquez.arrays;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = new int[4];
        int [] array2 = {1,2,3,4,5,6,7};

        System.out.println("Type the length of the array: ");
        int length = scanner.nextInt();
        int [] array3 = getArray(length);
        printArray(array3);
        getAverage(array3);
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

    public static void getAverage(int [] array) {
        int sum = 0;
        double avg;
        for(int x : array) {
            sum += x;
        }
        avg = (double) sum/array.length;
        System.out.println("Sum is: " + sum);
        System.out.println("Avg is: " + String.format("%.3f",avg));
    }
}