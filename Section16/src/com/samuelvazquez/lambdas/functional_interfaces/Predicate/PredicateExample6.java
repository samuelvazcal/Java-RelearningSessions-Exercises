package src.com.samuelvazquez.lambdas.functional_interfaces.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample6 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Michael","Manager"));
        users.add(new User("Dwight", "Assistant"));
        List admins = process(users, u -> u.getRole().equals("Manager"));
        System.out.println(admins);
    }

    public static List<User> process(List<User> users, Predicate<User> predicat) {
        List<User> result = new ArrayList<>();
        for(User user : users) {
            if(predicat.test(user)) {
                result.add(user);
            }
        }
        return result;
    }
}

class User {
    String name;
    String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    String getRole() {
        return role;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User name: " + name + ", Role: " + role;
    }
}
