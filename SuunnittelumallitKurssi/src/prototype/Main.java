package prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException{
        Kello kello1 = new Kello("Kello1");
        kello1.start();
        System.out.println("Syväkopioidaan 5 sekunnin päästä");
        Thread.sleep(5000);
        
        Kello kello2 = kello1.clone();
        kello2.setNimi("Kello2");
        System.out.println("Kopioitu");
        kello2.start();
        
        System.out.println(kello2 == kello1);
        
        //kello1.vaihdaAikaa(5, 25, 1);
    }
}
