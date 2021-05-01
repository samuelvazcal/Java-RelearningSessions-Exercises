package src.com.samuelvazquez.lambdas.functional_interfaces.Function;

import java.util.function.Function;

public class FunctionExample {
        static String show(String message) {
            return "Hello" + message;
        }

    public static void main(String[] args) {
        Function<String,String> fun = FunctionExample::show;
    }
}


