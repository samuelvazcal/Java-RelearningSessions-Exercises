package src.com.samuelvazquez.lambdasqs;


public class Main {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("my thread ");
            }
        });

        myThread.start();

        Thread myThread2 = new Thread() {
            public void run() {
                System.out.println("my thread 2");
            }
        };
        myThread2.start();

        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("my thread 3");
            }
        };

        Thread myThread3 = new Thread(myRunnable);
        myThread3.start();
    }
}
