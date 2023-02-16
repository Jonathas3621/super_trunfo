//Jonathas dos Santos, 202201644

package entidades;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class JogadorAbstrato implements PropertyChangeListener{
	
	private String nome;
	private Baralho monte;
	
	public JogadorAbstrato(String nome) {
		this.nome = nome;
		this.monte = new Baralho();
	}
	
	public abstract int jogarTurno();
	
    /**
     *
     * @param event
     */
    @Override
	public void propertyChange(PropertyChangeEvent event) {
		if(event.getNewValue().equals(this)) jogarTurno();
	}
	
	public String getNome() {
		return nome;
	}
	
	public Baralho getMonte() {
		return monte;
	}
	
	public void adicionarCarta(Carta carta) {
		if (carta != null) this.monte.add(carta);
	}
}
