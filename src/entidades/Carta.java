package entidades;

import org.json.JSONObject;

public class Carta {

	private String nome;
	private String codigo;
        private boolean trunfo;
	private Atributo[] atributos;
	
	public Carta(String nome, String codigo, Atributo[] atributos) {
		this.nome = nome;
		this.codigo = codigo;
                this.atributos = atributos;
	}
        
        public Carta(String codigo, JSONObject atributos, JSONObject unidadesDeMedida){
            this.atributos = new Atributo[4];
            carregarCarta(codigo, atributos, unidadesDeMedida);
        }
        
        private void carregarCarta(String codigo, JSONObject dados, JSONObject unidadesDeMedida) {
            
            setNome((String) dados.get("nome"));
            setCodigo(codigo);
            setTrunfo(dados.getBoolean("trunfo"));
            
            Object[] listaDeAtributos = unidadesDeMedida.keySet().toArray();
            
            for(int indice = 0; indice < listaDeAtributos.length; indice++){
                
                String atributoNome = (String) listaDeAtributos[indice];
                
                Atributo atributo;
                atributo = new Atributo(atributoNome, 
                        (String) unidadesDeMedida.get(atributoNome),
                        dados.getDouble(atributoNome));
                
                setAtributos(indice, atributo);
            }
	}

	public String getNome() {
		return nome;
	}
        
        private void setNome(String nome){
            this.nome = nome;
        }
        
	public String getCodigo() {
		return codigo;
	}
        
        private void setCodigo(String codigo){
            this.codigo = codigo;
        }
        
        public boolean ehTrunfo() {
		return trunfo;
	}
        
        private void setTrunfo(boolean trunfo) {
		this.trunfo = trunfo;
	}
	
	public Atributo[] getAtributos() {
		return atributos;
	}
        
        private void setAtributos(int index, Atributo atributo) {
		this.atributos[index] = atributo;
	}
        
        public String[] extrairDadosComoString(){
            String[] listaDeDados = new String[6];

            listaDeDados[0] = String.format("%s | %s", this.getCodigo(), this.getNome());
            listaDeDados[5] = "CURIOSO, NÃO?";
            for(int i=1; i<=4; i++){
                listaDeDados[i] = this.getAtributos()[i-1].toString();
                //System.out.println("Teste Extrair Dados" + listaDeDados[i]);
            }
            //for(String o: listaDeDados) System.out.print(o + " ");
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
