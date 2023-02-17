package entidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.util.Random;

public class Jogador extends JogadorAbstrato implements ActionListener{
        
    public static int atributoEscolhido;
    
    public Jogador(String nome) {
        super(nome);
    }

    @Override
    public synchronized int  jogarTurno() {
        atributoEscolhido = 0;
        
        while (atributoEscolhido == 0) {
            try {
                wait(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.err.println("Thread Interrupted");
            }
        }
        
        System.out.println("Voltou");
        
        return atributoEscolhido-1;
    }
    
    public static int getAtributoEscolhido(){
        return Jogador.atributoEscolhido;
    }
    
    private static void setAtributoEscolhido(int atributo){
        Jogador.atributoEscolhido = atributo;
    }

    @Override
    public synchronized void actionPerformed(ActionEvent e) {
        
        int att = Integer.parseInt(String.format(
                "%c", 
                ((JButton) e.getSource()).getText().charAt(3)));
        
        System.out.println(att);
        setAtributoEscolhido(att);
        notifyAll();
    }
}