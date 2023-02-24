package entidades;

public abstract class JogadorAbstrato{
	
	private String nome;
	private Baralho monte;
	
	public JogadorAbstrato(String nome) {
		this.nome = nome;
		this.monte = new Baralho();
	}
	
	public abstract int jogarTurno();
	
	public String getNome() {
		return nome;
	}
	
	public Baralho getMonte() {
		return monte;
	}
}
