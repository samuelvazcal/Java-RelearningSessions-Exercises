package src.com.samuelvazquez.lambdas.example6;

//Method reference to a constructor
public class MethodReferenceConstructor {
    public static void main(String[] args) {
        //method reference to a constructor
        NewInterface ni = Hello::new;
        ni.display("First example for method reference constructor");

        //now as a regular lambda expression
        NewInterface ni2 = (s) -> new Hello(s);
        ni2.display("Second example, implementing a regular lambda expression");

        //method reference to a constructor
        NewInterface2 ni3 = String::new;
        String result = ni3.create("Third example, method reference constructor for String data type");
        System.out.println(result);

        //now as a regular lambda expression
        NewInterface2 ni4 = (s) -> new String(s);
        String result2 = ni4.create("Fourth example, a redundant regular lambda");
        System.out.println(result2);

    }
}

class Hello {
    public Hello(String say) {
        System.out.println(say);
    }
}

interface NewInterface {
    Hello display(String say);
}


interface NewInterface2 {
    String create(String s);
}
