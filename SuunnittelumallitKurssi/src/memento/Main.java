package memento;

public class Main {
    public static void main (String[] args){
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        
        Asiakas asiakas1 = new Asiakas("Asiaks1", arvuuttaja);
        Asiakas asiakas2 = new Asiakas("Asiaks2", arvuuttaja);
        Asiakas asiakas3 = new Asiakas("Asiaks3", arvuuttaja);
        
        asiakas1.start();
        asiakas2.start();
        asiakas3.start();
    }
}
