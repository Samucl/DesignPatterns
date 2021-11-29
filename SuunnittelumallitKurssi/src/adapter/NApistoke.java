package adapter;

public class NApistoke implements NAsahkojarjestelma{

    @Override
    public void annaTiedot() {
        System.out.println("Sopii Amerikan pistorasiaan (100-120V, 60Hz)");
    }

    @Override
    public void kaytaNApistoketta() {
        System.out.println("Liitetty Amerikkalaiseen pistorasiaan");
    }
    
}
