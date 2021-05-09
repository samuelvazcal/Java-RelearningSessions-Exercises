package src.com.samuelvazquez.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainExample {
    public static void main(String[] args) {

        //create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5);

        //demonstration of map method
        List<Integer> square = number.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(square);

        //create a list of Strings
        List<String> names =
                Arrays.asList("Eddard Stark","John Snow","Daenerys Targaryen",
                        "Sansa Stark","Tyrion Lannister","Stannis Baratheon");

        //demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        //List<String> result =
                names.stream().filter(s -> s.startsWith("S")).map(s -> s + "***").collect(Collectors.toList());
        System.out.println(result);

        List<String> sortedResult = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedResult);

        //create a list of Integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,2);

        //collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(i -> i*i).collect(Collectors.toSet());
        System.out.println(squareSet);

        //demonstration of forEach method
        numbers.stream().forEach(x -> System.out.print(x*x + " "));

        //demonstration of reduce method
        int even = numbers.stream().filter(x -> x%2==0).reduce(0,(acum,i) -> i+acum);
        //int even = numbers.stream().reduce(0,Integer::sum);
        System.out.println("\n" + even);
    }
}
