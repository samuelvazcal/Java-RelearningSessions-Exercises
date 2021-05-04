package src.com.samuelvazquez.mix.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Employee jim = new Employee("Jim",28,500);
        Employee pam = new Employee("Pam",26,350);
        Employee michael = new Employee("Michael",33,800);
        Employee dwight = new Employee("Dwight",30,450);

        List<Employee> employees = new ArrayList<>();
        employees.add(jim);
        employees.add(pam);
        employees.add(michael);
        employees.add(dwight);

//        sorting via anonymous class implementation

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });


        Collections.sort(employees, Comparator.comparing(Employee::getName));
        //Collections.sort(employees, Comparator.comparing(employee -> employee.getName()));
        //Collections.sort(employees,(e1,e2) -> e1.getName().compareTo(e2.getName()));
        //prints out: Dwight, Jim, Michael, Pam

        //Collections.sort(employees,Comparator.comparing(Employee::getName));

//        ComparatorName comparator = new ComparatorName();

//        Collections.sort(employees);

        printList(employees);

//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        },employees.get(0).getName(),employees.get(1).getName());
//        System.out.println(sillyString);
        UpperConcat uc = (s1,s2) -> s1.toUpperCase() + s2.toUpperCase();
        String sillyString = doStringStuff(uc, employees.get(0).getName(),employees.get(1).getName());
        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }


    public final static String doStringStuff(UpperConcat uc,String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }

    public static void printList(List<Employee> list) {
        for(Employee x : list) {
            System.out.println(x.getName());
        }
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

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
//    public String doSomething() {
//        System.out.println("The AnotherClass's name is: " + getClass().getSimpleName());
//        return Main2.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The anonymous class's name is: " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        },"String1","String2");
//    }

    public String doSomething() {
        UpperConcat uc = (s1,s2) -> {
            System.out.println("The lambda expression's class is: " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        System.out.println("The AnotherClass's name is: " + getClass().getSimpleName());
        return Main2.doStringStuff(uc,"String1","String2");
    }
}

