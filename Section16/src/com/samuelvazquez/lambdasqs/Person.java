package src.com.samuelvazquez.lambdasqs;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private double weight;

    public Person(String firstName, String lastName, int age, double weight, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.email = email;
    }

    public static List<Person> createShortList() {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("Elliot","Alderson",30,74.7,"ell10t@mail.com");
        Person person2 = new Person("Tyrell","Wellick",33,78.2,"tyr3ll@mail.com");
        Person person3 = new Person("Angela","Moss",28,61.1,"4ng3ll4@mail.com");
        Person person4 = new Person("Dominique","DiPierro",32,62.2,"d0m1n1qu3@mail.com");
        Person person5 = new Person("Darlene","Alderson",29,63.3,"d4rl3n3@mail.com");
        Person person6 = new Person("Phillip","Price",60,75.2,"ph1ll1p@mail.com");
        Person person7 = new Person("Shayla","Nico",31,61.9,"sh4yl4@mail.com");
        Person person8 = new Person("Joanna","Wellick",33,64.2,"j0ann4@mail.com");
        Person person9 = new Person("Zhang","Whiterose",45,72.4,"zh4ng@mail.com");
        Person person10 = new Person("Fernando","Vera",35, 73.7,"f3rn4nd0@mail.com");
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person6);
        list.add(person7);
        list.add(person8);
        list.add(person9);
        list.add(person10);
        return list;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person  " +
                "firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", age: " + age +
                ", email: '" + email + '\'' +
                '}';
    }
}
