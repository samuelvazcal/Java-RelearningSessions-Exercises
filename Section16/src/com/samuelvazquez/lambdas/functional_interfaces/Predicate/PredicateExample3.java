package src.com.samuelvazquez.lambdas.functional_interfaces.Predicate;

import java.util.function.Predicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        predicate_or();
    }

    public static void predicate_or() {
        Predicate<String> hasLengthOf10B = s -> s.length() > 10;
        Predicate<String> containsLetterA = s -> s.contains("A");
        String inputString = "SAMUEL";
        boolean outcome1 = hasLengthOf10B.or(containsLetterA).test(inputString);
        boolean outcome2 = hasLengthOf10A.or(containsLetterA).test(inputString);
        System.out.println(outcome1);
        System.out.println(outcome2);
    }

    public static Predicate<String> hasLengthOf10A = new Predicate<String>() {
        @Override
        public boolean test(String t) {
            return t.length() > 10;
        }
    };

    // lambda expression version from the above anonymous class
    // public static Predicate<String> hasLengthOf10 = s -> s.length() > 10; ;

}
