package src.com.samuelvazquez.streams;

import src.com.samuelvazquez.mix.example3.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMasterExample {
    public static void main(String[] args) {
        List<RichestPeople> list = Arrays.asList(new RichestPeople(1,"Jeff Bezos",177),
                new RichestPeople(2,"Elon Musk",151),
                new RichestPeople(3,"Bernard Arnault & family",150),
                new RichestPeople(4,"Bill Gates",124),
                new RichestPeople(5,"Mark Zuckerberg",97),
                new RichestPeople(6,"Warren Buffet",96),
                new RichestPeople(7,"Larry Ellison",93),
                new RichestPeople(8,"Larry Page",91),
                new RichestPeople(9,"Sergey Brin",89),
                new RichestPeople(10,"Mukesh Ambani",84));

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



    }

}
