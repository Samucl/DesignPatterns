package state;

public class Main {
    public static void main(String[] args){
        Pokemon pokemon = new Pokemon(new Charmander()); //Pokemon on ensin Charmander
        pokemon.getState().hyokkaa();
        pokemon.getState().kehity(pokemon);
        pokemon.getState().hyokkaa();
        pokemon.getState().kehity(pokemon);
        pokemon.getState().hyokkaa();
        pokemon.getState().kehity(pokemon);
    }
}
