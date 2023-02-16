package entidades;

import java.util.Random;

public class Jogador extends JogadorAbstrato{

	public Jogador(String nome) {
		super(nome);
	}
	
	@Override
	public int  jogarTurno() {
            Random random = new Random();
            return random.nextInt(3);
	}
}
