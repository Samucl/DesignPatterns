package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<ProxyImage> list= new ArrayList<ProxyImage>();
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            list.add(new ProxyImage("HiRes_10MB_Photo" + (i+1)));
        }
        
        int valinta;
        while(true){
            System.out.println("\nKirjoita avattavan kuvan numero\n");
            int x = 0;
            for(ProxyImage i : list){
                x++;
                System.out.println((x) + ": " + i.showData());
            }
            valinta = scanner.nextInt();
            list.get(valinta-1).displayImage();
        }
    }
}
