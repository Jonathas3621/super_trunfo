package entidades;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import arquivosUtil.JsonUtil;
import org.json.JSONObject;

public class Baralho extends LinkedList<Carta>{

	private static final long serialVersionUID = 1L;
	private static String tema;
	
	public Baralho() {};
	
	public Baralho(String tema){
            
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
            //while(!this.isEmpty()) {
            for(int i = 0; i < 2; i++){
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
