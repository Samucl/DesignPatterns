package prototype;

public class SekuntiViisari implements Viisari, Cloneable {

    int sekunnit;
    
    @Override
    public void tick() {
        sekunnit++;
    }

    @Override
    public int getAika() {
        return sekunnit;
    }
    
    @Override
    public void setAika(int aika) {
        sekunnit = aika;
    }

    @Override
    public void resetAika() {
        sekunnit = 0;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
   }
    
}
