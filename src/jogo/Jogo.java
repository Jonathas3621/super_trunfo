package jogo;

import Exceções.NullThemeException;
import java.util.ArrayList;

import entidades.Baralho;
import entidades.Carta;
import entidades.JogadorAbstrato;
import entidades.Timer;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Jogo implements Runnable{
	
    private final Baralho baralho;
    private JogadorAbstrato jogadorDaVez;
    private ArrayList<JogadorAbstrato> jogadores;
    private PropertyChangeSupport anunciante;
    private Timer timer;

    public Jogo(String tema)throws NullThemeException{
        this.baralho = new Baralho(tema);
        this.jogadores = new ArrayList<>();
        this.anunciante = new PropertyChangeSupport(this);
        this.timer = new Timer();
    }

    public synchronized void partidaDeSuperTrunfo() {

        baralho.carregar();
        baralho.embaralhar();
        baralho.distribuir(jogadores);
        int indexJogadorDaVez = 0;
        
        while(!temVencedor()) {
                
                ArrayList<Carta> cartasEmJogo = new ArrayList<>();
                
                anunciante.firePropertyChange("inicioDePartida", 
                            null, 
                            null);

                setJogadorDaVez(getJogadores().get(indexJogadorDaVez));
                
                anunciante.firePropertyChange("mensagemJogadorDaVez", 
                            null, 
                            getJogadorDaVez().getNome());
                
                anunciante.firePropertyChange("status", 
                            null, 
                            mostrarStatus());
                
                getJogadores().forEach(jogador -> {
                    if(jogador instanceof entidades.Jogador)
                    anunciante.firePropertyChange("cartaAtual", 
                            null, 
                            jogador.getMonte().verDoTopo());
                });
                
                int atributoEscolhido = jogadorDaVez.jogarTurno();
                
                getJogadores().forEach(jogador -> {
                    if(jogador instanceof entidades.JogadorMaquina)
                        anunciante.firePropertyChange("cartaAdver", 
                                null, 
                                jogador.getMonte().verDoTopo());
                });
                
                anunciante.firePropertyChange("atributoEscolhido", 
                            null, 
                            getJogadorDaVez().getMonte().verDoTopo().getAtributos()[atributoEscolhido].getNome());
                
                getJogadores().forEach(jogador -> {
                    cartasEmJogo.add(jogador.getMonte().pegarDoTopo());
                });
                
                indexJogadorDaVez = cartaVencedora(cartasEmJogo, atributoEscolhido);
                
                for(Carta carta: cartasEmJogo)
                        getJogadores().get(indexJogadorDaVez).getMonte().adicionarCarta(carta);
                
                anunciante.firePropertyChange("mensagemVencedor", 
                            null, 
                            getJogadores().get(indexJogadorDaVez));
                
                removerPerdedores();
                
                timer.waitAMoment();
        }
        
        boolean vencedor = getJogadores().get(0) instanceof entidades.Jogador;
        anunciante.firePropertyChange("fimDeJogo",null,vencedor);
    }

    public HashMap<String, Number> mostrarStatus() {
        HashMap<String,  Number> status = new HashMap<>();
        
        for(JogadorAbstrato jogador: getJogadores())
            status.put(jogador.getNome(), 
                    jogador.getMonte().size());
        
        return status;
    }

    public void adicionarJogador(JogadorAbstrato jogador) {
            jogadores.add(jogador);
    }
    
    //Implementado pensando em futuro multiplayer
    private int cartaVencedora(ArrayList<Carta> listaDeCartas, int atributo) {
        
        ArrayList<Carta> cartas = listaDeCartas;
        Double valorMax = 0.0;
        
        int indice = 0;
        if(cartas.stream().anyMatch(x -> x.ehTrunfo())){
            if(!cartas.stream().anyMatch(x -> x.getCodigo().charAt(1) == 'A')){
                for(int c=0; c < cartas.size(); c++)
                    if(cartas.get(c).ehTrunfo())
                        return c;
            }
            
            cartas = (ArrayList<Carta>) cartas.stream().filter(
                    x ->x.getCodigo().charAt(1) == 'A' ||
                        x.ehTrunfo()).collect(Collectors.toList());
        }

        for(int i = 0; i < cartas.size(); i++) {
            Double valor = cartas.get(i).getAtributos()[atributo].getValor();
            if( valor >= valorMax) {
                    valorMax = valor;
                    indice = i;
            }
        }
        return indice;
    }

    private boolean temVencedor() {
        return getJogadores().size() <= 1;
    }

    private void removerPerdedores(){
        List<JogadorAbstrato> jogad = getJogadores();

        for(int indice=0; indice<jogad.size(); indice++)
            if(jogad.get(indice).getMonte().isEmpty()) jogadores.remove(jogad.get(indice));
    }

    //Getters e setters
    public JogadorAbstrato getJogadorDaVez(){
        return jogadorDaVez;
    }

    private void setJogadorDaVez(JogadorAbstrato jogador){
        this.jogadorDaVez = jogador;
    }

    private ArrayList<JogadorAbstrato> getJogadores(){
        return jogadores;
    }
    
    public Timer getTimer(){
        return this.timer;
    }
    
    //Método de Multithreading
    @Override
    public void run() {
        partidaDeSuperTrunfo();
    }
    
    //Métodos do padrão observer
    public void adicionarListener(PropertyChangeListener listener){
        anunciante.addPropertyChangeListener(listener);
    }
}