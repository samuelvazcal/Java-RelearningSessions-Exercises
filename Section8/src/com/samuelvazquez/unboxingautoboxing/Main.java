package com.samuelvazquez.unboxingautoboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int [] intArray = new int [10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
         for(int i = 0; i<=10; i++) {
             intArrayList.add(i);
         }

        System.out.println(intArrayList.toString());
    }
}
