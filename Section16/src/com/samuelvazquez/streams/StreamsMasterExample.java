package src.com.samuelvazquez.streams;

import src.com.samuelvazquez.mix.example3.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMasterExample {
    public static void main(String[] args) {
        Foundation[] foundationArray = {new Foundation("Type A"), new Foundation("Type B"), new Foundation("Type C"),
                new Foundation("Type D")};
        List<RichestPeople> list = Arrays.asList(new RichestPeople(1,"Jeff Bezos",177,57,foundationArray[0]),
                new RichestPeople(2,"Elon Musk",151,49,foundationArray[2]),
                new RichestPeople(3,"Bernard Arnault & family",150,72,foundationArray[3]),
                new RichestPeople(4,"Bill Gates",124,65,foundationArray[2]),
                new RichestPeople(5,"Mark Zuckerberg",97,36,foundationArray[3]),
                new RichestPeople(6,"Warren Buffet",96,90,foundationArray[0]),
                new RichestPeople(7,"Larry Ellison",93,76,foundationArray[1]),
                new RichestPeople(8,"Larry Page",91,48,foundationArray[3]),
                new RichestPeople(9,"Sergey Brin",89,47,foundationArray[2]),
                new RichestPeople(10,"Mukesh Ambani",84,64,foundationArray[1]));

        //forEach --- terminal operation
        //loops over the stream elements, calling the supplied function on each element
        list.forEach(rp -> rp.salaryIncrement(10));
        list.forEach(r -> System.out.println(r.getName() + " " + r.getBillions()));

        //map --- intermediate operation
        //produces a new stream after applying a function to each element of the original stream. The new stream
        //it could be of different type
        Integer[] richestPeopleIds = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> newPeopleId = Stream.of(richestPeopleIds).map(x -> x * 100).collect(Collectors.toList());
        System.out.println(newPeopleId);


        //collect --- terminal operation
        //common way to get stuff out of the stream once we are done with all the processing
        List<String> rpList = list.stream().map(RichestPeople::getName).collect(Collectors.toList());

        //filter() --- intermediate operation
        //produces a new stream that contains elements of the original stream that pass a given test
        List<RichestPeople> mT150BEven =
                list.stream().filter(x -> x.getBillions() >= 150).filter(x1 -> x1.getId()%2==0).collect(Collectors.toList());
        System.out.println("More than 150 Billions and even Id: " + mT150BEven.toString());

        System.out.println("People with more than 150 Billions: ");
        List<RichestPeople> moreThan150B =
                list.stream().filter(x -> x.getBillions()>=150).collect(Collectors.toList());
        moreThan150B.forEach(s -> System.out.println(s.getId() + " " + s.getName() + " " + s.getBillions()));

        //findFirst() ---
        //returns an Optional for the first entry in the stream; the Optional can, of curse, be empty:
        RichestPeople findFirst = list.stream().filter(x -> x.getName().contains("Z")).findFirst().orElse(null);
        System.out.println("\nFirst rich person with a Z in name field: " + findFirst.getId() + " " + findFirst.getName() );

        //toArray() ---
        //if we need to get an array out of the stream
        Integer[] array = list.stream().map(r -> r.getName().length()).toArray(Integer[]::new);
        //Integer::new --->  creates an empty array of Integer which is then filled
        System.out.println("Length (qty of words) for every name in the main list");
        for(Integer x : array) {
            System.out.print(x + " ");
        }

        //flatMap ---
        //helps to flatten the data structure in "one dimension" to simplify further operations
        //List<String> foundationList = list.stream().map(x -> x.getFoundation().getText()).collect(Collectors.toList
        // ());
        List<List<String>> namesNested = Arrays.asList(Arrays.asList("Jeff","Bezos"),Arrays.asList("Bill","Gates"),
                Arrays.asList("Mark","Zuckerberg"));
        List<String> namesFlatStream =
                namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList());
        //flatMap coverts Stream<List<String>>to a simpler Stream<String>
        System.out.println("\n" + namesFlatStream);

        //peek --- intermediate operation
        //similar to forEach() (perform multiple operations on each element of the stream) but as a intermediate
        // operation
        System.out.println("using peek:");
        List<RichestPeople> moneyDonated =
                list.stream().peek(RichestPeople::defaultFortune).peek(x1 -> x1.percentageDonations(.1)).collect(Collectors.toList());
        for (RichestPeople x : moneyDonated) {
            System.out.println(x.getId() + " " + x.getName() + ", $ donated (B): " + x.getBillions());
        }

        //xxxmatch() --- terminal operations
        boolean allNameStartsWithX = list.stream().allMatch(a -> a.getName().startsWith("X"));
        boolean anyNameStartsWithX = list.stream().anyMatch(a -> a.getName().startsWith("X"));
        boolean noneNameStartsWithX = list.stream().noneMatch(a -> a.getName().startsWith("X"));
        boolean allNameStartsWithX2 = list.stream().allMatch(a -> a.getName().startsWith("M"));
        boolean anyNameStartsWithX2 = list.stream().anyMatch(a -> a.getName().startsWith("M"));
        boolean noneNameStartsWithX2 = list.stream().noneMatch(a -> a.getName().startsWith("M"));
        System.out.println("Any name starts with X?: " + allNameStartsWithX);
        System.out.println("Any name starts with X?: " + anyNameStartsWithX);
        System.out.println("Any name starts with X?: " + noneNameStartsWithX);
        System.out.println("Any name starts with X2?: " + allNameStartsWithX2);
        System.out.println("Any name starts with X2?: " + anyNameStartsWithX2);
        System.out.println("Any name starts with X2?: " + noneNameStartsWithX2);

        //count() --- terminal operation
        //return the number of elements in the stream as a long value
        long count = list.stream().count();
        System.out.println("Number of elements in the list: " + count);

        //reduce() from Optional --- terminal operation
        //performs a reduction on the elements of the stream. The result is an Optional
        Optional<String> reduceList =
                list.stream().filter(x -> x.getName().startsWith("L")).map(x1 -> x1.getName()).reduce(
                        (x1,x2) -> x1 + "~~" + x2);
        System.out.println("Using reduce operation: " + reduceList.get());

        //sorted()
        //sort the stream elements based on the comparator we passed into it
        System.out.println("Sorting elements by name");
        List<RichestPeople> sortedList = list.stream().sorted(Comparator.comparing(RichestPeople::getName)).collect(Collectors.toList());
        for(RichestPeople x : sortedList) {
            System.out.println(x.getId() + " " + x.getName());
        }

        System.out.println("Sorting people by the length of their name:");
        //list.stream().map(x -> x.getName()).sorted((x1,x2) -> x1.length() - x2.length()).forEach(x3 -> System.out
        // .println(x3));
        list.stream().map(RichestPeople::getName).sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        //min()
        //return the minimum and maximun element in the stream respectively based on a comparator
        //Optional<RichestPeople> youngest = list.stream().min(Comparator"".comparing(RichestPeople::getAge));
        RichestPeople youngest =
                list.stream().min(Comparator.comparing(RichestPeople::getAge)).orElseThrow(NoSuchElementException::new);
        RichestPeople oldest =
                list.stream().max(Comparator.comparing(RichestPeople::getAge)).orElseThrow(NoSuchElementException::new);
        System.out.println(youngest);
        System.out.println(oldest);

        List<Integer> distinctList = list.stream().map(z -> z.getAge()).distinct().collect(Collectors.toList());
        List<String> distinctList2 =
                list.stream().map(z -> z.getName().substring(0,z.getName().indexOf(' '))).distinct().collect(Collectors.toList());
        //displays all the ages, there are not duplicates
        System.out.println(distinctList);
        //it will display Larry only once
        System.out.println(distinctList2);

        //Specialized operations
        //average()
        Integer sumAge = list.stream().map(RichestPeople::getAge).reduce(0,(Integer::sum));
        Double avgAge = list.stream().mapToDouble(x -> x.getAge()).average().orElseThrow(NoSuchElementException::new);
        System.out.println(sumAge);
        System.out.println(avgAge);

        //Infinite streams
        //generate()
        //Stream.generate(Math::random).map(x -> x*10).limit(7).forEach(x -> System.out.println(x.intValue()));
        //generating a list of seven random numbers
        List<Integer> myIntList =
                Stream.generate(Math::random).map(x -> x*10).limit(7).map(Double::intValue).collect(Collectors.toList());
        System.out.println(myIntList);

        //iterate()
        List<Integer> evenNumbers = Stream.iterate(2,i -> i+2).limit(10).collect(Collectors.toList());
        System.out.println(evenNumbers);

    }


}
