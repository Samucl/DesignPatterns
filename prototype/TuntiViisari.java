package prototype;

public class TuntiViisari implements Viisari, Cloneable {

    int tunnit;
    
    @Override
    public void tick() {
        tunnit++;
    }

    @Override
    public int getAika() {
        return tunnit;
    }
    
    @Override
    public void setAika(int aika) {
        tunnit = aika;
    }

    @Override
    public void resetAika() {
        tunnit = 0;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
   }
}
