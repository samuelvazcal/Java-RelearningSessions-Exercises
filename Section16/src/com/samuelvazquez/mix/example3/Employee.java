package src.com.samuelvazquez.mix.example3;

public class Employee implements Comparable<Employee>{
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
