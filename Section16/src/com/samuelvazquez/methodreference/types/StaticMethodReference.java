package src.com.samuelvazquez.methodreference.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//showing how to use
//static method reference to sort with custom comparator
class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
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

public class StaticMethodReference {
    public static int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    public static int compareByAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Samuel", 30));
        personList.add(new Person("Paulina",4));
        personList.add(new Person("Sofia",7));
        personList.add(new Person("Angel",5));

        Collections.sort(personList,StaticMethodReference::compareByName);
        System.out.println("Sort by name: ");
        personList.stream().map(Person::getName).forEach(System.out::println);

    }
}
