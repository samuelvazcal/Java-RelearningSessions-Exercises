package src.com.samuelvazquez.lambdas.example6;

/*
* Method reference to an instance method of an object
 */
public class MethodReferenceInstanceMethod {
    public static void main(String[] args) {
        //First, we need an instance of the class
        Example example = new Example();

        //lambda expression with method reference
        MyInterface myInterface = example::myMethod;
        //calling the method of functional interface
        myInterface.display();

        System.out.println("~~~~~~~~~~~~~");

        //lambda expression without method reference
        MyInterface myInterface1 = example::myMethod;
        myInterface.display();

    }
}

interface MyInterface {
    void display();
}

// myMethod() has the same signature as display() of the interface. Because of that,
// we can create an instance of Example and reference its method from a lambda expression
class Example {
    public void myMethod() {
        System.out.println("Instance Method");
    }
}
