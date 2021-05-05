package src.com.samuelvazquez.mix.example3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee jim = new Employee("Jim H.",28,500);
        Employee pam = new Employee("Pam B.",26,350);
        Employee michael = new Employee("Michael S.",33,800);
        Employee dwight = new Employee("Dwight S.",30,450);

        List<Employee> employees = new ArrayList<>();
        employees.add(jim);
        employees.add(pam);
        employees.add(michael);
        employees.add(dwight);

        employees.forEach( e -> {
            System.out.println(e.getName());
            System.out.println(e.getAge());
        });
    }

    public static void printList(List<Employee> list) {
        for(Employee x : list) {
            System.out.println(x.getName());
        }
    }
}





