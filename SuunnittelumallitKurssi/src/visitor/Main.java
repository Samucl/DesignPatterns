package visitor;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        IBonusVisitor visitor = new BonusVisitor();
        Pokemon pokemon = new Pokemon(new Charmander(),visitor); //Pokemon on ensin Charmander
        while(true){
            pokemon.getState().hyokkaa(pokemon);
            Thread.sleep(500);
        }
    }
}
