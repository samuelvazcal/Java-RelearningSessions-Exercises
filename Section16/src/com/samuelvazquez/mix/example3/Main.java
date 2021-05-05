package src.com.samuelvazquez.mix.example3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Main {
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

//        System.out.println("Employees over 30");
//        System.out.println("==================");
//        employees.forEach(e -> {
//            if(e.getAge() > 30) {
//                System.out.println(e.getName() + " " + e.getAge());
//            }
//        });
//
//        System.out.println("\nEmployees 30 and younger");
//        System.out.println("==================");
//        employees.forEach(e -> {
//            if(e.getAge() <= 30) {
//                System.out.println(e.getName() + " " + e.getAge());
//            }
//        });

        Predicate<Employee> condition1 = e -> e.getAge() > 30;
        Predicate<Employee> condition2 = e -> e.getAge() <= 30;

        printEmployeesByAge(employees,"Older than 30",condition1);
        System.out.println();
        printEmployeesByAge(employees,"30 or younger",condition2);
        System.out.println();
        printEmployeesByAge(employees, "Younger than 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() <= 25;
            }
        });
    }

    public static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        System.out.println("==================");
        employees.forEach(e -> {
            if(ageCondition.test(e)) {
                System.out.println(e.getName() + " " + e.getAge());
            }
        });
    }

    public static void printList(List<Employee> list) {
        for(Employee x : list) {
            System.out.println(x.getName());
        }
    }
}





