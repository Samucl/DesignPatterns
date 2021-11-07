package decorator;

public abstract class PizzaTayttaja implements Pizza{
    
    protected Pizza pohja;
    
    public PizzaTayttaja(Pizza pohja){
        this.pohja = pohja;
    }

    @Override
    public String tayta() {
        return pohja.tayta();
    }
    
    @Override
    public int hinta() {
        return pohja.hinta();
    }
}
