package com.samuelvazquez.vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        for(int i = 0; i <= 7; i++) {
            v1.add(i);
        }
        System.out.println(v1);
    }
}
