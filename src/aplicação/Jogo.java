package aplicação;

import java.util.ArrayList;

import entidades.Baralho;
import entidades.Carta;
import entidades.JogadorAbstrato;
import java.util.List;
import java.util.stream.Collectors;
import exceções.ThemeNotAvailableException;

public class Jogo {
	
    private final Baralho baralho;
    private JogadorAbstrato jogadorDaVez;
    private ArrayList<JogadorAbstrato> jogadores;

    public Jogo(String tema) throws ThemeNotAvailableException{

        this.baralho = new Baralho(tema);
        jogadores = new ArrayList<>();
    }

    public void partidaDeSuperTrunfo() {

        baralho.carregar();
        baralho.embaralhar();
        baralho.distribuir(jogadores);
        int indexJogadorDaVez = 0;
        
        while(!temVencedor()) {

                ArrayList<Carta> cartasEmJogo = new ArrayList<>();

                setJogadorDaVez(getJogadores().get(indexJogadorDaVez));

                System.out.printf("Vez de %s%n%n", getJogadorDaVez().getNome());

                int atributoEscolhido = jogadorDaVez.jogarTurno();

                getJogadores().forEach(jogador -> {
                    cartasEmJogo.add(jogador.getMonte().pegarDoTopo());
                });

                System.out.printf("Cartas em jogo %s%n%n", cartasEmJogo);

                indexJogadorDaVez = cartaVencedora(cartasEmJogo, atributoEscolhido);

                for(Carta carta: cartasEmJogo)
                        getJogadores().get(indexJogadorDaVez).adicionarCarta(carta);

                System.out.printf("Jogador %s venceu!%n", getJogadores().get(indexJogadorDaVez).getNome());

                removerPerdedores();

                System.out.println("Status:");
                mostrarStatus();
                System.out.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=%n%n");
        }
        System.out.println("Alguém venveu");
    }

    public void mostrarStatus() {

            for(JogadorAbstrato jogador: jogadores) 
                    System.out.printf("%s: %d cartas.%n", jogador.getNome(), jogador.getMonte().size());
    }

    public void adicionarJogador(JogadorAbstrato jogador) {
            jogadores.add(jogador);
    }

    public void removerJogador(JogadorAbstrato jogador) {
            jogadores.remove(jogador);
    }
    
    /*
    private JogadorAbstrato proximoJogador() {
            ArrayList<JogadorAbstrato> jogad = getJogadores();

            int current = jogad.indexOf(getJogadorDaVez());

            if((current + 1) == jogad.size()) return jogad.get(0);
            else return jogad.get(current+1);
    }*/

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
            if( valor > valorMax) {
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

        for(JogadorAbstrato jogador: jogad)
            if(jogador.getMonte().isEmpty()) removerJogador(jogador);
    }

    public JogadorAbstrato getJogadorDaVez(){
        return jogadorDaVez;
    }

    private void setJogadorDaVez(JogadorAbstrato jogador){
        this.jogadorDaVez = jogador;
    }

    private ArrayList<JogadorAbstrato> getJogadores(){
        return jogadores;
    }
}
