package memento;

import java.util.Random;

public class Arvuuttaja {
    
    public Memento liityPeliin(){
        return new Memento(arvoLuku());
    }
    
    private int arvoLuku(){ //Luku 1 ja 10 välillä
        return new Random().nextInt(10 - 1 + 1) + 1;
    }
    
    private class Memento {
        private int luku;
        
        public Memento(int luku){
            this.luku = luku;
        }
    }
}
