package visitor;

public class Charmeleon implements PokemonState {

    int xp = 0;
    
    @Override
    public void hyokkaa(Pokemon pokemon) {
        System.out.println("Charmeleonin Flamethrower tekee 60 damagea");
        xp++;
        if(xp == 10){
            kehity(pokemon);
        }
    }

    @Override
    public void kehity(Pokemon pokemon) {
        System.out.println("Pokemon kehittyy");
        pokemon.setState(new Charizard());
    }

    @Override
    public void acceptBonusVisitor(IBonusVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void annaKehitysBonus() {
        System.out.println("Pokemon sai bonuksen");
    }
}
