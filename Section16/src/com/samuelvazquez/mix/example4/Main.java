package src.com.samuelvazquez.mix.example4;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Random myRandom = new Random();
        Supplier<Integer> mySupplier = () -> myRandom.nextInt(10);

        for(int i = 0; i < 10; i ++) {
            System.out.println(mySupplier.get());
        }
    }
}
