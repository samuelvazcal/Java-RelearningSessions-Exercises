package src.com.samuelvazquez.lambdas.functional_interfaces.Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
        static String show(String message) {
            return "Hello" + message;
        }
        static int length(String s) {
            return s.length();
        }

    public static void main(String[] args) {
        Function<String,String> fun = FunctionExample::show;
        String result = fun.apply(" programmer!");
        System.out.println(result);

        Function<String,Integer> fun2 = FunctionExample::length;
        System.out.println("length of the input String: " + fun2.apply("Samuel"));


        // Function which takes in a number
        // and returns half of it
        Function<Integer,Double> half = a -> a / 2.0;
        //apply the function to get the result
        System.out.println(half.apply(7));
    }
}


