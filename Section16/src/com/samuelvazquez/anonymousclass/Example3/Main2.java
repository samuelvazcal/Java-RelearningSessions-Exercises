package src.com.samuelvazquez.anonymousclass.Example3;

public class Main2 {
    public static void main(String[] args) {
        //Java anonymous inner class example using interface
        Eatable e = new Eatable() {
            @Override
            public void eat() {
                System.out.println("delicious fruits!");
            }
        };
        e.eat();
    }
}


interface Eatable {
    void eat();
}