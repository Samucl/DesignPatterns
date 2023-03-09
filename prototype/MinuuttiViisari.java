package prototype;

public class MinuuttiViisari implements Viisari, Cloneable {

    int minuutit;
    
    @Override
    public void tick() {
        minuutit++;
    }

    @Override
    public int getAika() {
        return minuutit;
    }
    
    @Override
    public void setAika(int aika) {
        minuutit = aika;
    }

    @Override
    public void resetAika() {
        minuutit = 0;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
   }
}
