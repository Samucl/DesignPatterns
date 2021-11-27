package visitor;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Pokemon pokemon = new Pokemon(new Charmander()); //Pokemon on ensin Charmander
        while(true){
            pokemon.getState().hyokkaa(pokemon);
            Thread.sleep(500);
        }
    }
}
