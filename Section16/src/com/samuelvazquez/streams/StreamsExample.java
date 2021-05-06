package src.com.samuelvazquez.streams;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2,3,4,5,6,7,8,9);
        //identity is the value of the accumulator (accumulates iterations)
        //i - result, j - element, at the end result will be return (20 for this example)
        int even = myList.stream().filter(x -> x%2 == 0).reduce(0,(i,j) -> i+j);
        //int even = myList.stream().filter(x -> x%2 == 0).reduce(0, Integer::sum);

        System.out.println(even);
    }
}
