package src.com.samuelvazquez.mix.example1;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            //anonymous class defined inside constructor definition
            @Override
            public void run() {
                System.out.println("Hello from point A");
            }
        });

        Thread myThread2 = new Thread(() -> System.out.println("Hello from point B"));

        myThread.start();
        myThread2.start();
    }
}
