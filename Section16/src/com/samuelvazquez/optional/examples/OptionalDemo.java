package src.com.samuelvazquez.optional.examples;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
//        String [] words = new String[10];
//        Optional<String> checkNull = Optional.ofNullable(words[5]);
//        if(checkNull.isPresent()) {
//            String word = words[5].toLowerCase();
//            System.out.println(word);
//        } else {
//            System.out.println("word is null");
//        }

        //creating a String array
        String[] str = new String[5];
        //setting value for 2nd index
        str[2] = "Happy Monday";

        //it return an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println("it return an empty instance of Optional class: " + empty);

        //It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);
    }
}
