package src.com.samuelvazquez.lambdas.example6;

public class Main {
    public static void main(String[] args) {
        Animal a = i -> {
            int constV = i * 7;
            System.out.println(constV);
            return constV;
        };
        a.dietSuggested(7);
    }
}


interface Animal {
    int dietSuggested(int i);
}