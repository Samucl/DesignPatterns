package observer;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClockTimer extends Observable implements Runnable {
    
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;
    
    public int getHour(){
        return hours;
    }
    public int getMinute(){
        return minutes;
    }
    public int getSecond(){
        return seconds;
    }
    void tick(){
        seconds++;
        if(seconds >= 60){
            minutes++;
            seconds = 0;
        }
        if(minutes >= 60){
            hours++;
            minutes = 0;
        }
        setChanged();
        this.notifyObservers();
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            this.tick();
        }
    }
}
