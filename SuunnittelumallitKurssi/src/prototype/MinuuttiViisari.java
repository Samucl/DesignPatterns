package prototype;

public class MinuuttiViisari implements Viisari {

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
    public void resetAika() {
        minuutit = 0;
    }
    
}
