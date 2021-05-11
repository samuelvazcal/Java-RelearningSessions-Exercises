package src.com.samuelvazquez.optional.examples;

import java.util.Optional;

public class OptionalDemo3 {
    public static void main(String[] args) {
        User userA = new User("Sofia",22200019);
        User userB = new User(null,0);
        String niceName = "Paulina";
        String nephewName = "Camilo";

        //CREATING OPTIONAL INSTANCES

        //an Optional object can contain a value or be empty
        //To create an empty Optional
        Optional<User> emptyUser = Optional.empty();
        //Uncommenting the following line throws a NoSuchElementException exception
        //System.out.println(emptyUser.get());

        //an Optional object can contain a value, there are two methods for that
        //of() --- will throw a NullPointerException if you pass it a null value as an argument
        //For this reason, you should only use of() when you are sure the object is not null
        //Optional<String> stringValueNull = Optional.of(null);
        Optional<String> stringValue = Optional.of("Paulina");
        Optional<String> stringValue2 = Optional.of(nephewName);
        Optional<User> userValue = Optional.of(userA);
        System.out.println(stringValue);

        //If the object can be both null or not-null, then you should choose the ofNullable() method
        Optional<String> stringValue3 = Optional.ofNullable("testing...");
        System.out.println(stringValue2);

        //ACCESSING THE VALUE OF OPTIONAL OBJECTS

        //using the get() method, throws an exception in case the value is null
        //to avoid this exception, you can choose to verify  if a value is present or not
        System.out.println("stringValue2: " + stringValue2.get());
        if(stringValue3.isPresent()) {
            System.out.println("stringValue3: " + stringValue3.get());
        } else {
            System.out.println("stringValue3 is null");
        }
        //Another option for checking the presence of a value is the ifPresent() method.
        //in addition to performing the check, this method also takes a Consumer argument and
        //executes the lambda expression if the object is not empty
        userValue.ifPresent(u -> System.out.println(u.getId()));

        //RETURNING DEFAULT VALUES

        //orElse() returns the value if it's present, or the argument it receives if not
        User userC = null;
        User userD = new User("Angel",22200020);
        User userE = new User("Camila",22200021);
        User userF = new User("Default User",00000000);
        //here the userC object was null, so userD was returned as a default instead
        User result = Optional.ofNullable(userA).orElse(userF);

        System.out.println("TEST1:" + result.getName() + " " + result.getId());

        //orElseGet() behaves in a slightly different manner, the method returns the value if one is present,
        //and if it not it executes the Supplier functional interface that it receives as an argument
        //and returns the result of that execution
        User result2 = Optional.ofNullable(userA).orElseGet(() -> userF);

        System.out.println("TEST2: " + result2.getName() + " " + result2.getId());

        //When the object is empty and the default object is returned instead, there is no difference in behavior
        //between orElse and orElseGet
        //But, when the Optional is not empty, the orElse method will still execute its parameter

        //Returning an Exception
        //orElseThrow() instead of returning an alternate value, throws an exception instead if the object is empty
        User result3 = Optional.ofNullable(userD).orElseThrow(() -> new IllegalArgumentException());
        System.out.println(result3.getName());

        //Transforming values
        User userG = new User("Paulina",22200021);
        Integer id = Optional.ofNullable(userG).flatMap(u -> u.getIdOptional()).orElse(11111111);
        System.out.println(id);
    }

}
