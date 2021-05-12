package src.com.samuelvazquez.lambdas.functional_interfaces.FlatMap;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Pedro");
        Trip v = new Trip("Colombia");
        Trip v2 = new Trip("USA");
        p.addTrip(v);
        p.addTrip(v2);
        Person p2 = new Person("Emilia");
        Trip v3 = new Trip("Italy");
        Trip v4 = new Trip("Switzerland");
        p2.addTrip(v3);
        p2.addTrip(v4);
        List<Person> list = new ArrayList<>();
        list.add(p);
        list.add(p2);
        for(Person person : list) {
            for(Trip trip : person.getList()) {
                System.out.println(trip.getCountry());
            }
        }

        List<String> mapList = list.stream().map(ppp -> ppp.getName()).collect(Collectors.toList());
        System.out.println(mapList);

//        list.stream().map(ppp -> ppp.getName()).forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//
//            }
//        });

        list.stream().map(ppp2 -> ppp2.getList()).flatMap(Collection::stream).map(ttt2 -> ttt2.getCountry()).forEach(System.out::println);
    }
}


























