package observer;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ClockTimer timer = new ClockTimer();
        AnalogClock analogClock = new AnalogClock(timer);
        DigitalClock digitalClock = new DigitalClock(timer);
        timer.start();
    }
}
