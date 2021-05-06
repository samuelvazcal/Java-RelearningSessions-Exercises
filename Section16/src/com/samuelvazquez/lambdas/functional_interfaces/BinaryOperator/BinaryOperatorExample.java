package src.com.samuelvazquez.lambdas.functional_interfaces.BinaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> op = BinaryOperator.maxBy(Integer::compareTo);
        //BinaryOperator<Integer> op = BinaryOperator.maxBy((a,b) -> a.compareTo(b));
        int result = op.apply(7,8);
        System.out.println(result);

        BinaryOperator<Integer> op2 = BinaryOperator.minBy(Integer::compareTo);
        int result2 = op2.apply(7,8);
        System.out.println(result2);
    }
}
