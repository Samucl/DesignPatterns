package visitor;

public class Pokemon {
    private PokemonState state;
    private IBonusVisitor visitor;
    
    public Pokemon(PokemonState state, IBonusVisitor visitor){
        this.state = state;
        this.visitor = visitor;
    }
    
    public Pokemon(){
        state = null;
    }
    
    /**
     * Aina kun pokemon saa uuden staten (tai saavuttaa kehittymispisteen) pokemon saa bonuksen.
     */
    public void setState(PokemonState state){
        this.state.acceptBonusVisitor(visitor);
        this.state = state;
    }
    
    public PokemonState getState(){
        return state;
    }
}
