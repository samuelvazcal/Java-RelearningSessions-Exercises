package src.com.samuelvazquez.methodreference;

public class InstanceMethodReference  {
    public static void main(String[] args) {
        InstanceMethodReference methodReference = new InstanceMethodReference(); //Creating object
        //lambda notation
        //Sayable2 sayable2 = () -> methodReference.saySomething();
        //sayable2.say();

        //method reference
        Sayable2 sayable2 = methodReference::saySomething;

        //calling interface method
        sayable2.say();

        //referring non-static method using anonymous object
        Sayable2 sayable21 = new InstanceMethodReference()::saySomething;
        sayable21.say();
    }

    public void saySomething() {
        System.out.println("Hello, this is non-static method.");
    }
}

interface Sayable2 {
    void say();
}
