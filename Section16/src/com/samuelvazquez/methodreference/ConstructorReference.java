package src.com.samuelvazquez.methodreference;

public class ConstructorReference {
    public static void main(String[] args) {
        //reference to a constructor
        Messageable hello = Message::new;
        hello.getMessage("Hello");

    }
}

interface Messageable {
    Message getMessage(String msg);
}

class Message {
    public Message(String msg) {
        System.out.println(msg);
    }
}
