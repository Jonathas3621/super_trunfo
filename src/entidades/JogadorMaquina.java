package entidades;

import java.util.Random;

public class JogadorMaquina extends JogadorAbstrato{

        private Timer timer;
        
	public JogadorMaquina(String nome) {
            super(nome);
            this.timer = new Timer();
	}

	@Override
	public synchronized int jogarTurno() {
            
            getTimer().sleepALittle(2000);
            
            Random random = new Random();
            return random.nextInt(3);
	}
        
        private Timer getTimer(){
            return timer;
        }
}
