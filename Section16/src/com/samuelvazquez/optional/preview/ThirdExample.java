package src.com.samuelvazquez.optional.preview;

// Use of Ternary Operator
public class ThirdExample {
    public static void main(String[] args) {
        //Initializing String variable with null value
        String str = null;

        String message = (str == null) ? "" : str.substring(0,2);

        System.out.println(message);

        //Initializing String variable with null value
        str = "Happy Sunday!";
        message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);
    }
}
