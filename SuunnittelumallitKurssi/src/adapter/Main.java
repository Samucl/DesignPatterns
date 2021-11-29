package adapter;

public class Main {
    public static void main(String[] args){
        EUsahkojarjestelma euPistoke = new EUpistoke();
        NAsahkojarjestelma naPistoke = new NApistoke();
        NAsahkojarjestelma naPistokeAdapterilla = new EUtoNA_Adapteri(euPistoke);
        
        System.out.println("Euroopan C-tyyppinen pistoke");
        euPistoke.annaTiedot();
        euPistoke.kaytaEUpistoketta();
        
        System.out.println("\nAmerikan A-tyyppinen pistoke");
        naPistoke.annaTiedot();
        naPistoke.kaytaNApistoketta();
        
        System.out.println("\nAmerikan A-tyyppinen pistoke C-tyypin adapterilla");
        naPistokeAdapterilla.annaTiedot();
        naPistokeAdapterilla.kaytaNApistoketta();
    }
}
