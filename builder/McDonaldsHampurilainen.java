package builder;

import java.util.ArrayList;
import java.util.List;

public class McDonaldsHampurilainen implements Hampurilainen {
    private List<HampurilaisenOsa> hampurilainen = new ArrayList<HampurilaisenOsa>();
    
    public void getBigMac(){
        hampurilainen.add(new Sampyla());
        hampurilainen.add(new Sipuli());
        hampurilainen.add(new Juusto());
        hampurilainen.add(new Pihvi());
        hampurilainen.add(new Sampyla());
        hampurilainen.add(new Majoneesi());
        hampurilainen.add(new Salaatti());
        hampurilainen.add(new Pihvi());
        hampurilainen.add(new Sampyla());
    }
    
    public void getMcFeast(){
        hampurilainen.add(new Sampyla());
        hampurilainen.add(new Sipuli());
        hampurilainen.add(new Tomaatti());
        hampurilainen.add(new Juusto());
        hampurilainen.add(new Pihvi());
        hampurilainen.add(new Salaatti());
        hampurilainen.add(new Sampyla());
    }
    
    @Override
    public void naytaHampurilainen(){
        for(HampurilaisenOsa h : hampurilainen){
            System.out.println(h.getNimi());
        }
    }
}
