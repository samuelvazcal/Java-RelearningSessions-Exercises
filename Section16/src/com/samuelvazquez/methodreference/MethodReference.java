package src.com.samuelvazquez.methodreference;

public class MethodReference {
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
        //Referring static method:

        //lambda expression
        //Sayable sayable = () -> saySomething();
        //sayable.say();

        //method reference:
        Sayable sayable = MethodReference::saySomething;
        //calling interface method
        sayable.say();
    }
}

interface Sayable {
    void say();
}

