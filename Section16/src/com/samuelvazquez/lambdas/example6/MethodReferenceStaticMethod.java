package src.com.samuelvazquez.lambdas.example6;

public class MethodReferenceStaticMethod {
    public static void main(String[] args) {
        //lambda expression using method reference
        MathOperation op = Multiplication::doMultiply;
        System.out.println(op.multiply(7,8));
    }
}


interface MathOperation {
    int multiply(int a, int b);
}

// doMultiply() has the same signature as multiply() of the interface. Because of that,
// we can reference the class method from a lambda expression.
class Multiplication {
    public static int doMultiply(int a, int b){
        return a*b;
    }
}