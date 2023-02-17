package aplicação;

import java.util.Scanner;

import entidades.Jogador;
import entidades.JogadorMaquina;
import exceções.ThemeNotAvailableException;
import interfaces.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Principal implements ActionListener{
    private static Principal instancia = null;
    private static JFrame janelaAtual = null;
    private static Jogo partidaAtual = null;
    
    private Principal(){}
    
    public static Principal getInstance(){
        if(instancia == null) 
            instancia = new Principal();
        return instancia;
    }
    
    public static void main(String[] args) {
        JanelaInicial janelaInicial = new JanelaInicial();
        janelaInicial.adicionarEventListener(getInstance());
        setJanelaAtual(janelaInicial);
    }
    
    public JFrame getJanelaAtual(){
        return Principal.janelaAtual;
    }
    
    private static void setJanelaAtual(JFrame janela){
        Principal.janelaAtual = janela;
    }
    
    public static Jogo getJogo(){
        return Principal.partidaAtual;
    }
    
    private static void setJogo(Jogo partida){
        Principal.partidaAtual = partida;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println(((JButton) e.getSource()).getText());
        
        if(((JButton) e.getSource()).getText().equals("Jogar")) {
            
            String[] temas = {"Predadores", "Dinossauros", "Raças de D&D", "Criaturas Harry Potter"};
            
            Object tema = JOptionPane.showInputDialog(getJanelaAtual(),
                    "Escolha um item", "Opçao",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    temas, temas[0]); 
            
            try {
                setJogo(new Jogo((String) tema));
            } catch (ThemeNotAvailableException ex) {
                
            }
            
            Jogador jogadorw = new Jogador("Jonathas");
            JogadorMaquina jogadorBot = new JogadorMaquina("Bot");
            
            getJogo().adicionarJogador(jogadorw);
            getJogo().adicionarJogador(jogadorBot);
            
            getJanelaAtual().dispose();
            
            JanelaDeJogo janelaDeJogo= new JanelaDeJogo();
            setJanelaAtual(janelaDeJogo);
            janelaDeJogo.adicionarEventListener(jogadorw);
            
            System.out.println(janelaDeJogo);
            
            Thread thread = new Thread(getJogo());
            thread.start();
        }
    }
}
/*
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
*/