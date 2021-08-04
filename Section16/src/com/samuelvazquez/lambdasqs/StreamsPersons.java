package src.com.samuelvazquez.lambdasqs;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPersons {
    public static void main(String[] args) {
        List<Person> list = Person.createShortList();

        // INTERMEDIATE OPERATIONS

        // map
        System.out.println("Ascending order:");
        List<String> nameListA =
                list.stream().map(Person::getFirstName).collect(Collectors.toList());
        nameListA.forEach(System.out::println);

        System.out.println("\nDescending order:");
        List<String> nameListB =
                list.stream().map(Person::getFirstName).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        nameListB.forEach(System.out::println);

        System.out.println("\nFiltering, name with length greater than 5 characters");
        List<String> nameListC = list.stream().map(Person::getFirstName).filter(x -> x.length()>5).sorted().collect(Collectors.toList());
        nameListC.forEach(System.out::println);

        System.out.println("\nThe 5 youngest people of the main list");
        List<Person> personListA =
                list.stream().sorted(Comparator.comparing(Person::getAge)).limit(5).collect(Collectors.toList());
        personListA.forEach(System.out::println);

        System.out.println("\nIf exists, print a person's name that starts with S");
        boolean exists = list.stream().anyMatch(s -> s.getFirstName().startsWith("S"));
        System.out.println("Does exists a name that start with S: " + exists);

        System.out.println("\nPrint it out!");
        List<Person> targetPerson =
                list.stream().filter(s -> s.getFirstName().startsWith("S")).collect(Collectors.toList());
        targetPerson.forEach(System.out::println);

        System.out.println("\nPeople with age between 20 and 30 years old");
        List<Person> personListB = list.stream().filter(x -> x.getAge()> 20 && x.getAge()<30).collect(Collectors.toList());
        personListB.forEach(System.out::println);

        System.out.println("\nYears since they turned 18");
        //List<Person> yearsSince18 = list.stream().map(s -> s.getAge()-18).forEach(System.out::println);
        //list.stream().forEach(s -> System.out.println(s));
        list.forEach(s -> {
            int targetYears = s.getAge() - 18;
            System.out.println(s.getFirstName() + "\t" + targetYears);
        });

        System.out.println("\n Sum of all years");
        int totalYears = list.stream().map(Person::getAge).reduce(0, Integer::sum);
        System.out.println("\nTotal is: " + totalYears);

        System.out.println("\n AVG age");
        OptionalDouble avgYears2 = list.stream().mapToInt(Person::getAge).average();
        if(avgYears2.isPresent()) System.out.println(avgYears2.getAsDouble());
        //System.out.println(avgYears2.getAsDouble());
    }
}
