package entidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer implements ActionListener{
    
    public Timer(){}
    
    public synchronized void waitEvent(){
        try {
            wait();
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
