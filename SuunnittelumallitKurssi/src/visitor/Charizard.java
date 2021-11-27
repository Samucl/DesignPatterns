package visitor;

public class Charizard implements PokemonState{
    
    int xp = 0;

    @Override
    public void hyokkaa(Pokemon pokemon) {
        System.out.println("Charizardin FireSpin tekee 100 damagea");
        xp++;
        if(xp == 10){
            kehity(pokemon);
        }
    }

    @Override
    public void kehity(Pokemon pokemon) {
        System.out.println("Charizard ei voi kehittyä pidemmälle");
    }
}
