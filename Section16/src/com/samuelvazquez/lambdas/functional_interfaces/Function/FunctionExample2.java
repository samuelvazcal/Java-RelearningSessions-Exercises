package src.com.samuelvazquez.lambdas.functional_interfaces.Function;

import java.util.HashMap;
import java.util.Map;

public class FunctionExample2 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        nameMap.put("Michael",1000);
        // return 8 because Michelle is not in the list, so the method reference is applied
        // int value = nameMap.computeIfAbsent("Michelle",String::length);
        // return 1000 if Michael is the key, because 1000 is the existing value for this key
        int value = nameMap.computeIfAbsent("Michael",String::length);
        System.out.println(value);
    }
}
