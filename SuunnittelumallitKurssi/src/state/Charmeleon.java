package state;

public class Charmeleon implements PokemonState {

    @Override
    public void hyokkaa() {
        System.out.println("Charmeleonin Flamethrower tekee 60 damagea");
    }

    @Override
    public void kehity(Pokemon pokemon) {
        System.out.println("Pokemon kehittyy");
        pokemon.setState(new Charizard());
    }
}
