package aplicação;

import jogo.Jogo;
import Exceções.NullThemeException;
import Exceções.UserWithoutNameException;
import entidades.Jogador;
import entidades.JogadorMaquina;
import interfaces.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Principal implements ActionListener, PropertyChangeListener{
    private static Principal instancia = null;
    private static JFrame janelaAtual = null;
    private static String nomeDeUsuario = "";
    
    private Principal(){}
    
    public static Principal getInstance(){
        if(instancia == null) 
            instancia = new Principal();
        return instancia;
    }
    
    public static void main(String[] args) {
        JanelaInicial janelaInicial = new JanelaInicial();
        janelaInicial.adicionarActionListener(getInstance());
        setJanelaAtual(janelaInicial);
    }
    
    //Getters e setters
    public JFrame getJanelaAtual(){
        return Principal.janelaAtual;
    }
    
    private static void setJanelaAtual(JFrame janela){
        Principal.janelaAtual = janela;
    }
    
    public static String getNomeDeUsuario(){
        return Principal.nomeDeUsuario;
    }
    
    public static void setNomeDeUsuario(String nomeDeUsuario){
        Principal.nomeDeUsuario = nomeDeUsuario;
    }
    
    //Métodos do padrão observer
    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton button = (JButton) e.getSource();

        if(button.getText().equals("Jogar") || button.getText().equals("Jogar Novamente")){ 
            
            try{
                if(getNomeDeUsuario().isEmpty() && getJanelaAtual() instanceof JanelaInicial){
                    throw new UserWithoutNameException();
                }
            }catch(UserWithoutNameException uwne){
                PropertyChangeSupport pcs = new PropertyChangeSupport(getInstance());
                pcs.addPropertyChangeListener((JanelaInicial) getJanelaAtual());
                pcs.firePropertyChange("UserWithoutName", null, null);
                return;
            }
            
            String[] temas = {"Skyrim", "Dinossauros", "Raças de D&D", "Criaturas Harry Potter"};

            Object tema = JOptionPane.showInputDialog(getJanelaAtual(),
                    "Escolha um Tema", "Tema",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    temas, temas[0]); 

            Jogo partida = null;

            try{
                partida = new Jogo((String) tema);
            }catch(NullThemeException nte){
                return;
            }

            Jogador jogadorw = new Jogador(getNomeDeUsuario());
            JogadorMaquina jogadorBot = new JogadorMaquina("Bot");

            partida.adicionarJogador(jogadorw);
            partida.adicionarJogador(jogadorBot);

            getJanelaAtual().dispose();

            JanelaDeJogo janelaDeJogo= new JanelaDeJogo();
            janelaDeJogo.adicionarActionListener(jogadorw, true);
            janelaDeJogo.adicionarActionListener(partida.getTimer(),false);
            setJanelaAtual(janelaDeJogo);

            partida.adicionarListener(janelaDeJogo);
            partida.adicionarListener(getInstance());

            Thread thread = new Thread(partida);
            thread.start();
        }
        if(button.getText().equals("Ir para o menu") ||
                button.getText().equals("Voltar")){
            getJanelaAtual().dispose();
            JanelaInicial janelaInicial = new JanelaInicial();
            janelaInicial.adicionarActionListener(getInstance());
            setJanelaAtual(janelaInicial);
        }
        if(button.getText().equals("Sair")){
            getJanelaAtual().dispose();
            System.exit(0);
        }
        if(button.getText().equals("Ver regras")){
            getJanelaAtual().dispose();
            JanelaDeRegras janelaDeRegras = new JanelaDeRegras();
            janelaDeRegras.adicionarActionListener(getInstance());
            setJanelaAtual(janelaDeRegras);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals("fimDeJogo")){
            getJanelaAtual().dispose();
            JanelaDeFimDeJogo fimDeJogo = new JanelaDeFimDeJogo((boolean) evt.getNewValue());
            fimDeJogo.adicionarActionListener(getInstance());
            setJanelaAtual(fimDeJogo);
        }  
    }
}