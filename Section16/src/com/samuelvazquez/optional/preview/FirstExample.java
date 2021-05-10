package src.com.samuelvazquez.optional.preview;

//String comparison with literals
public class FirstExample {
    public static void main(String[] args) {

        try {
            String str1 = null;
            if(str1.equals("sunday")) {
                System.out.println("Same!");
            } else {
                System.out.println("Not same");
            }
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e);
        }



    }
}
