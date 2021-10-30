package composite;

public class Muisti implements Laiteosa {
    
    private double hinta;
    
    public Muisti(double hinta){
        this.hinta = hinta;
    }

    @Override
    public double getHinta() {
        return hinta;
    }

    @Override
    public void lisaaOsa(Laiteosa osa) {
        throw new RuntimeException ("Komponenttiin ei voida liittää toista komponenttia...");
    }
}