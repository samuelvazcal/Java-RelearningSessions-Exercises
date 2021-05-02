package src.com.samuelvazquez.methodreference.types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person2 {
    private String name;
    private Integer age;

    //Constructor
    public Person2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

class ComparisonProvider {
    //A method to compare with name
    public int compareByName(Person2 a, Person2 b){
        return a.getName().compareTo(b.getName());
    }
    //A method to compare with age
    public int compareByAge(Person2 a, Person2 b) {
        return a.getAge().compareTo(b.getAge());
    }
}

public class InstanceMethodReference {
    public static void main(String[] args) {
        List<Person2> personList = new ArrayList<>();
        personList.add(new Person2("Samuel", 30));
        personList.add(new Person2("Paulina",4));
        personList.add(new Person2("Sofia",7));
        personList.add(new Person2("Angel",5));

        //A comparator class with multiple comparator methods
        ComparisonProvider comparator = new ComparisonProvider();

        //Use instance method reference to sort array by name
        Collections.sort(personList,comparator::compareByName);

        System.out.println("Sort by name: ");
        personList.stream().map(x -> x.getName()).forEach(System.out::println);
    }
}
