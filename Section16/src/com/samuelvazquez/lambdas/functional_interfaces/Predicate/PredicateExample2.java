package src.com.samuelvazquez.lambdas.functional_interfaces.Predicate;

import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        pred(10, i -> i > 7);
        pred(4, i -> i > 7);
        pred(21, i -> i > 7);
    }

    static void pred(int number, Predicate<Integer> predicate) {
        if(predicate.test(number)) {
            System.out.println("Number " + number + " is greater than 7");
        }else {
            System.out.println("Number " + number + " is less than 7");
        }
    }
}
