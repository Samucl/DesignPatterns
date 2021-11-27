package visitor;

public interface PokemonState {
    public void hyokkaa(Pokemon pokemon);
    public void kehity(Pokemon pokemon);
    public void acceptBonusVisitor(IBonusVisitor visitor);
    public void annaKehitysBonus(); //Antaa bonuksen pokemonille kun visitor kutsuu metodin
}
