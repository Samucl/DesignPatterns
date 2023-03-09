package iterator;

import java.util.Iterator;

public class IteratorThread extends Thread{
    private Iterator<Integer> iterator;
    private String nimi;
    
    public IteratorThread(Iterator<Integer> iterator, String nimi){
        this.iterator = iterator;
        this.nimi = nimi;
    }
    
    @Override
    public void run(){
        while (this.iterator.hasNext()) {
            Integer i = this.iterator.next();
            System.out.println(nimi + ": " + i);
        }
    }
}
