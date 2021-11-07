package decorator;

public class Main {
    public static void main(String[] args){
        Pizza pizza1 = new Kinkku(new Pohja("Kinkkupizza"));
        System.out.println(pizza1.tayta() + "\nKokonaishinta: " + pizza1.hinta() + "€");
        
        Pizza pizza2 = new Kinkku(new Ananas(new Tonnikala(new Pohja("Quattro Stagioni"))));
        System.out.println(pizza2.tayta() + "\nKokonaishinta: " + pizza2.hinta() + "€");
        
        Pizza pizza3 = new Salami(new Ananas(new Tonnikala(new Katkarapu(new Pohja("Lihamestari")))));
        System.out.println(pizza3.tayta() + "\nKokonaishinta: " + pizza3.hinta() + "€");
    }
}
