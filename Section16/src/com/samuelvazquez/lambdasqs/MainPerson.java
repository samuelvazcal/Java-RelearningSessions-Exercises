package src.com.samuelvazquez.lambdasqs;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        List<Person> personList = Person.createShortList();

        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getFirstName().compareTo(p2.getFirstName());
            }
        });

        System.out.println("=== Sorted Asc First Name");
        personList.forEach(System.out::println);

        //Use lambda instead
        personList.sort(Comparator.comparing(Person::getemail));
        System.out.println("=== Sorted Asc eMail");
        personList.forEach(System.out::println);

        //another example
        personList.sort(Comparator.comparing(Person::getAge));
        //personList.sort(Comparator.comparing(Person::getAge));
        System.out.println("=== Sorted Asc age");
        personList.forEach(System.out::println);


    }
}
