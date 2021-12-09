package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * Tutkitaan, jos säikeet käyttävät samaa iteraattoria vuorotellen
 */
public class Testi_B {
    public static void main(String[] args){
        Collection<Integer> kokoelma = new ArrayList<>();
        for(int i = 1; i <= 1000; i++){
            kokoelma.add(i);
        }
        Iterator<Integer> iterator = kokoelma.iterator();
        
        IteratorThread thread1 = new IteratorThread(iterator, "Thread1");
        IteratorThread thread2 = new IteratorThread(iterator, "Thread2");
        
        thread1.start();
        thread2.start();
    }
}
