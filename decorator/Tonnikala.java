package decorator;

public class Tonnikala extends PizzaTayttaja{
    
    private int hinta = 1;
    
    public Tonnikala(Pizza pizza){
        super(pizza);
    }

    @Override
    public String tayta() {
        return super.tayta() + tonnikalalla();
    }
    
    private String tonnikalalla(){
        return "\n  tonnikala " + hinta + "€";
    }
    
    @Override
    public int hinta() {
        return super.hinta() + hinta;
    }
}