package adapter;

public class EUpistoke implements EUsahkojarjestelma{

    @Override
    public void annaTiedot() {
        System.out.println("Sopii Euroopan pistorasiaan (220-240V, 50Hz)");
    }

    @Override
    public void kaytaEUpistoketta() {
        System.out.println("Liitetty Eurooppalaiseen pistorasiaan");
    }
}
