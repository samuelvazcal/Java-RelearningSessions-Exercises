package src.com.samuelvazquez.optional.examples;


import java.util.Optional;

public class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public User createNewUser() {
        return new User("NewUser",0);
    }

    public Optional<Integer> getIdOptional() {
        return Optional.ofNullable(id);
    }
}


