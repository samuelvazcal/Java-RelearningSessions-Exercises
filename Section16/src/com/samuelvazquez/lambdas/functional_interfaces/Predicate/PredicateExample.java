package src.com.samuelvazquez.lambdas.functional_interfaces.Predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> lesserthan = i -> (i<18);
        boolean result1 = lesserthan.test(22);
        boolean result2 = lesserthan.test(15);
        System.out.println(result1);
        System.out.println(result2);

        Predicate<Integer> greaterThanTen = i -> i > 10;

        //Creating predicate
        Predicate<Integer> lowerThanTwenty = i -> i < 20;

        boolean result3 = greaterThanTen.and(lowerThanTwenty).test(18);
        System.out.println("result3: " + result3);

        boolean result4 = lowerThanTwenty.and(greaterThanTen).negate().test(18);
        System.out.println("result4: " + result4);

        boolean result5 = lowerThanTwenty.or(greaterThanTen).test(25);
        System.out.println("result5: " + result5);
    }
}
