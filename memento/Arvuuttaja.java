package memento;

import java.util.Random;

public class Arvuuttaja {
    
    public Memento liityPeliin(){
        return new Memento(arvoLuku());
    }
    
    public boolean arvaaLuku(Object obj){
        Memento memento = (Memento) obj;
        if(memento.getLuku() != arvoLuku()){
            memento = new Memento(arvoLuku());
            return false;
        }
        return true;
    }
    
    private int arvoLuku(){ //Luku 1 ja 10 välillä
        return new Random().nextInt(10 - 1 + 1) + 1;
    }
    
    private class Memento {
        private int luku;
        
        public Memento(int luku){
            this.luku = luku;
        }
        
        private int getLuku(){
            return luku;
        }
    }
}
