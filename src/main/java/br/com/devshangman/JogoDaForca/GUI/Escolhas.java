/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devshangman.JogoDaForca.GUI;

import br.com.devshangman.JogoDaForca.Jogador.Jogador;
import br.com.devshangman.JogoDaForca.Palavras.Palavras;
import br.com.devshangman.JogoDaForca.Palavras.PalavrasDois;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXMLLoader;

/**
 *
 * @author lgdfj
 */
public class Escolhas extends javax.swing.JFrame {

    /**
     * Creates new form Escolhas
     */
    Jogador jogadorUm = null;
    Jogador jogadorDois = null;
    boolean Enviei = false;

    public Escolhas() {
        initComponents();
    }
    
    public Escolhas(List<Jogador> jogadores){
        initComponents();
        this.jogadorDois = jogadores.get(1);
        this.jogadorUm = jogadores.get(0);
        //informando qual jogador e quantas palavras ele deve colocar
        labelJogadorNome.setText(jogadorUm.getNome() + ", digite a palavra com " + jogadorUm.getLetras() + " letras para o "+ jogadorDois.getNome() + " advinhar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        labelJogadorNome = new javax.swing.JLabel();
        textPalavra1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textPalavra2 = new javax.swing.JTextField();
        qtdLetras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelJogadorNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelJogadorNome.setText("[Jogador 1], escolha uma palavra de [letras] letras para o jogador 2");
        labelJogadorNome.setName(""); // NOI18N

        textPalavra1.setText("Digite a palavra");
        textPalavra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPalavra1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Enviar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Palavra Jogador 1");

        jLabel2.setText("Palavra Jogador 2");

        textPalavra2.setText("Digite a palavra");
        textPalavra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPalavra2ActionPerformed(evt);
            }
        });

        qtdLetras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtdLetras.setText(" Lembre-se do número de letras    ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelJogadorNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPalavra1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPalavra2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(qtdLetras)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelJogadorNome, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(qtdLetras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPalavra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPalavra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(44, 44, 44))
        );

        setSize(new java.awt.Dimension(577, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Nomes tela = new Nomes();
        tela.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //fazendo a contagem para verificar quantas letras o usuário digitou no campo 1
        int letters =0;
         for(int i = 0; i < textPalavra1.getText().length(); i++){
            if(Character.isLetter(textPalavra1.getText().charAt(i)))
                letters++;
        }
         //verificando quantas letras o jgoador digitou no campo1
         if(letters == jogadorUm.getLetras())
         {
             qtdLetras.setText(" Lembre-se do número de letras");
             qtdLetras.setForeground(Color.BLACK);
             letters = 0;
          textPalavra2.setEnabled(true);
            //só vai entrar aqui quando ele clicar em enviar 2x para o segundo jogador colocar a sua palavra
            if(Enviei){
                //fazendo a contagem para verificar quantas letras o usuário digitou no campo 2
                letters =0;
                for(int i = 0; i < textPalavra2.getText().length(); i++){
                    if(Character.isLetter(textPalavra2.getText().charAt(i)))
                    letters++;
                }
                //verificando quantas letras o jogador digitou no campo 2
                if(letters == jogadorUm.getLetras())
                {
                    PalavrasDois textoUm = new PalavrasDois(textPalavra1.getText(),textPalavra2.getText());
                    PalavrasDois textoDois = new PalavrasDois(textPalavra1.getText(),textPalavra2.getText());
                    //palavraJogadorDois = textPalavra2.getText();    
                    Jogo tela = new Jogo(textoUm,textoDois,jogadorUm,jogadorDois);
                    tela.setVisible(true);
                    dispose();
                }else{
                    //se ele digitar a quantidade errada de letras informamos em vermelho e ele não prossegue com o jogo
                    qtdLetras.setText("Digite a quantidade de letras corretas");
                    qtdLetras.setForeground(Color.red);
                    letters = 0;
                }
            }
            //informando o jogador quem e a quantidade de letras que o jogador deve preencher 
            labelJogadorNome.setText(jogadorDois.getNome() + ", digite a palavra com " + jogadorUm.getLetras() + " letras para o "+ jogadorUm.getNome() + " advinhar");
            textPalavra2.setVisible(true);
            textPalavra1.setVisible(false);
            Enviei = true;
         }
         else{
             //se ele digitar a quantidade errada de letras informamos em vermelho e ele não prossegue com o jogo
             qtdLetras.setText("Digite a quantidade de letras corretas");
             qtdLetras.setForeground(Color.red);
             letters = 0;
             //System.out.println("Digite a quantidade de letras corretas");
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textPalavra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPalavra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPalavra2ActionPerformed

    private void textPalavra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPalavra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPalavra1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Escolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Escolhas().setVisible(true);

            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelJogadorNome;
    private javax.swing.JLabel qtdLetras;
    private javax.swing.JTextField textPalavra1;
    private javax.swing.JTextField textPalavra2;
    // End of variables declaration//GEN-END:variables
}
