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
        pokemon.setState(this);
        System.out.println("Charizard on saavuttanut viimeisen tilan");
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
