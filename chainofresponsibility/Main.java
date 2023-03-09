package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        Lahiesimies lahiesimies = new Lahiesimies();
        Paallikko paallikko = new Paallikko();
        Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja();
        lahiesimies.setSeuraaja(paallikko);
        paallikko.setSeuraaja(toimitusjohtaja);
        
        try{
            while(true){
                System.out.print("\nKuinka isolla prosentilla haluat korottaa palkkaasi?\n");
                double prosentti = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                lahiesimies.processPyynto(new PalkkaPyynto(prosentti));
            }
        }catch(Exception e){
            System.exit(1);
        }
    }
}
