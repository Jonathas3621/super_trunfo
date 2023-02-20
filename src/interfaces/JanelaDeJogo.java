package interfaces;

import java.awt.event.ActionListener;
import entidades.Carta;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JanelaDeJogo extends javax.swing.JFrame implements PropertyChangeListener{
    
    private Carta cartaAtual;
    private Carta cartaAdver;
    
    public JanelaDeJogo() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jcartaAdver = new javax.swing.JPanel();
        cartaAdverNome = new javax.swing.JLabel();
        cartaAdver01 = new javax.swing.JLabel();
        cartaAdver03 = new javax.swing.JLabel();
        cartaAdver02 = new javax.swing.JLabel();
        cartaAdver04 = new javax.swing.JLabel();
        cartaAdverCurio = new javax.swing.JLabel();
        jcartaAtual = new javax.swing.JPanel();
        cartaAtualName = new javax.swing.JLabel();
        cartaAtual01 = new javax.swing.JLabel();
        cartaAtual02 = new javax.swing.JLabel();
        cartaAtual03 = new javax.swing.JLabel();
        cartaAtual04 = new javax.swing.JLabel();
        cartaAtualCurio = new javax.swing.JLabel();
        jStatus = new javax.swing.JPanel();
        jStatus01 = new javax.swing.JLabel();
        jStatus02 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jmensagem = new javax.swing.JLabel();
        jmensagemAux = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Att1");

        jButton2.setText("Att2");

        jButton3.setText("Att3");

        jButton4.setText("Att4");

        jcartaAdver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jcartaAdver.setPreferredSize(new java.awt.Dimension(140, 180));

        cartaAdverCurio.setPreferredSize(new java.awt.Dimension(140, 180));

        javax.swing.GroupLayout jcartaAdverLayout = new javax.swing.GroupLayout(jcartaAdver);
        jcartaAdver.setLayout(jcartaAdverLayout);
        jcartaAdverLayout.setHorizontalGroup(
            jcartaAdverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcartaAdverLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jcartaAdverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartaAdverNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAdver01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAdver02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAdver03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAdver04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAdverCurio, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap())
        );
        jcartaAdverLayout.setVerticalGroup(
            jcartaAdverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcartaAdverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cartaAdverNome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cartaAdver01, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAdver02, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAdver03, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAdver04, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAdverCurio, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jcartaAtual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jcartaAtual.setPreferredSize(new java.awt.Dimension(140, 180));

        cartaAtualName.setText("Namae");

        cartaAtual01.setText("01");

        cartaAtual02.setText("02");

        cartaAtual03.setText("03");

        cartaAtual04.setText("04");

        cartaAtualCurio.setText("text");

        javax.swing.GroupLayout jcartaAtualLayout = new javax.swing.GroupLayout(jcartaAtual);
        jcartaAtual.setLayout(jcartaAtualLayout);
        jcartaAtualLayout.setHorizontalGroup(
            jcartaAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcartaAtualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jcartaAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartaAtualName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(cartaAtual01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAtual02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAtual03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAtual04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAtualCurio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jcartaAtualLayout.setVerticalGroup(
            jcartaAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcartaAtualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cartaAtualName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cartaAtual01, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAtual02, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAtual03, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAtual04, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAtualCurio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jStatus01.setPreferredSize(new java.awt.Dimension(37, 30));

        javax.swing.GroupLayout jStatusLayout = new javax.swing.GroupLayout(jStatus);
        jStatus.setLayout(jStatusLayout);
        jStatusLayout.setHorizontalGroup(
            jStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jStatus01, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jStatus02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jStatusLayout.setVerticalGroup(
            jStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jStatusLayout.createSequentialGroup()
                .addComponent(jStatus01, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jStatus02, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setText("Status");

        jmensagem.setText(" ");
        jmensagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jmensagemAux.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Atributo Escolhido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jcartaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addComponent(jButton2))
                    .addComponent(jButton1))
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jmensagemAux, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(101, 101, 101)
                        .addComponent(jcartaAdver, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jmensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jmensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jmensagemAux, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcartaAdver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcartaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cartaAdver01;
    private javax.swing.JLabel cartaAdver02;
    private javax.swing.JLabel cartaAdver03;
    private javax.swing.JLabel cartaAdver04;
    private javax.swing.JLabel cartaAdverCurio;
    private javax.swing.JLabel cartaAdverNome;
    private javax.swing.JLabel cartaAtual01;
    private javax.swing.JLabel cartaAtual02;
    private javax.swing.JLabel cartaAtual03;
    private javax.swing.JLabel cartaAtual04;
    private javax.swing.JLabel cartaAtualCurio;
    private javax.swing.JLabel cartaAtualName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jStatus;
    private javax.swing.JLabel jStatus01;
    private javax.swing.JLabel jStatus02;
    private javax.swing.JPanel jcartaAdver;
    private javax.swing.JPanel jcartaAtual;
    private javax.swing.JLabel jmensagem;
    private javax.swing.JLabel jmensagemAux;
    // End of variables declaration//GEN-END:variables
    
    private Carta getCartaAtual(){
        return this.cartaAtual;
    }
    
    private void setCartaAtual(Carta carta){
        this.cartaAtual = carta;
    }
    
    private Carta getCartaAdver(){
        return this.cartaAdver;
    }
    
    private void setCartaAdver(Carta cartas){
        this.cartaAdver = cartas;
    }
    
    private void setStatus(HashMap status){
        Object[] keys = status.keySet().toArray();
        Component[] listaDeComponentes = this.jStatus.getComponents();
        
        for(int i=0; i < listaDeComponentes.length; i++){
            ((JLabel) listaDeComponentes[i]).setText(String.format("%s: %s cartas", keys[i], 
                    status.get(keys[i])));    
        }
    }
    
    private void atualizarLabels(JPanel carta, String[] dados){
        Component[] labels = carta.getComponents();
                
        for(int c=0; c<labels.length; c++){
            //((JLabel) labels[c]).setText(dados[c]);
        }
        
        for(int c=0; c<labels.length; c++){
            System.out.println(((JLabel) labels[c]).getText());
        }
    }
    
    private void atualizarLabels(JPanel carta){
        Component[] labels = carta.getComponents();
        for (Component label : labels) {
            ((JLabel) label).setText("");
        }
    }
    
    public void adicionarEventListener(ActionListener listener){
        jButton1.addActionListener(listener);
        jButton2.addActionListener(listener);
        jButton3.addActionListener(listener);
        jButton4.addActionListener(listener);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        
        switch(evt.getPropertyName()){
            case "cartaAtual":
                setCartaAtual((Carta) evt.getNewValue());
                
                atualizarLabels(jcartaAtual, getCartaAtual().extrairDadosComoString());
                break;
            case "cartaAdver":
                setCartaAdver((Carta) evt.getNewValue());
                
                atualizarLabels(jcartaAdver, getCartaAdver().extrairDadosComoString());
                break;
            case "status":
                setStatus((HashMap) evt.getNewValue());
                break;
            case "atributoEscolhido":
                jmensagemAux.setText((String) evt.getNewValue());
                break;
            case "mensagemJogadorDaVez":
                jmensagem.setText(String.format("Vez de %s" ,evt.getNewValue()));
                break;
            case "mensagemVencedor":
                jmensagem.setText(String.format("%s ganhou a rodada!!" ,evt.getNewValue()));
                break;
            case "inicioDePartida":
                jmensagemAux.setText("");
                atualizarLabels(jcartaAdver);
                break;
        }
    }
}
