package src.com.samuelvazquez.methodreference;

public class ConstructorReference {
    public static void main(String[] args) {
        //reference to a constructor via method reference
        Messageable hello = Message::new;
        hello.getMessage("Hello");

        //reference to a constructor via lambda expression
        Messageable hello2 = msg -> new Message(msg);
        hello2.getMessage("Monday...");
    }
}

// the getMessage method in the interface matches the same signature of
// the constructor of the Message class, therefore this constructor can be used as a lambda
interface Messageable {
    Message getMessage(String msg);
}

class Message {
    public Message(String msg) {
        System.out.println(msg);
    }
}
