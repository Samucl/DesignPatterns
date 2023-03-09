package decorator;

public class Pohja implements Pizza{
    
    private int hinta = 5;
    private String nimi;
    
    public Pohja(String nimi){
        this.nimi = nimi;
    }

    @Override
    public String tayta() {
        return "\n" + nimi + ":\n  pohja " + hinta + "€";
    }

    @Override
    public int hinta() {
        return hinta;
    }
    
    

    
}
