package adapter;

public class Auto implements IAuto {
    
    private int nopeus;
    private String malli;
    private AutoMph automph;
    
    public Auto(int nopeus, String malli){
        this.nopeus = nopeus;
        this.malli = malli;
    }

    @Override
    public int getNopeusKmh() {
        return nopeus;
    }

    @Override
    public String getMalli() {
        return malli;
    }
    
    public String toString(){
        return malli + " kulkee " + nopeus + "km/h";
    }
    
}
