package src.com.samuelvazquez.anonymousclass.Example3;

public class Main1 {
    public static void main(String[] args) {
        //Java anonymous inner class example using class
        Pokemon pokemon = new Pokemon(){
            @Override
            public void attack() {
                System.out.println("he is blasting water!");
            }
        };
        pokemon.attack();
    }
}

abstract class Pokemon {
    abstract public void attack();
}
