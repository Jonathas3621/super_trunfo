package entidades;

import Exceções.NullThemeException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Baralho extends LinkedList<Carta>{

	private static final long serialVersionUID = 1L;
	private static String tema;
	
	public Baralho() {};
	
	public Baralho(String tema) throws NullThemeException{
            if(null == tema) throw new NullThemeException();
            Baralho.tema = tema;
	}
	
	public void carregar() {
            String file = "";

            switch(getTema()){
                case "Raças de D&D":
                        file = "racasDeD.csv";
                        break;
                case "Dinossauros":
                        file = "dinossauros.csv";
                        break;
                case "Skyrim":
                        file = "skyrim.csv";
                        break;
                case "Criaturas Harry Potter":
                        file = "criaturasDeHarryPotter.csv";
                        break;
            }
            
            String path = "src/arquivos/" + file;
            try(BufferedReader arquivo = new BufferedReader(new FileReader(path))){
                    
                    /*Estrutura dos arquivos
                     *  nome, codigo, atributo1, unidade1, atributo2, unidade2
                     *  atributo3, unidade3, atributo4, unidade4, ehTrunfo, curiosidade
                     */
                    String[] primeiraLinha = arquivo.readLine().split(",");
                    String[] listaDePropriedades;

                    while (true) {
                            Atributo[] atributos = new Atributo[4];
                            String line = arquivo.readLine();
                            if(line == null) break;
                            
                            listaDePropriedades = line.split(",");
                            
                            atributos[0] = new Atributo(primeiraLinha[2], 
                                    listaDePropriedades[3],
                                    Double.valueOf(listaDePropriedades[2]));
                            atributos[1] = new Atributo(primeiraLinha[4], 
                                    listaDePropriedades[5],
                                    Double.valueOf(listaDePropriedades[4]));
                            atributos[2] = new Atributo(primeiraLinha[6], 
                                    listaDePropriedades[7],
                                    Double.valueOf(listaDePropriedades[6]));
                            atributos[3] = new Atributo(primeiraLinha[8], 
                                    listaDePropriedades[9],
                                    Double.valueOf(listaDePropriedades[8]));
                            
                            this.add(new Carta(listaDePropriedades[0], listaDePropriedades[1],
                                    listaDePropriedades[11],Boolean.parseBoolean(listaDePropriedades[10]), 
                                    atributos));
                    }

            }catch(FileNotFoundException fnfe){
            }catch(IOException e){
            }
	}
	
	public void embaralhar() {
		Collections.shuffle(this);
	}

	public void distribuir(List<JogadorAbstrato> jogadores) {
            //while(!this.isEmpty()) {
            for(int i = 0; i < 2; i++){
                for(JogadorAbstrato jogador: jogadores) {
                    jogador.getMonte().adicionarCarta(pegarDoTopo());
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
	
	public void adicionarCarta(Carta carta) {
		if (carta != null) this.addLast(carta);
	}
}