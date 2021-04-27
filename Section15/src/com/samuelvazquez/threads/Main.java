package com.samuelvazquez.threads;

import static com.samuelvazquez.threads.ThreadColor.*;


public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        //There are two ways to create a thread
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class thread");
            }
        }.start();

        //Java Class Implements Runnable
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Runnable implementation via Anonymous class");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "AnotherThread terminated or timed out, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        }).start();

        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");


        // A Pro way to create a thread
        //(new AnotherThread()).start();
    }
}
