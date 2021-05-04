package src.com.samuelvazquez.lambdas.functional_interfaces.Predicate;

import java.util.function.Predicate;

public class PredicateExample5 {
    public static void main(String[] args) {
        predicate_negate();
    }

    public static void predicate_negate() {
        String lengthGTThan10 = "Today is Thursday and my favorite soccer team will have a match tonight!";
        Predicate<String> myPredicate = s -> s.length()> 10;
        boolean result = hasLengthOf20.and(myPredicate).negate().test(lengthGTThan10);
        System.out.println(result);
    }

    public static Predicate<String> hasLengthOf20 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length()>20;
        }
    };
}
