package decorator;

public class Salami extends PizzaTayttaja{
    
    private int hinta = 1;
    
    public Salami(Pizza pizza){
        super(pizza);
    }

    @Override
    public String tayta() {
        return super.tayta() + salamilla();
    }
    
    private String salamilla(){
        return "\n  salami " + hinta + "€";
    }
    
    @Override
    public int hinta() {
        return super.hinta() + hinta;
    }
}