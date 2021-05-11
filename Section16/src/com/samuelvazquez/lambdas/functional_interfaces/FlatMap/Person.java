package src.com.samuelvazquez.lambdas.functional_interfaces.FlatMap;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Trip> list = new ArrayList<>();

    public void addTrip(Trip t) {
        list.add(t);
    }

    public Person(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Trip> getList() {
        return list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setList(List<Trip> list) {
        this.list = list;
    }
}
