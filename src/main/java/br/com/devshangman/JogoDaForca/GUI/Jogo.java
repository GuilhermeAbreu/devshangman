/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devshangman.JogoDaForca.GUI;
import br.com.devshangman.JogoDaForca.Jogador.Jogador;
import br.com.devshangman.JogoDaForca.Palavras.PalavrasDois;
import javax.swing.*;
import javax.swing.JOptionPane;


/**
 *
 * @author lgdfj
 */
public class Jogo extends javax.swing.JFrame {
    Jogador jogadorUm = null;
    Jogador jogadorDois = null;
    PalavrasDois palavraJogadorUm = null;
    PalavrasDois palavraJogadorDois = null;
    int acertos;
    int errou;
    int erro;
    char tentativa,primeiro,segundo,terceiro,quarto,quinto,sexto,setimo;
    int letters = 0;
    String texto;
    
    
    
    
    /**
     * Creates new form Jogo
     */
    public Jogo() {
        
        initComponents();
        
    }


    public void Atualizar()
    {
        letters = jogadorUm.getLetras();
        texto = palavraJogadorUm.getPalavrasUm();
        titulo.setText("Vez de " + jogadorDois.getNome() + " jogar" );
        letraUm.setText("__");
        letraDois.setText("__");
        letraTres.setText("__");
        letraQuatro.setText("__");
        letraCinco.setText("__");
        if(letters >= 6){
            letraSeis.setText("__");
                if(letters == 7){
                    letraSete.setText("__");
                }
        }
        
        acertos =0;
        erro = 0;
        errou = 0;
        textoTentativaa.setText(" ");

        hack.setText(palavraJogadorUm.getPalavrasUm());

            if(letters == 5){
            char[] letras = texto.toCharArray();
            primeiro = texto.charAt(0);
            segundo = texto.charAt(1);
            terceiro = texto.charAt(2);
            quarto = texto.charAt(3);
            quinto = texto.charAt(4);

            letraSeis.setVisible(false);  
            letraSete.setVisible(false);  
        }
        if(letters == 6){
            char[] letras = texto.toCharArray();
            primeiro = texto.charAt(0);
            segundo = texto.charAt(1);
            terceiro = texto.charAt(2);
            quarto = texto.charAt(3);
            quinto = texto.charAt(4);
            sexto = texto.charAt(5);


            letraSete.setVisible(false);  
        }
        if(letters == 7){
            char[] letras = texto.toCharArray();
            primeiro = texto.charAt(0);
            segundo = texto.charAt(1);
            terceiro = texto.charAt(2);
            quarto = texto.charAt(3);
            quinto = texto.charAt(4);
            sexto = texto.charAt(5);
            setimo = texto.charAt(6);
        }
        
        
        ImageIcon icon = new ImageIcon("src/main/java/br/com/devshangman/JogoDaForca/Boneco/gallows.jpg");
        icon.setImage(icon.getImage().getScaledInstance(imagemForca.getWidth(),imagemForca.getHeight(),1));
        imagemForca.setIcon(icon);
        

    }
    public Jogo(PalavrasDois palavraJogadorUm,PalavrasDois palavraJogadorDois,Jogador jogadorUm, Jogador jogadorDois){
        initComponents();
        
        this.jogadorDois = jogadorDois;
        this.jogadorUm = jogadorUm;
        this.palavraJogadorUm = palavraJogadorUm;
        this.palavraJogadorDois = palavraJogadorDois;

        System.out.println("Entrei Jogo");
        
        System.out.println("Entrei Atualizar");
        titulo.setText("Vez de " + jogadorUm.getNome() + " jogar" );

        letters = jogadorDois.getLetras();
        texto = palavraJogadorDois.getPalavrasDois();
        hack.setText(palavraJogadorDois.getPalavrasDois());
        System.out.println("Sai atualizar");
        char[] letras = texto.toCharArray();

        switch (letters){
            case 5:
                primeiro = texto.charAt(0);
                segundo = texto.charAt(1);
                terceiro = texto.charAt(2);
                quarto = texto.charAt(3);
                quinto = texto.charAt(4);
                letraSeis.setVisible(false);
                letraSete.setVisible(false);
                break;
            case 6:
                primeiro = texto.charAt(0);
                segundo = texto.charAt(1);
                terceiro = texto.charAt(2);
                quarto = texto.charAt(3);
                quinto = texto.charAt(4);
                sexto = texto.charAt(5);


                letraSete.setVisible(false);
                break;
            case 7:
                primeiro = texto.charAt(0);
                segundo = texto.charAt(1);
                terceiro = texto.charAt(2);
                quarto = texto.charAt(3);
                quinto = texto.charAt(4);
                sexto = texto.charAt(5);
                setimo = texto.charAt(6);
                break;
            default:
                break;
        }

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        tentar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imagemForca = new javax.swing.JLabel();
        quantidadeErros = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        hack = new javax.swing.JLabel();
        letraUm = new javax.swing.JLabel();
        letraDois = new javax.swing.JLabel();
        letraTres = new javax.swing.JLabel();
        letraQuatro = new javax.swing.JLabel();
        letraCinco = new javax.swing.JLabel();
        textoTentativaa = new javax.swing.JTextField();
        letraSeis = new javax.swing.JLabel();
        letraSete = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tentar.setText("Tentar");
        tentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tentarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Digite uma letra");

        imagemForca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallowsPronto.png"))); // NOI18N
        imagemForca.setPreferredSize(new java.awt.Dimension(200, 200));

        quantidadeErros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantidadeErros.setText("Erros: ");

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setText("Vez de Jogador 1");

        hack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hack.setText("hack");

        letraUm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        letraUm.setText("___");

        letraDois.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        letraDois.setText("___");

        letraTres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        letraTres.setText("___");

        letraQuatro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        letraQuatro.setText("___");

        letraCinco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        letraCinco.setText("___");

        textoTentativaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTentativaaActionPerformed(evt);
            }
        });

        letraSeis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        letraSeis.setText("___");

        letraSete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        letraSete.setText("___");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(382, 382, 382))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantidadeErros, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(letraUm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(letraDois)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(letraTres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(letraQuatro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(letraCinco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(letraSeis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(letraSete))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hack)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tentar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoTentativaa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagemForca, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quantidadeErros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(letraUm)
                                    .addComponent(letraDois)
                                    .addComponent(letraTres)
                                    .addComponent(letraQuatro)
                                    .addComponent(letraCinco)
                                    .addComponent(letraSeis)
                                    .addComponent(letraSete))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(textoTentativaa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addComponent(hack))
                            .addComponent(tentar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imagemForca, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        setSize(new java.awt.Dimension(613, 411));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    
    
   

    private void tentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tentarActionPerformed
        // TODO add your handling code here:
        //if(textoTentativa.getText());{
        //ImageIcon icone = new ImageIcon("imagem.jpg");
        //JLabel label = new JLabel(icone);
 
        
        errou = 0;
        tentativa = textoTentativaa.getText().charAt(0);
        
        System.out.println("tentativa :"+ tentativa + ":" + primeiro + ":" +  segundo  +" " +  terceiro +" " + quarto +" " + quinto);
         if (primeiro == tentativa)
            {
                System.out.println("você acertou");
                letraUm.setText(Character.toString(primeiro));
                acertos++;
            }
        if(segundo == tentativa)
            {
                System.out.println("você acertou");
                letraDois.setText(Character.toString(segundo));
                acertos++;
                                
            }
        if (terceiro == tentativa)
            {
                System.out.println("você acertou");
                letraTres.setText(Character.toString(terceiro));
                acertos++;
            }
        if (quarto == tentativa)
            {
                System.out.println("você acertou");
                letraQuatro.setText(Character.toString(quarto));
                acertos++;
            }
        if (quinto == tentativa)
            {
                System.out.println("você acertou");
                letraCinco.setText(Character.toString(quinto));
                acertos++;
            }
        if(letters >= 6){
            if (sexto == tentativa)
                {
                    System.out.println("você acertou");
                    letraSeis.setText(Character.toString(sexto));
                    acertos++;
                }
            if(letters == 7){
                 if (setimo == tentativa)
            {
                System.out.println("você acertou");
                letraSete.setText(Character.toString(setimo));
                acertos++;
            }
            }
            
        
        }
        
       //condição vitoria
        if(acertos == letters){ JOptionPane.showMessageDialog(null,"Parabéns, você conseguiu ","Uhull",JOptionPane.INFORMATION_MESSAGE);
        System.out.println("parabéns");

        ImageIcon icon = new ImageIcon("src/main/java/br/com/devshangman/JogoDaForca/Boneco/gallows.jpg");
        icon.setImage(icon.getImage().getScaledInstance(imagemForca.getWidth(),imagemForca.getHeight(),1));
        imagemForca.setIcon(icon);
        errou =0;
        erro = 0;
        quantidadeErros.setText("Erros: " + Integer.toString(erro));
        Atualizar();
        System.out.println("resetei");
        
        
        //chamar vez jogador 2
        
        
        }
            
            
            
            if (tentativa != primeiro)
            {
                System.out.println("você errou 1");
                errou++;
            }
            if (tentativa != segundo)
            {
                System.out.println("você errou 2");
                                errou++;
            }
            if (tentativa != terceiro)
            {
                System.out.println("você errou 3");
                                errou++;
            }
            if (tentativa != quarto)
            {
                System.out.println("você errou 4");
                                errou++;
            }
            if (tentativa != quinto)
            {
                System.out.println("você errou 5");
                                errou++;
            }
            if(letters >= 6){
                if (tentativa != sexto)
                {
                    System.out.println("você errou 6");
                                    errou++;
                }
                if(letters == 7){
                    if (tentativa != setimo)
                {
                    System.out.println("você errou 7");
                    errou++;
                }
                }
            }
            
            
            if(errou == letters){
                
                erro+=1;
                quantidadeErros.setText("Erros: " + Integer.toString(erro));
                if(erro ==1){
                    
                ImageIcon icon = new ImageIcon("src/main/java/br/com/devshangman/JogoDaForca/Boneco/gallows1.jpg");
                icon.setImage(icon.getImage().getScaledInstance(imagemForca.getWidth(),imagemForca.getHeight(),1));
                imagemForca.setIcon(icon);
                }
                if(erro ==2){
                ImageIcon icon = new ImageIcon("src/main/java/br/com/devshangman/JogoDaForca/Boneco/gallows2.jpg");
                icon.setImage(icon.getImage().getScaledInstance(imagemForca.getWidth(),imagemForca.getHeight(),1));
                imagemForca.setIcon(icon);
                }
                if(erro ==3){
                ImageIcon icon = new ImageIcon("src/main/java/br/com/devshangman/JogoDaForca/Boneco/gallows3.jpg");
                icon.setImage(icon.getImage().getScaledInstance(imagemForca.getWidth(),imagemForca.getHeight(),1));
                imagemForca.setIcon(icon);
                }
                if(erro ==4){
                ImageIcon icon = new ImageIcon("src/main/java/br/com/devshangman/JogoDaForca/Boneco/gallows4.jpg");
                icon.setImage(icon.getImage().getScaledInstance(imagemForca.getWidth(),imagemForca.getHeight(),1));
                imagemForca.setIcon(icon);
                }
                if(erro ==5){
                ImageIcon icon = new ImageIcon("src/main/java/br/com/devshangman/JogoDaForca/Boneco/gallows5.jpg");
                icon.setImage(icon.getImage().getScaledInstance(imagemForca.getWidth(),imagemForca.getHeight(),1));
                imagemForca.setIcon(icon);
                }
                //condição derrota
                if(erro >=6){
                ImageIcon icon = new ImageIcon("src/main/java/br/com/devshangman/JogoDaForca/Boneco/gallows6.jpg");
                icon.setImage(icon.getImage().getScaledInstance(imagemForca.getWidth(),imagemForca.getHeight(),1));
                imagemForca.setIcon(icon);
                
                
                
                icon = new ImageIcon("src/main/java/br/com/devshangman/JogoDaForca/Boneco/gallows.jpg");
                icon.setImage(icon.getImage().getScaledInstance(imagemForca.getWidth(),imagemForca.getHeight(),1));
                imagemForca.setIcon(icon);
                errou =0;
                erro = 0;
                acertos =0;
                Atualizar();
                JOptionPane.showMessageDialog(null,"Não foi dessa vez, mas na próxima quem sabe.. ","Quasee ",JOptionPane.INFORMATION_MESSAGE);
                //chamar vez jogador 2

                }
                errou = 0;
            }
        
            
            
            
        
   // }
    }//GEN-LAST:event_tentarActionPerformed
    
    private void textoTentativaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTentativaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTentativaaActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hack;
    private javax.swing.JLabel imagemForca;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel letraCinco;
    private javax.swing.JLabel letraDois;
    private javax.swing.JLabel letraQuatro;
    private javax.swing.JLabel letraSeis;
    private javax.swing.JLabel letraSete;
    private javax.swing.JLabel letraTres;
    private javax.swing.JLabel letraUm;
    private javax.swing.JLabel quantidadeErros;
    private javax.swing.JButton tentar;
    private javax.swing.JTextField textoTentativaa;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
