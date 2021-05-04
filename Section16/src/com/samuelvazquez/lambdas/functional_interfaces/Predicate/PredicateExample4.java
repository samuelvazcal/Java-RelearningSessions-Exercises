package src.com.samuelvazquez.lambdas.functional_interfaces.Predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateExample4 {
    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length()>10;
        }
    };

    public static Predicate<String> hasLengthOf10Lambda = s -> s.length()>10;

    public static void predicate_and() {
        Predicate<String> nonNullPredicate = Objects::nonNull;
        //Predicate<String> nonNullPredicate2 = obj -> Objects.nonNull(obj);
        String nullString = null;

        boolean outcome = nonNullPredicate.and(hasLengthOf10Lambda).test(nullString);
        System.out.println(outcome);

        String lengthGTThan10 = "Welcome to the machine";
        boolean outcome2 = hasLengthOf10.and(nonNullPredicate).test(lengthGTThan10);
        System.out.println(outcome2);
    }
    public static void main(String[] args) {
        predicate_and();
    }
}
