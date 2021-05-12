package src.com.samuelvazquez.streams;

public class RichestPeople {
    private int id;
    private String name;
    private int billions;
    private Foundation foundation;

    public RichestPeople(int id, String name, int billions, Foundation foundation) {
        this.id = id;
        this.name = name;
        this.billions = billions;
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
        return "RichestPeople{" + "id: " + id + " name: " + name + " billions: " + billions + '}';
    }
}
