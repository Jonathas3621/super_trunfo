package entidades;

public class Carta {

	private String nome;
	private String codigo;
	private String curiosidade;
        private boolean trunfo;
	private Atributo[] atributos;
        
	public Carta(String nome, String codigo, String curiosidade, boolean trunfo, Atributo[] atributos) {
		this.nome = nome;
		this.codigo = codigo;
                this.curiosidade = curiosidade;
                this.trunfo = trunfo;
                this.atributos = atributos;
	}

	public String getNome() {
            return nome;
	}
        
	public String getCodigo() {
            return codigo;
	}
        
        public String getCuriosidade(){
            return curiosidade;
        }
        
        public boolean ehTrunfo() {
            return trunfo;
	}
	
	public Atributo[] getAtributos() {
            return atributos;
	}
        
        public String[] extrairDadosComoString(){
            String[] listaDeDados = new String[7];

            listaDeDados[0] = String.format("%s | %s", getCodigo(), getNome());
            listaDeDados[6] = curiosidade;
            listaDeDados[1] = ehTrunfo() ? "Super Trunfo": "";
            for(int i=2; i<=5; i++){
                listaDeDados[i] = this.getAtributos()[i-2].toString();
            }
            
            return listaDeDados;
        }
	
	@Override
	public String toString() {
		return String.format(" %s | %s%n (1)%s%n (2)%s%n (3)%s%n (4)%s", 
                        getCodigo(), getNome(), 
                        getAtributos()[0],
                        getAtributos()[1],
                        getAtributos()[2],
                        getAtributos()[3]);
	}
}
