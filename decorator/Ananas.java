package decorator;

public class Ananas extends PizzaTayttaja{
    
    private int hinta = 1;
    
    public Ananas(Pizza pizza){
        super(pizza);
    }

    @Override
    public String tayta() {
        return super.tayta() + ananaksella();
    }
    
    private String ananaksella(){
        return "\n  ananaks " + hinta + "€";
    }
    
    @Override
    public int hinta() {
        return super.hinta() + hinta;
    }
}
