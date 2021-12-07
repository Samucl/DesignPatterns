package prototype;

public class TuntiViisari implements Viisari {

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
    public void resetAika() {
        tunnit = 0;
    }
    
}
