package prototype;

public class SekuntiViisari implements Viisari {

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
    public void resetAika() {
        sekunnit = 0;
    }
    
}
