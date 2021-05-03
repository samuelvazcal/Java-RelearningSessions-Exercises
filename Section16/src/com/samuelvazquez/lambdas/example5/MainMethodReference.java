package src.com.samuelvazquez.lambdas.example5;

public class MainMethodReference {
    public static void main(String[] args) {
        int res1 = MyClass.doFind("Mexico","xi");
        System.out.println(res1);

        //Lambda expression referencing the static method
        Finder finder = MyClass::doFind;
        //since the parameters of the Finder.find() & MyClass.doFind() methods match, it is possible to create
        //a lambda expression that implements Finder.find() and references the MyClass.doFind() method.
        int res2 = finder.find("Japan","an");
        System.out.println(res2);

        //Parameter method reference: you can also reference a method of one of the parameters to the lambda
        //tambien en ocasiones puede hacer referencia a un metodo (en este caso, indexOf) de uno de los
        //parametros (en este caso String) de la lambda.
        Finder finder2 = String::indexOf;
        //Finder finder2 = (s1,s2) -> s1.indexOf(s2);
        int res3 = finder2.find("Canada","da");
        System.out.println(res3);

    }
}

//A single function interface
interface Finder {
    int find (String s1, String s2);
}

//static method that we want to create a method reference
class MyClass {
    public static int doFind(String s1, String s2) {
        return s1.lastIndexOf(s2);
    }
}