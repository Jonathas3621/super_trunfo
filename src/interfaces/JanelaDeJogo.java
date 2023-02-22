package interfaces;

import java.awt.event.ActionListener;
import entidades.Carta;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JanelaDeJogo extends javax.swing.JFrame implements PropertyChangeListener{
    
    public JanelaDeJogo() {
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
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
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        cartaAdverNome = new javax.swing.JLabel();
        cartaAdverTrunfo = new javax.swing.JLabel();
        cartaAdver01 = new javax.swing.JLabel();
        cartaAdver02 = new javax.swing.JLabel();
        cartaAdver03 = new javax.swing.JLabel();
        cartaAdver04 = new javax.swing.JLabel();
        jcartaAtual = new javax.swing.JPanel();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        cartaAtualNome = new javax.swing.JLabel();
        cartaAtualTrunfo = new javax.swing.JLabel();
        cartaAtual1 = new javax.swing.JLabel();
        cartaAtual2 = new javax.swing.JLabel();
        cartaAtual3 = new javax.swing.JLabel();
        cartaAtual4 = new javax.swing.JLabel();
        jStatus = new javax.swing.JPanel();
        jStatus01 = new javax.swing.JLabel();
        jStatus02 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jmensagem = new javax.swing.JLabel();
        jmensagemAux = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Att1");

        jButton2.setText("Att2");

        jButton3.setText("Att3");

        jButton4.setText("Att4");

        jcartaAdver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcartaAdver.setPreferredSize(new java.awt.Dimension(140, 180));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(10);
        jTextArea1.setRows(2);
        jTextArea1.setText("6");
        jTextArea1.setBorder(null);
        jTextArea1.setOpaque(false);

        cartaAdverNome.setText("nome");

        cartaAdverTrunfo.setText("1");

        cartaAdver01.setText("2");

        cartaAdver02.setText("3");

        cartaAdver03.setText("4");

        cartaAdver04.setText("5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartaAdverNome, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(cartaAdverTrunfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAdver01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAdver02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAdver03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAdver04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cartaAdverNome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAdverTrunfo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAdver01, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAdver02)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAdver03, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cartaAdver04, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jcartaAdverLayout = new javax.swing.GroupLayout(jcartaAdver);
        jcartaAdver.setLayout(jcartaAdverLayout);
        jcartaAdverLayout.setHorizontalGroup(
            jcartaAdverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcartaAdverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jcartaAdverLayout.setVerticalGroup(
            jcartaAdverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcartaAdverLayout.createSequentialGroup()
                .addGroup(jcartaAdverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jcartaAdverLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextArea1)))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);

        jcartaAtual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 0), new java.awt.Color(102, 204, 0), new java.awt.Color(0, 204, 51), new java.awt.Color(0, 204, 51)));
        jcartaAtual.setPreferredSize(new java.awt.Dimension(140, 180));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(10);
        jTextArea3.setRows(2);
        jTextArea3.setText("6");
        jTextArea3.setBorder(null);
        jTextArea3.setOpaque(false);

        cartaAtualNome.setText("nome");

        cartaAtualTrunfo.setText("1");

        cartaAtual1.setText("2");

        cartaAtual2.setText("3");

        cartaAtual3.setText("4");

        cartaAtual4.setText("5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartaAtualNome, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(cartaAtualTrunfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAtual1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAtual2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAtual3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartaAtual4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cartaAtualNome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAtualTrunfo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAtual1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAtual2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartaAtual3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cartaAtual4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jcartaAtualLayout = new javax.swing.GroupLayout(jcartaAtual);
        jcartaAtual.setLayout(jcartaAtualLayout);
        jcartaAtualLayout.setHorizontalGroup(
            jcartaAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcartaAtualLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jcartaAtualLayout.setVerticalGroup(
            jcartaAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcartaAtualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextArea3)
                .addContainerGap())
            .addGroup(jcartaAtualLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jTextArea3.setLineWrap(true);
        jTextArea3.setWrapStyleWord(true);

        jStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
        jmensagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jmensagemAux.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Atributo Escolhido:");

        jButton5.setText("Continuar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcartaAdver, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton5)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jcartaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton3))
                                            .addComponent(jButton2))
                                        .addComponent(jButton1)))))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jmensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jmensagemAux, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jmensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jmensagemAux, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcartaAdver, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jcartaAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))))
                .addContainerGap(32, Short.MAX_VALUE))
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
    private javax.swing.JLabel cartaAdverNome;
    private javax.swing.JLabel cartaAdverTrunfo;
    private javax.swing.JLabel cartaAtual1;
    private javax.swing.JLabel cartaAtual2;
    private javax.swing.JLabel cartaAtual3;
    private javax.swing.JLabel cartaAtual4;
    private javax.swing.JLabel cartaAtualNome;
    private javax.swing.JLabel cartaAtualTrunfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jStatus;
    private javax.swing.JLabel jStatus01;
    private javax.swing.JLabel jStatus02;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JPanel jcartaAdver;
    private javax.swing.JPanel jcartaAtual;
    private javax.swing.JLabel jmensagem;
    private javax.swing.JLabel jmensagemAux;
    // End of variables declaration//GEN-END:variables
    
    private void setStatus(HashMap status){
        Object[] keys = status.keySet().toArray();
        Component[] listaDeComponentes = this.jStatus.getComponents();
        
        for(int i=0; i < listaDeComponentes.length; i++){
            ((JLabel) listaDeComponentes[i]).setText(String.format("%s: %s cartas", keys[i], 
                    status.get(keys[i])));    
        }
    }
    
    private void atualizarLabels(JPanel carta, String[] dados){
        System.out.println("okTEstecerto");
        Component[] labels = carta.getComponents();
        Component[] teste = ((JPanel) carta.getComponents()[0]).getComponents();
        
        ((JTextArea)labels[1]).setText(dados[6]);
        for(int c=0; c<teste.length; c++){
            ((JLabel) teste[c]).setText(dados[c]);
        }
    }
    
    private void atualizarLabels(JPanel carta){
        Component[] labels = carta.getComponents();
        Component[] teste = ((JPanel) carta.getComponents()[0]).getComponents();
        
        ((JTextArea)labels[1]).setText("");
        for(int c=0; c<teste.length; c++){
            ((JLabel) teste[c]).setText("");
        }
    }
    
    public void adicionarActionListener(ActionListener listener, boolean atributos){
        if(atributos){
            jButton1.addActionListener(listener);
            jButton2.addActionListener(listener);
            jButton3.addActionListener(listener);
            jButton4.addActionListener(listener);
        }else{
            jButton5.addActionListener(listener);
        }
    }
    
    private void alterarBordas(JPanel panel, boolean destacar){
        
        if(destacar) 
            panel.setBorder(javax.swing.BorderFactory.createBevelBorder(
                javax.swing.border.BevelBorder.RAISED, 
                new java.awt.Color(102, 204, 0), 
                new java.awt.Color(102, 204, 0), 
                new java.awt.Color(0, 204, 51), 
                new java.awt.Color(0, 204, 51)));
        else
            panel.setBorder(javax.swing.BorderFactory.createBevelBorder(
                javax.swing.border.BevelBorder.RAISED));
        
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        
        switch(evt.getPropertyName()){
            case "cartaAtual":
                Carta cartaAtual = (Carta) evt.getNewValue();
                atualizarLabels(jcartaAtual, cartaAtual.extrairDadosComoString());
                break;
            case "cartaAdver":
                Carta cartaAdver = (Carta) evt.getNewValue();
                atualizarLabels(jcartaAdver, cartaAdver.extrairDadosComoString());
                break;
            case "status":
                setStatus((HashMap) evt.getNewValue());
                break;
            case "atributoEscolhido":
                jmensagemAux.setText(" " + (String) evt.getNewValue());
                break;
            case "mensagemJogadorDaVez":
                jmensagem.setText(String.format(" Vez de %s" ,evt.getNewValue()));
                break;
            case "mensagemVencedor":
                jmensagem.setText(String.format(" %s ganhou a rodada!!" ,
                        ((entidades.JogadorAbstrato) evt.getNewValue()).getNome()));
                
                if(evt.getNewValue() instanceof entidades.Jogador) 
                    alterarBordas(jcartaAtual, true);
                else
                    alterarBordas(jcartaAdver,true);
                break;
            case "inicioDePartida":
                jmensagemAux.setText("");
                atualizarLabels(jcartaAdver);
                alterarBordas(jcartaAtual, false);
                alterarBordas(jcartaAdver,false);
                break;
        }
    }
}
