package src.com.samuelvazquez.lambdas.example6;

import java.util.Arrays;

public class MethodReferenceInstanceMethodArbitraryObjectParticularType {
    public static void main(String[] args) {
        String [] stringArray = {"Michael","Jim","Dwight","Pam","Stanley"};

        // Method reference to an instance method of an arbitrary
        // object of a particular type
        Arrays.sort(stringArray, String::compareToIgnoreCase);

        for(String str : stringArray) {
            System.out.println(str);
        }
    }
}
