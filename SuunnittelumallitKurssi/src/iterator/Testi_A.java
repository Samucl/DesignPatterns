package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * Tutkitaan kuinka Javan iteraattori käyttäytyy,
 * jos yritetään iteroida kokoelmaa kahdella säikeellä yhtä aikaa,
 * kun molemmilla on oma iterattori.
 */
public class Testi_A {
    public static void main(String[] args){
        Collection<Integer> kokoelma = new ArrayList<>();
        for(int i = 1; i <= 1000; i++){
            kokoelma.add(i);
        }
        Iterator<Integer> iterator1 = kokoelma.iterator();
        Iterator<Integer> iterator2 = kokoelma.iterator();
        
        IteratorThread thread1 = new IteratorThread(iterator1, "Thread1");
        IteratorThread thread2 = new IteratorThread(iterator2, "Thread2");
        
        thread1.start();
        thread2.start();
    }
}
