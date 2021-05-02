package src.com.samuelvazquez.methodreference.types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceMethodArbitraryObject {
    public static void main(String[] args) {
        List<String> personList = new ArrayList<>();

        personList.add("Paulina");
        personList.add("Sofia");
        personList.add("Angel");

        Collections.sort(personList,String::compareToIgnoreCase);
        personList.forEach(System.out::println);
    }
}
