package prototype;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Kello extends Thread {
    
    Viisari sekuntiViisari;
    Viisari minuuttiViisari;
    Viisari tuntiViisari;
    
    public Kello (){
        sekuntiViisari = new SekuntiViisari();
        minuuttiViisari = new MinuuttiViisari();
        tuntiViisari = new TuntiViisari();
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
                
                System.out.println(tuntiViisari.getAika() + ":" + minuuttiViisari.getAika() + ":" + sekuntiViisari.getAika());
            } catch (InterruptedException ex) {
                Logger.getLogger(Kello.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
