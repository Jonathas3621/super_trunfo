package entidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;

public class Timer implements ActionListener{
    
    public Timer(){}
    
    public synchronized void waitAMoment(){
        try {
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
            System.err.println("Thread Interrupted");
        }
    }
    
    public synchronized void sleepALittle(int millis){
        try {
            sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
            System.err.println("Thread Interrupted");
        }
    }
    
    @Override
    public synchronized void actionPerformed(ActionEvent e) {
        notify();
    }
    
}
