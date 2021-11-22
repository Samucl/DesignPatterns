package memento;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Asiakas extends Thread{
    
    private Object obj;
    private Arvuuttaja arvuuttaja;
    private String nimi;
    
    public Asiakas(String nimi, Arvuuttaja arvuuttaja){
        this.nimi = nimi;
        this.arvuuttaja = arvuuttaja;
    }
            
    @Override
    public void run() {
            obj = arvuuttaja.liityPeliin();
        while(true){
                try {
                    sleep(500);
                    System.out.println(nimi + " arvaa");
                    if(arvuuttaja.arvaaLuku(obj)){
                        System.out.println(nimi + " arvasi oikein!");
                        break;
                    }
                    else{
                        arvuuttaja.arvaaLuku(obj);
                    } 
                } catch (InterruptedException ex) {}
        }
    }
    
}
