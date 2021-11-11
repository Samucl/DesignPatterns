package state;

public class Pokemon {
    private PokemonState state;
    
    public Pokemon(){
        state = null;
    }
    
    public void setState(PokemonState state){
        this.state = state;
    }
    
    public PokemonState getState(){
        return state;
    }
}
