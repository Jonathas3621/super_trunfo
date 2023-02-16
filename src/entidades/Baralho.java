//Jonathas dos Santos, 202201644

package entidades;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import arquivosUtil.JsonUtil;
import org.json.JSONObject;
import exceções.ThemeNotAvailableException;
import java.util.Arrays;

public class Baralho extends LinkedList<Carta>{

	private static final long serialVersionUID = 1L;
	private static String tema;
        private String[] listaDeTemas = {"Predadores", "Dinossauros", "Raças de D&D", "Criaturas Harry Potter"};
	
	public Baralho() {};
	
	public Baralho(String tema) throws ThemeNotAvailableException{
            
            List<String> lista = Arrays.asList(listaDeTemas);
            if(!lista.stream().anyMatch(x->x.equals(tema)))
                throw new ThemeNotAvailableException("Este tema não existe!");
            
            Baralho.tema = tema;
	}
	
	public void carregar() {
		
            JsonUtil json = new JsonUtil("src/arquivos/Cartas.json");

            for(int letra = 65; letra <= 68; letra++) {  //Varia o código ASCII de A até D
                for(int num = 1; num <= 8; num++) {

                    String codigo = String.format("%d%c", num, (char)letra);
                    JSONObject jsonTema = json.getJson().getJSONObject(tema);
                    
                    this.add(new Carta(codigo, 
                            jsonTema.getJSONObject(codigo), 
                    jsonTema.getJSONObject("atributos")));
                }
            }
	}
	
	public void embaralhar() {
		Collections.shuffle(this);
	}

	public void distribuir(List<JogadorAbstrato> jogadores) {
            while(!this.isEmpty()) {
            //for(int c=0; c<10;c++){
                for(JogadorAbstrato jogador: jogadores) {
                    jogador.adicionarCarta(pegarDoTopo());
                }
            }
	}
	
	public void listarCartas() {
            System.out.println(this);
	}
	
	public Carta pegarDoTopo() {
            Carta carta = null;

            if(!this.isEmpty()) {
                    carta = this.get(0);
                    this.remove(0);
            }

            return carta;
	}
	
	public Carta verDoTopo() {
            return this.get(0);
	}

	public String getTema() {
            return tema;
	}
}
