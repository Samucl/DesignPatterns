package adapter;

public class EUtoNA_Adapteri implements NAsahkojarjestelma{
    
    EUsahkojarjestelma EUpistoke;
    
    public EUtoNA_Adapteri(EUsahkojarjestelma EUpistoke){
        this.EUpistoke = EUpistoke;
    }

    @Override
    public void annaTiedot() {
        EUpistoke.annaTiedot();
    }

    @Override
    public void kaytaNApistoketta() {
        EUpistoke.kaytaEUpistoketta();
    }
    
}
