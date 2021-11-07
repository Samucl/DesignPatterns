package decorator;

public class Kinkku extends PizzaTayttaja{
    
    private int hinta = 1;
    
    public Kinkku(Pizza pizza){
        super(pizza);
    }

    @Override
    public String tayta() {
        return super.tayta() + kinkulla();
    }
    
    private String kinkulla(){
        return "\n  kinkku " + hinta + "€";
    }
    
    @Override
    public int hinta() {
        return super.hinta() + hinta;
    }
}
