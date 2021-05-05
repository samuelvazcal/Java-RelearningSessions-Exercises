package src.com.samuelvazquez.mix.example4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) {
        Employee jim = new Employee("Jim H.",28,500);
        Employee pam = new Employee("Pam B.",26,350);
        Employee michael = new Employee("Michael S.",33,800);
        Employee dwight = new Employee("Dwight S.",31,600);
        Employee oscar = new Employee("Oscar M.",32,400);
        Employee phyllis = new Employee("Phyllis S.", 33,520);
        Employee ellie = new Employee("Ellie K.",25,350);

        List<Employee> employees = new ArrayList<>();
        employees.add(jim);
        employees.add(pam);
        employees.add(michael);
        employees.add(dwight);
        employees.add(oscar);
        employees.add(phyllis);
        employees.add(ellie);

        Function<Employee,String> getLastName = e -> {
            return e.getName().substring(e.getName().indexOf(' ') + 1);
        };

        Function<Employee, String> getFirstName = e -> {
            return e.getName().substring(0,e.getName().indexOf(' '));
        };

        String lastName = getLastName.apply(employees.get(2));
        System.out.println(lastName);

        Random random1 = new Random();
        for(Employee e : employees) {
            if(random1.nextBoolean()) {
                System.out.println(getAName(getFirstName,e));
            } else {
                System.out.println(getAName(getLastName,e));
            }
        }
    }

    private static String getAName(Function <Employee,String> getName, Employee employee) {
        return getName.apply(employee);
    }
}

class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.getSalary(), o.getSalary());
    }
}
