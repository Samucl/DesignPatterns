package decorator;

public class Katkarapu extends PizzaTayttaja{
    
    private int hinta = 1;
    
    public Katkarapu(Pizza pizza){
        super(pizza);
    }

    @Override
    public String tayta() {
        return super.tayta() + katkaravuilla();
    }
    
    private String katkaravuilla(){
        return "\n  katkarapu " + hinta + "€";
    }
    
    @Override
    public int hinta() {
        return super.hinta() + hinta;
    }
}