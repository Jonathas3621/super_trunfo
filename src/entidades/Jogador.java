package entidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Jogador extends JogadorAbstrato implements ActionListener{
        
    public static int atributoEscolhido;
    
    public Jogador(String nome) {
        super(nome);
    }

    @Override
    public synchronized int  jogarTurno() {
        setAtributoEscolhido(0);
        
        while (getAtributoEscolhido() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.err.println("Thread Interrupted");
            }
        }
        
        return getAtributoEscolhido()-1;
    }
    
    public static int getAtributoEscolhido(){
        return Jogador.atributoEscolhido;
    }
    
    private static void setAtributoEscolhido(int atributo){
        Jogador.atributoEscolhido = atributo;
    }

    @Override
    public synchronized void actionPerformed(ActionEvent e) {
        
        if(e.getSource() instanceof JButton){
            int att = Integer.parseInt(String.format(
                    "%c", 
                    ((JButton) e.getSource()).getText().charAt(3)));

            setAtributoEscolhido(att);
            notify();
        }
    }
}