package aplicação;

import java.util.Scanner;

import entidades.Jogador;
import entidades.JogadorMaquina;
import exceções.ThemeNotAvailableException;

public class Principal {
    public static void main(String[] args) {
        
        System.out.println("Selecione um tema:");
        System.out.println("[Predadores, Dinossauros, Raças de D&D, Criaturas Harry Potter]");

        String tema;
        Scanner scanner = new Scanner(System.in);
        
        Jogo jogo = null;
        while(jogo == null){
            tema = scanner.nextLine();
            try{
                jogo = new Jogo(tema);
            }catch(ThemeNotAvailableException tnae){
                System.out.println(tnae.getMessage());
            }
        }
        
        jogo.adicionarJogador(new Jogador("Jonathas"));
        jogo.adicionarJogador(new JogadorMaquina("Bot"));

        jogo.partidaDeSuperTrunfo();
    }
}

