package entidades;

import static java.lang.Thread.sleep;
import java.util.Random;

public class JogadorMaquina extends JogadorAbstrato{

	public JogadorMaquina(String nome) {
		super(nome);
	}

	@Override
	public synchronized int jogarTurno() {
            
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.err.println("Thread Interrupted");
            }
            
            Random random = new Random();
            return random.nextInt(3);
	}
}
