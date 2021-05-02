package src.com.samuelvazquez.methodreference.types;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

class Person3 {
    private String name;
    private Integer age;

    // Constructor
    public Person3() {
    Random ran = new Random();

    // length is bounded by 7
    byte[] array = new byte[7];
        ran.nextBytes(array);

    // Asigning Random values
    // to name and age
        this.name
            = ran
                    .ints(97, 122 + 1)
                    .limit(7)
                  .collect(StringBuilder::new,
                           StringBuilder::appendCodePoint,
                           StringBuilder::append)
                  .toString();
        this.age = age;
}

    public Integer getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
public class ConstructorMethodReference {

    public static <T> List<T>
    getObjectList(int length, Supplier<T> objectSupply) {
        List<T> list = new ArrayList<>();

        for (int i = 0; i < length; i++)
            list.add(objectSupply.get());
        return list;
    }

    public static void main(String[] args) {
        // Get 10 person by suppliying
        // person supplier, Supplier is
        // created by person constructor
        // reference
        List<Person3> personList
                = getObjectList(5, Person3::new);

        // Print names of personList
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
    }

}
