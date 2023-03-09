package state;

public class Charmander implements PokemonState{

    @Override
    public void hyokkaa() {
        System.out.println("Charmanderin Scratch tekee 10 damagea");
    }

    @Override
    public void kehity(Pokemon pokemon) {
        System.out.println("Pokemon kehittyy");
        pokemon.setState(new Charmeleon());
    } 
}
