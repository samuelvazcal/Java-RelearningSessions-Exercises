package src.com.samuelvazquez.lambdas.functional_interfaces.Supplier;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample2 {
    public static void main(String[] args) {
        List<Person> list = Stream.generate(Person::new)
                .limit(100)
                .peek((p) -> p.setName("Unknown"))
                .collect(Collectors.toList());

        for (Person p : list) {
            System.out.println(p.getName());
        }
    }
}


class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
