package entidades;

public class Atributo {
	
	private String nome;
	private String unidadeDeMedida;
	private Double valor;
	
	public Atributo(String nome, String unidadeDeMedida, Double valor) {
		this.nome = nome;
		this.unidadeDeMedida = unidadeDeMedida;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public String getUnidadeDeMedida() {
		return unidadeDeMedida;
	}

	public Double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s", getNome(), getValor(), getUnidadeDeMedida());
	}
}
