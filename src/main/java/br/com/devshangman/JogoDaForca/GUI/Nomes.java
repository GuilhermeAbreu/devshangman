/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devshangman.JogoDaForca.GUI;

import br.com.devshangman.JogoDaForca.Jogador.Jogador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.fxml.FXMLLoader;

import javax.swing.*;

/**
 *
 * @author lgdfj
 */
public class Nomes extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public Nomes() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jogarButton = new javax.swing.JButton();
        textPrimeiroJogador = new javax.swing.JTextField();
        textSegundoJogador = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("HANGMAN");

        jogarButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jogarButton.setText("Jogar");
        jogarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarButtonActionPerformed(evt);
            }
        });

        textPrimeiroJogador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textPrimeiroJogador.setText("Primeiro Jogador");
        textPrimeiroJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrimeiroJogadorActionPerformed(evt);
            }
        });

        textSegundoJogador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textSegundoJogador.setText("Segundo Jogador");
        textSegundoJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSegundoJogadorActionPerformed(evt);
            }
        });

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Fácil");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Médio");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Difícil");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        voltarButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(voltarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jogarButton)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textSegundoJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCheckBox1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckBox3))
                                .addComponent(textPrimeiroJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addGap(18, 18, 18)
                .addComponent(textPrimeiroJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textSegundoJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jogarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        textSegundoJogador.getAccessibleContext().setAccessibleName("textSegundoJogador");
        textSegundoJogador.getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(547, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void textSegundoJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSegundoJogadorActionPerformed

        //Jogador jogador = new Jogador(1,textSegundoJogador.getText());
        
       
    }//GEN-LAST:event_textSegundoJogadorActionPerformed

    private void textPrimeiroJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrimeiroJogadorActionPerformed

        //Jogador jogador = new Jogador(2,textPrimeiroJogador.getText());
    }//GEN-LAST:event_textPrimeiroJogadorActionPerformed

   
    
    
    
    
    
    
    
    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed

        boolean isSelected3 = jCheckBox3.isSelected();
        
        if(isSelected3)
        {
            jCheckBox1.setSelected(false); 
            jCheckBox2.setSelected(false); 
        }

    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        boolean isSelected2 = jCheckBox2.isSelected();
        
        if(isSelected2)
        { 
            jCheckBox1.setSelected(false); 
            jCheckBox3.setSelected(false); 
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        
        boolean isSelected1 = jCheckBox1.isSelected();
        if(isSelected1)
        {
            jCheckBox2.setSelected(false); 
            jCheckBox3.setSelected(false); 
        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    
    
    
    
    private void jogarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarButtonActionPerformed
        // TODO add your handling code here:

        if(jCheckBox1.isSelected()){
            validarNome(5);
        }else if(jCheckBox2.isSelected()){
            validarNome(6);
        }else if(jCheckBox3.isSelected()){
            validarNome(7);
        }else{
            JOptionPane.showMessageDialog(null,"Marque uma opção");
        }

    }//GEN-LAST:event_jogarButtonActionPerformed


    public void validarNome(int opcao){

        //Criar jogadores
        if(!textPrimeiroJogador.getText().equals("Primeiro Jogador") && textPrimeiroJogador.getText() != null && textPrimeiroJogador.getText().length() > 3){
            if(!textSegundoJogador.getText().equals("Segundo Jogador") && textSegundoJogador.getText() != null && textSegundoJogador.getText().length() > 3){
                List<Jogador> jogadores = new ArrayList<Jogador>();
                Jogador jogador = new Jogador();
                jogadores.add(jogador.jogador(1,textPrimeiroJogador.getText(), opcao));
                jogadores.add(jogador.jogador(2,textSegundoJogador.getText(), opcao));
                iniciarTelaParaPegarOsNome(jogadores);
            }else{
                janelaAlerta(textSegundoJogador.getText());
            }
        }else{
            janelaAlerta(textPrimeiroJogador.getText());
        }

    }

    public void janelaAlerta(String nome){
        JOptionPane.showMessageDialog(null,"Nome: ("+nome+") \nNão segue o padrão esperado \n \t Maior que três caracter\n \t não pode ser nulo ou vazio \n \t");
    }

    public void iniciarTelaParaPegarOsNome(List<Jogador> jogadores){
        Escolhas tela = new Escolhas(jogadores);
        tela.setVisible(true);
        dispose();
    }


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
            java.util.logging.Logger.getLogger(Nomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nomes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jogarButton;
    private javax.swing.JTextField textPrimeiroJogador;
    public javax.swing.JTextField textSegundoJogador;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
