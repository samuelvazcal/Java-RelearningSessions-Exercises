package src.com.samuelvazquez.lambdas.example5;

import java.util.Collections;

public class MainMethodReference3 {
    public static void main(String[] args) {
        //lambda expression referencing a constructor of a class
        Factory factory = value -> new String(value);
        char [] val = {'a','b','c','d'};
        System.out.println(factory.create(val));

        //lambda expression in method reference mode
        Factory factory1 = String::new;
        char[] val2 = {'w','x','y','z'};
        System.out.println(factory1.create(val2));
    }
}

// interface definition, create() method matches the signature of one of the constructors in the String class.
// therefore this constructor can be used as a lambda (line 5)
interface Factory {
    public String create(char[] val);
}
