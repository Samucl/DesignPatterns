package visitor;

public class Charmander implements PokemonState{

    int xp = 0;
    
    @Override
    public void hyokkaa(Pokemon pokemon) {
        System.out.println("Charmanderin Scratch tekee 10 damagea");
        xp++;
        if(xp == 10){
            kehity(pokemon);
        }
    }

    @Override
    public void kehity(Pokemon pokemon) {
        System.out.println("Pokemon kehittyy");
        pokemon.setState(new Charmeleon());
    } 
}
