package src.com.samuelvazquez.methodreference;

public class InstanceMethodReference2 {

    public void printMsg() {
        System.out.println("Hello, this is instance method");
    }

    public static void main(String[] args) {
        //Runnable runnable = () -> System.out.println("runnable running!");
        //new Thread(runnable).start();
        Thread t2 = new Thread(new InstanceMethodReference2()::printMsg);
        t2.start();
    }
}
