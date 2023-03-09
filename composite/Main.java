package composite;

public class Main {
    public static void main(String[] args){
        Laiteosa kotelo = new Kotelo(49.90); //Composite
        Laiteosa emolevy = new Emolevy(99.99); //Composite
        Laiteosa kiintolevy = new Kiintolevy(94.90); //leaf
        Laiteosa muisti = new Muisti(72.95); //leaf
        Laiteosa naytonohjain = new Naytonohjain(559.99); //leaf
        Laiteosa prosessori = new Prosessori(259.90); //leaf
        
        emolevy.lisaaOsa(muisti);
        emolevy.lisaaOsa(naytonohjain);
        emolevy.lisaaOsa(prosessori);
        
        kotelo.lisaaOsa(kiintolevy);
        kotelo.lisaaOsa(emolevy);
        
        System.out.println("Kiintolevyn hinta: " + kiintolevy.getHinta());
        System.out.println("Muistin hinta: " + muisti.getHinta());
        System.out.println("Naytonohjaimen hinta: " + naytonohjain.getHinta());
        System.out.println("Prosessorin hinta: " + prosessori.getHinta());
        System.out.println("Emolevyn (ja sen sisältävät komponentit) hinta: " + emolevy.getHinta());
        System.out.println("Kotelon hinta (Kaikkien komponenttien kokonaishinta): " + kotelo.getHinta());
    }
}
