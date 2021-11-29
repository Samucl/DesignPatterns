package builder;

public class Main {
    public static void main(String[] args){
        McDonalds mcdonalds = new McDonalds();
        Hesburger hesburger = new Hesburger();
        Hampurilainen bigMac = mcdonalds.tilaaBigMac();
        Hampurilainen mcFeast = mcdonalds.tilaaMcFeast();
        Hampurilainen kerrosHampurilainen = hesburger.tilaaKerrosHampurilainen();
        Hampurilainen juustoHampurilainen = hesburger.tilaaJuustoHampurilainen();
        
        System.out.println("\n OLLAAN MCDONALDSISSA\n");
        
        System.out.println("BigMac:\n");
        bigMac.naytaHampurilainen();
        
        System.out.println("\nMcFeast:\n");
        mcFeast.naytaHampurilainen();
        
        System.out.println("\n NYT OLLAAN HESBURGERISSA\n");
        
        System.out.println("\nKerros hampurilainen:\n");
        kerrosHampurilainen.naytaHampurilainen();
        
        System.out.println("\nJuustoHampurilainen:\n");
        juustoHampurilainen.naytaHampurilainen();
    }
}
