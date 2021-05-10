package src.com.samuelvazquez.optional.preview;

//Keeping a Check on the arguments of a method
public class SecondExample {
    public static void main(String[] args) {
        String s = "";

        //String s set an empty string and calling getLength()
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getClass().getSimpleName() + " caught");
        }

        s = "Happy Sunday!";

        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getClass().getSimpleName() + " caught");
        }

        s = null;

        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getClass().getSimpleName() + " caught");
        }
    }

    //Function to return length of string s. It throws
    //IllegalArgumentException if s is null
    public static int getLength(String s) {
        if(s == null) {
            throw new IllegalArgumentException("The argument cannot be null");
        } else return s.length();
    }
}
