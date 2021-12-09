package iterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class AddingIteratorThread extends Thread{
    private Iterator<Integer> iterator;
    private String nimi;
    private Collection<Integer> kokoelma;
    
    public AddingIteratorThread(Iterator<Integer> iterator, String nimi, Collection<Integer> kokoelma){
        this.iterator = iterator;
        this.nimi = nimi;
        this.kokoelma = kokoelma;
    }
    
    @Override
    public void run(){
        int x = 0;
        while (this.iterator.hasNext()) {
            x++;
            // lisätään satunnaisia lukuja joka toinen iteraatio
            if(x % 2 == 0)
                kokoelma.add(new Random().nextInt(1000 - 1 + 1) + 1);
            
            Integer i = this.iterator.next();
            System.out.println(nimi + ": " + i);
        }
    } 
}
