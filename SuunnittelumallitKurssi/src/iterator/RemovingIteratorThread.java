package iterator;

import java.util.Iterator;

public class RemovingIteratorThread extends Thread{
    private Iterator<Integer> iterator;
    private String nimi;
    
    public RemovingIteratorThread(Iterator<Integer> iterator, String nimi){
        this.iterator = iterator;
        this.nimi = nimi;
    }
    
    @Override
    public void run(){
        while (this.iterator.hasNext()) {
            Integer i = this.iterator.next();
            System.out.println(nimi + " removing : " + i);
            iterator.remove();
        }
    } 
}
