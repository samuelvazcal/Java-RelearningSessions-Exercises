package src.com.samuelvazquez.optional.examples;

import java.util.Optional;

public class OptionalDemo2 {
    public static void main(String[] args) {
        //creating a String array
        String[] str = new String[5];
        //Setting value for 2nd index
        str[2] = "I have a stomach ache 🤮🤮🤮";
        //It returns a non-empty Optional
        Optional<String> value = Optional.of("I have fever too 🤒!");
        //It returns value of an Optional
        //If value is not present, it throws
        //an NoSuchElementException
        System.out.println(value.get());

        //it returns hashCode of the value
        System.out.println(value.hashCode());

        Optional<String> newValue = Optional.of(str[2]);

        //It returns true if value is present,
        //otherwise false;
        System.out.println(value.isPresent());
        System.out.println(newValue.isPresent());

    }
}
