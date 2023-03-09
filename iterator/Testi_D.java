package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Testataan kuinka käy, 
 * jos yksi säie poistelee kokoelmasta
 * ja käytössä on yksi iterator.
 */
public class Testi_D {
        public static void main(String[] args){
        Collection<Integer> kokoelma = new ArrayList<>();
        for(int i = 1; i <= 1000; i++){
            kokoelma.add(i);
        }
        Iterator<Integer> iterator = kokoelma.iterator();
        
        IteratorThread thread1 = new IteratorThread(iterator, "Thread1");
        RemovingIteratorThread thread2 = new RemovingIteratorThread(iterator, "Thread2");
        
        thread1.start();
        thread2.start();
    }
}
