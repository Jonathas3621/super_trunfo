package entidades;

import java.util.Random;

public class JogadorMaquina extends JogadorAbstrato{

	public JogadorMaquina(String nome) {
		super(nome);
	}

	@Override
	public int jogarTurno() {
            
            Random random = new Random();
            return random.nextInt(3);
	}
}
