package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {
    
    private List<Laiteosa> list = new ArrayList<Laiteosa>();
    private double hinta;
    
    public Emolevy(double hinta){
        this.hinta = hinta;
    }
    
    public void lisaaOsa(Laiteosa osa){
        list.add(osa);
    }
    
    public void postaOsa(Laiteosa osa){
        list.remove(osa);
    }
    
    @Override
    public double getHinta() {
        double compositeHinta = hinta;
        for(Laiteosa osa : list){
            compositeHinta += osa.getHinta();
        }
        return compositeHinta;
    }
    
}
