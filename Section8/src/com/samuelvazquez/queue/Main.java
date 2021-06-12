package com.samuelvazquez.queue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>();

        pQ.add(10);
        pQ.add(20);
        pQ.add(15);
        pQ.add(7);
        pQ.add(18);
        pQ.add(15);
        //System.out.println(pQ.peek());
        System.out.println(pQ);

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQ.poll());

        // Printing the top element again
        System.out.println(pQ.peek());
    }
}
