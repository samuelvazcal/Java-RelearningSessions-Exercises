package src.com.samuelvazquez.lambdas.functional_interfaces.Supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        //Supplier that returns a random value between 0 and 1
        Supplier<Double> randomValue = () -> Math.random()*10;

        double value = Math.round(randomValue.get());

        //Print the random value using get
        System.out.println(value);
    }
}
