package aplicação;

import Exceções.NullThemeException;
import entidades.Jogador;
import entidades.JogadorMaquina;
import interfaces.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Principal implements ActionListener, PropertyChangeListener{
    private static Principal instancia = null;
    private static JFrame janelaAtual = null;
    
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
    
    public JFrame getJanelaAtual(){
        return Principal.janelaAtual;
    }
    
    private static void setJanelaAtual(JFrame janela){
        Principal.janelaAtual = janela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        
        if(button.getText().equals("Jogar") || button.getText().equals("Jogar Novamente")){ 
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
            
            Jogador jogadorw = new Jogador("Jonathas");
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