package composite;

public class Naytonohjain implements Laiteosa {
    
    private double hinta;
    
    public Naytonohjain(double hinta){
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
