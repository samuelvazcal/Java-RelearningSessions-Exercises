package src.com.samuelvazquez.streams;

public class RichestPeople {
    private int id;
    private String name;
    private int billions;

    public RichestPeople(int id, String name, int billions) {
        this.name = name;
        this.billions = billions;
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

    public int salaryIncrement(int increment) {
        billions += increment;
        return billions;
    }
}
