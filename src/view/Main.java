/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import model.*;

/**
 *
 * @author gabriel
 */
public class Main extends javax.swing.JFrame {

    Exchange exchange[] = new Exchange[4];
    long intervalUpdate = 5000;
    boolean controle = false;

    /**
     * Creates new form Main
     *
     * @throws java.io.IOException
     */
    public Main() throws IOException {
        initComponents();

        atualizarObjetos();
        setTitle("ArbiTrade [ATUALIZADO " + Instant.now() + "]");
        preencherJLabels();
        controle = true;

    }

    private void atualizarObjetos() {
        Runnable task0 = () -> {
            try {
                exchange[0] = new MercadoBitcoin();
            } catch (IOException ex) {
            }
        };

        Runnable task1 = () -> {
            try {
                exchange[1] = new NegocieCoins();
            } catch (IOException ex) {
            }
        };

        Runnable task2 = () -> {
            try {
                exchange[2] = new BitcoinTrade();
            } catch (IOException ex) {
            }
        };

        Runnable task3 = () -> {
            try {
                exchange[3] = new BitCambio();
            } catch (IOException ex) {
            }
        };
        task0.run();
        task1.run();
        task2.run();
        task3.run();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcbListaExchanges = new javax.swing.JComboBox<>();
        panelExcBase = new javax.swing.JPanel();
        imgExcBase = new javax.swing.JLabel();
        lblExcBase = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lblCotExcBase = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imgExc2 = new javax.swing.JLabel();
        imgExc1 = new javax.swing.JLabel();
        imgExc3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblNomeExc1 = new javax.swing.JLabel();
        lblCotExc1 = new javax.swing.JLabel();
        lblDifPrecoExc1 = new javax.swing.JLabel();
        lblDifPercExc1 = new javax.swing.JLabel();
        lblNomeExc2 = new javax.swing.JLabel();
        lblCotExc2 = new javax.swing.JLabel();
        lblDifPrecoExc2 = new javax.swing.JLabel();
        lblDifPercExc2 = new javax.swing.JLabel();
        lblCotExc3 = new javax.swing.JLabel();
        lblDifPrecoExc3 = new javax.swing.JLabel();
        lblNomeExc3 = new javax.swing.JLabel();
        lblDifPercExc3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArbiTrade");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Exchange Base"));

        jcbListaExchanges.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercado Bitcoin", "Negocie Coins", "BitcoinTrade", "BitCambio" }));
        jcbListaExchanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaExchangesActionPerformed(evt);
            }
        });

        panelExcBase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgExcBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no_image.png"))); // NOI18N

        lblExcBase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExcBase.setText("Exchange");

        lbl1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Cotação para compra:");

        lblCotExcBase.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        lblCotExcBase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCotExcBase.setText("R$ -");

        javax.swing.GroupLayout panelExcBaseLayout = new javax.swing.GroupLayout(panelExcBase);
        panelExcBase.setLayout(panelExcBaseLayout);
        panelExcBaseLayout.setHorizontalGroup(
            panelExcBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExcBaseLayout.createSequentialGroup()
                .addComponent(lblExcBase, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExcBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgExcBase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelExcBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCotExcBase, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        panelExcBaseLayout.setVerticalGroup(
            panelExcBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExcBaseLayout.createSequentialGroup()
                .addGroup(panelExcBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelExcBaseLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCotExcBase))
                    .addGroup(panelExcBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgExcBase)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExcBase)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        lbl2.setText("Escolha a exchange:");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 2, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("*Lucros tendo como referencial o montante de 1 BTC.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelExcBase, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbListaExchanges, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(panelExcBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(jcbListaExchanges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel1))
        );

        imgExc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no_image.png"))); // NOI18N

        imgExc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no_image.png"))); // NOI18N

        imgExc3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no_image.png"))); // NOI18N

        lblNomeExc1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        lblNomeExc1.setText("Nome da exchange 1");

        lblCotExc1.setText("Cotação para venda   : R$ -");

        lblDifPrecoExc1.setText("Ganho nominal            : R$ -");

        lblDifPercExc1.setText("Ganho Percentual (%): -%");

        lblNomeExc2.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        lblNomeExc2.setText("Nome da exchange 2");

        lblCotExc2.setText("Cotação para venda   : R$ -");

        lblDifPrecoExc2.setText("Ganho nominal           : R$ -");

        lblDifPercExc2.setText("Ganho Percentual (%): -%");

        lblCotExc3.setText("Cotação para venda   : R$ -");

        lblDifPrecoExc3.setText("Ganho nominal            : R$ -");

        lblNomeExc3.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        lblNomeExc3.setText("Nome da exchange 3");

        lblDifPercExc3.setText("Ganho Percentual (%): -%");

        jMenu1.setText("Opções");

        jMenuItem2.setText("Configurações");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Sobre");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imgExc3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDifPrecoExc3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(lblCotExc3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNomeExc3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDifPercExc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imgExc1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDifPrecoExc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(lblCotExc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNomeExc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDifPercExc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imgExc2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDifPrecoExc2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(lblCotExc2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNomeExc2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDifPercExc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgExc1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeExc1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCotExc1)
                        .addGap(0, 0, 0)
                        .addComponent(lblDifPrecoExc1)
                        .addGap(0, 0, 0)
                        .addComponent(lblDifPercExc1)))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeExc2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCotExc2)
                        .addGap(0, 0, 0)
                        .addComponent(lblDifPrecoExc2)
                        .addGap(0, 0, 0)
                        .addComponent(lblDifPercExc2))
                    .addComponent(imgExc2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(imgExc3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblNomeExc3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCotExc3)
                        .addGap(0, 0, 0)
                        .addComponent(lblDifPrecoExc3)
                        .addGap(0, 0, 0)
                        .addComponent(lblDifPercExc3)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(this, "Autores:\n\nEdson Cândido\n"
                + "Gabriel Guilherme\n"
                + "Joseph Oliveira\n"
                + "Salatiel Lopes", "ArbiTrade versão 0.1", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(2500);

                        if (controle) {
                            Thread.sleep(intervalUpdate);
                            setTitle("ArbiTrade [ATUALIZANDO...]");
                            atualizarObjetos();
                            preencherJLabels();
                            setTitle("ArbiTrade [ATUALIZADO " + Instant.now() + "]");
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }//GEN-LAST:event_formWindowOpened

    private void jcbListaExchangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaExchangesActionPerformed
        preencherJLabels();
    }//GEN-LAST:event_jcbListaExchangesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        intervalUpdate = Long.parseLong(JOptionPane.showInputDialog(this, "Informe o intervalo de atualização (em segundos):",
                "Configurações", WIDTH)) * 1000;
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    final void preencherJLabels() {
        // TODO add your handling code here:
        String nomes[] = {"Mercado Bitcoin", "NegocieCoins", "BitcoinTrade", "BitCambio"};
       // float taxas[] = {0.7f, 0.00010848f, 0.4f, 0.0002f, 0.5f, 0.00055188f, 0.99f, 0.00018f};
        JLabel jlabels[] = {imgExcBase, lblExcBase, lblCotExcBase, null, null,
            imgExc1, lblNomeExc1, lblCotExc1, lblDifPrecoExc1, lblDifPercExc1,
            imgExc2, lblNomeExc2, lblCotExc2, lblDifPrecoExc2, lblDifPercExc2,
            imgExc3, lblNomeExc3, lblCotExc3, lblDifPrecoExc3, lblDifPercExc3};

        jlabels[0].setIcon(new ImageIcon(getClass().getResource("/img/" + jcbListaExchanges.getSelectedIndex() + ".png")));
        jlabels[1].setText(nomes[jcbListaExchanges.getSelectedIndex()]);
        jlabels[2].setText("R$ " + String.format("%.2f", exchange[jcbListaExchanges.getSelectedIndex()].getSell()));

        for (int i = 0, j = 5; i < 4; i++, j += 5) {
            if (i != jcbListaExchanges.getSelectedIndex()) {
                jlabels[j].setIcon(new ImageIcon(getClass().getResource("/img/" + i + ".png")));
                jlabels[j + 1].setText(nomes[i]);
                jlabels[j + 2].setText("Cotação para venda   : R$ " + String.format("%.2f", exchange[i].getBuy()));
                float ganho = exchange[i].getBuy() - exchange[jcbListaExchanges.getSelectedIndex()].getSell();
                jlabels[j + 3].setText("Ganho nominal            : R$ " + String.format("%.2f", ganho));
                ganho = (exchange[i].getBuy() / exchange[jcbListaExchanges.getSelectedIndex()].getSell()-1)*100;
                jlabels[j + 4].setText("Ganho Percentual (%): " + String.format("%.2f%%", ganho));
                
            } else {
                j -= 5;
            }
        }
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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgExc1;
    private javax.swing.JLabel imgExc2;
    private javax.swing.JLabel imgExc3;
    private javax.swing.JLabel imgExcBase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcbListaExchanges;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblCotExc1;
    private javax.swing.JLabel lblCotExc2;
    private javax.swing.JLabel lblCotExc3;
    private javax.swing.JLabel lblCotExcBase;
    private javax.swing.JLabel lblDifPercExc1;
    private javax.swing.JLabel lblDifPercExc2;
    private javax.swing.JLabel lblDifPercExc3;
    private javax.swing.JLabel lblDifPrecoExc1;
    private javax.swing.JLabel lblDifPrecoExc2;
    private javax.swing.JLabel lblDifPrecoExc3;
    private javax.swing.JLabel lblExcBase;
    private javax.swing.JLabel lblNomeExc1;
    private javax.swing.JLabel lblNomeExc2;
    private javax.swing.JLabel lblNomeExc3;
    private javax.swing.JPanel panelExcBase;
    // End of variables declaration//GEN-END:variables
}
