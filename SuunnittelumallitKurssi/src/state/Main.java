package state;

public class Main {
    public static void main(String[] args){
        Pokemon pokemon = new Pokemon();
        Charmander charmander = new Charmander();
        Charmeleon charmeleon = new Charmeleon();
        Charizard charizard = new Charizard();
        
        charmander.kehity(pokemon);
        pokemon.getState().hyokkaa();
        
        charmeleon.kehity(pokemon);
        pokemon.getState().hyokkaa();
        
        charizard.kehity(pokemon);
        pokemon.getState().hyokkaa();
    }
}
