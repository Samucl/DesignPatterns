package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Testataan kuinka käy, 
 * jos kokoelmaan tehdään muutoksia iteroinnin läpikäynnin.
 */
public class Testi_C {
        public static void main(String[] args){
        Collection<Integer> kokoelma = new ArrayList<>();
        for(int i = 1; i <= 1000; i++){
            kokoelma.add(i);
        }
        Iterator<Integer> iterator = kokoelma.iterator();
        AddingIteratorThread thread = new AddingIteratorThread(iterator, "Thread", kokoelma);
        
        thread.start();
    }
}
