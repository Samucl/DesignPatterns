package prototype;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Kello extends Thread implements Cloneable{
    
    Viisari sekuntiViisari;
    Viisari minuuttiViisari;
    Viisari tuntiViisari;
    String nimi;
    
    public Kello (String nimi){
        sekuntiViisari = new SekuntiViisari();
        minuuttiViisari = new MinuuttiViisari();
        tuntiViisari = new TuntiViisari();
        this.nimi = nimi;
    }
    
    public void vaihdaAikaa(int sec, int min, int hour){
        sekuntiViisari.setAika(sec);
        minuuttiViisari.setAika(min);
        tuntiViisari.setAika(hour);
    }
    
    public void setNimi(String nimi){
        this.nimi = nimi;
    }
    
    public String getNimi(){
        return nimi;
    }

    @Override
    public void run() {
        while(true){
            try {
                
                sleep(1000);
                sekuntiViisari.tick();
               
                if(sekuntiViisari.getAika() % 60 == 0){
                    sekuntiViisari.resetAika();
                    minuuttiViisari.tick();
                    if(minuuttiViisari.getAika() % 60 == 0){
                        minuuttiViisari.resetAika();
                        tuntiViisari.tick();
                    }
                }
                
                System.out.println(nimi + ": " + tuntiViisari.getAika() + "." + minuuttiViisari.getAika() + "." + sekuntiViisari.getAika());
            } catch (InterruptedException ex) {
            }
        }
    }
    
    @Override
    public Kello clone() throws CloneNotSupportedException{
        //Kello k = (Kello) super.clone(); //EI TOIMI KOSKA "EXTENDS THREAD"
        Kello k = new Kello("kello"); //LUODAAN UUSI INSTANSSI KOSKA SÄIETTÄ EI VOI KLOONATA
        k.sekuntiViisari = (Viisari)sekuntiViisari.clone();
        k.minuuttiViisari = (Viisari)minuuttiViisari.clone();
        k.tuntiViisari = (Viisari)tuntiViisari.clone();
        return k;
    }
}
