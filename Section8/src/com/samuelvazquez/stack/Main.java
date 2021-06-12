package com.samuelvazquez.stack;

import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.add("First");
        st.add("Second");
        st.add("Third");
        st.add("Fourth");
        st.add("Fifth");

        Iterator<String> it = st.iterator();
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }

        System.out.println();

        st.pop();

        it = st.iterator();
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }

    }
}
