package src.com.samuelvazquez.streams;

public class RichestPeople {
    private int id;
    private String name;
    private int billions;
    private int age;
    private Foundation foundation;

    public RichestPeople(int id, String name, int billions, int age, Foundation foundation) {
        this.id = id;
        this.name = name;
        this.billions = billions;
        this.age = age;
        this.foundation = foundation;
    }

    public String getName() {
        return name;
    }

    public int getBillions() {
        return billions;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public int salaryIncrement(int increment) {
        billions += increment;
        return billions;
    }

    public int defaultFortune() {
        billions -= 10;
        return billions;
    }

    public double percentageDonations(double d) {
        billions *= d;
        return billions;
    }

    @Override
    public String toString() {
        return "RichestPeople{" + "id: " + id + " name: " + name + " billions: " + billions + ", age: " + age + '}';
    }
}
