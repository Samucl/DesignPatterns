package state;

public class Charizard implements PokemonState{

    @Override
    public void hyokkaa() {
        System.out.println("Charizardin FireSpin tekee 100 damagea");
    }

    @Override
    public void kehity(Pokemon pokemon) {
        System.out.println("Pokemon kehittyy");
        pokemon.setState(this);
    }
}
