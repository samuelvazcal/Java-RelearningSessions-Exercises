package src.com.samuelvazquez.lambdas.example5;

public class MainMethodReference2 {
    public static void main(String[] args) {
        StringConverter stringConverter = new StringConverter();
        //old school
        int intValue = stringConverter.convertToInt("200");
        System.out.println(intValue + 200);

        //lambda expression
        Deserializer des = (s) -> stringConverter.convertToInt(s);
        System.out.println(des.deserialize("100")+20);

        //method reference (instance method)
        Deserializer des2 = stringConverter::convertToInt;
        System.out.println(des2.deserialize("500")+25);

    }
}

//single method interface definition
interface Deserializer {
    int deserialize(String v1);
}

// The convertToInt() method has the same signature as the deserialize()
// method of the Deserializer deserialize() method.
// Because of that, we can create an instance of StringConverter
// and reference its convertToInt() method from a Java lambda expression (line 10)
class StringConverter {
    int convertToInt(String v1) {
        return Integer.parseInt(v1);
    }
}