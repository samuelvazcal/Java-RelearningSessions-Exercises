package src.com.samuelvazquez.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCourse {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList("N40","N36","B12","B6","G53","G49","G60","G50","g64","I26","I17","I29","O71");
        someBingoNumbers.stream().forEach(number -> {
            if(number.toUpperCase().startsWith("G")) {
                System.out.print(number + " ");
            }
        });
//        List<String> result = someBingoNumbers.stream().filter(s -> s.startsWith("G")).collect(Collectors.toList());
//        System.out.println(result);

        System.out.println("\nSorting the list:");
//        List<String> sortedList =
//                someBingoNumbers.stream().filter(s -> s.toUpperCase().startsWith("G")).sorted().collect(Collectors.toList());
//        System.out.println(sortedList);
        List<String> sortedList =
                someBingoNumbers.stream().map(String::toUpperCase).filter(s -> s.startsWith("G")).collect(Collectors.toList());
        System.out.println(sortedList);

        Stream<String> ioNumberStream = Stream.of("I26","I17","I29","O71");
        Stream<String> inNumberStream = Stream.of("N40","N36","I26","I17","I29","O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream,inNumberStream);
        System.out.println("==========================");
        System.out.println(concatStream.distinct().peek(System.out::println).count());
    }
}
