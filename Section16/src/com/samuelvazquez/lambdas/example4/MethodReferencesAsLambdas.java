package src.com.samuelvazquez.lambdas.example4;

public class MethodReferencesAsLambdas {
    public static void main(String[] args) {
        //MyPrinter myPrinter = (s) -> System.out.println(s+ " my friend!");
        //myPrinter.print("Hello there");
        MyPrinter myPrinter = System.out::println;
        myPrinter.print("Hello there");
    }
}

interface MyPrinter {
    void print (String s);
}
