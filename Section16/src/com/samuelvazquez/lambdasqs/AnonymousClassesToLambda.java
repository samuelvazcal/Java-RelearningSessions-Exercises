package src.com.samuelvazquez.lambdasqs;

public class AnonymousClassesToLambda {
    public static void main(String[] args) {

        System.out.println("Anonymous inner class extending a class");
        Thread myThread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("My thread 1");
            }
        };
        myThread1.start();

        Thread myThread1A = new Thread (() -> System.out.println("My Thread 1A"));
        myThread1A.start();

        System.out.println("Anonymous inner class extending an interface");
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable for my Thread");
            }
        };
        Thread myThread2 = new Thread(myRunnable);
        myThread2.start();

        Runnable myRunnable1A = () -> System.out.println("Another Runnable for my Thread");
        Thread myThread2A = new Thread(myRunnable1A);
        myThread2A.start();

        System.out.println("Anonymous Inner class that defines inside method/constructor argument");
        Thread myThread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("third way to use an anonymous class");
            }
        });
        myThread3.start();

        Thread myThread = new Thread( () -> System.out.println("now using lambda exp."));
        myThread.start();
    }
}
