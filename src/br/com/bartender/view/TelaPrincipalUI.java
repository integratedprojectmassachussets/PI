package br.com.bartender.view;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe_beck
 */
public class TelaPrincipalUI extends javax.swing.JFrame {
    
    private static TelaPrincipalUI instanciaRep;
    
    /*SINGLETON*/
    public static TelaPrincipalUI obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new TelaPrincipalUI();
        }
        return instanciaRep;
    }

    public JDesktopPane getPainelPrincipal(){
        return obterInstancia().getPainelPrincipal();    
    }

    public TelaPrincipalUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jdpPainelPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfBotaoEvento = new javax.swing.JButton();
        jtfBotaoComanda = new javax.swing.JButton();
        jtfBotaoProduto = new javax.swing.JButton();
        jtfBotaoRelatorio = new javax.swing.JButton();
        jtfBotaoSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jtfEvento = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jtfEventoListar = new javax.swing.JMenuItem();
        jtfComanda = new javax.swing.JMenu();
        jtfComandaNovo = new javax.swing.JMenuItem();
        jtfConsumoNovo = new javax.swing.JMenuItem();
        jtfComandaListar = new javax.swing.JMenuItem();
        jtfProduto = new javax.swing.JMenu();
        jtfProdutoNovo = new javax.swing.JMenuItem();
        jtfProdutoListar = new javax.swing.JMenuItem();
        jtfRelatorioEvento = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jtfRelatorioProduto = new javax.swing.JMenuItem();
        jtfSair = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem10.setText("jMenuItem10");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpPainelPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jdpPainelPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jdpPainelPrincipal.setForeground(new java.awt.Color(255, 0, 153));
        jdpPainelPrincipal.setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bartender/view/BarTenderLogo-Preto.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jtfBotaoEvento.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jtfBotaoEvento.setText("Evento");
        jtfBotaoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBotaoEventoActionPerformed(evt);
            }
        });

        jtfBotaoComanda.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jtfBotaoComanda.setText("Comanda");
        jtfBotaoComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBotaoComandaActionPerformed(evt);
            }
        });

        jtfBotaoProduto.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jtfBotaoProduto.setText("Produto");
        jtfBotaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBotaoProdutoActionPerformed(evt);
            }
        });

        jtfBotaoRelatorio.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jtfBotaoRelatorio.setText("Relatório");
        jtfBotaoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBotaoRelatorioActionPerformed(evt);
            }
        });

        jtfBotaoSair.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jtfBotaoSair.setText("Sair");
        jtfBotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBotaoSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 228, 228));
        jLabel1.setText("Bartender v1.0 - All Rights Reserved");

        javax.swing.GroupLayout jdpPainelPrincipalLayout = new javax.swing.GroupLayout(jdpPainelPrincipal);
        jdpPainelPrincipal.setLayout(jdpPainelPrincipalLayout);
        jdpPainelPrincipalLayout.setHorizontalGroup(
            jdpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                .addGroup(jdpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(1432, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(182, 182, 182))
                    .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jdpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jtfBotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfBotaoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfBotaoComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfBotaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfBotaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1493, Short.MAX_VALUE)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jdpPainelPrincipalLayout.setVerticalGroup(
            jdpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                .addContainerGap(987, Short.MAX_VALUE)
                .addGroup(jdpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpPainelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())))
            .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jtfBotaoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jtfBotaoComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jtfBotaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jtfBotaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jtfBotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jtfEvento.setText("Evento");

        jMenuItem1.setText("Novo Evento");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jtfEvento.add(jMenuItem1);

        jtfEventoListar.setText("Listar Eventos");
        jtfEvento.add(jtfEventoListar);

        jMenuBar1.add(jtfEvento);

        jtfComanda.setText("Comanda");

        jtfComandaNovo.setText("Nova Comanda");
        jtfComandaNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfComandaNovoActionPerformed(evt);
            }
        });
        jtfComanda.add(jtfComandaNovo);

        jtfConsumoNovo.setText("Novo Consumo");
        jtfComanda.add(jtfConsumoNovo);

        jtfComandaListar.setText("Listar Comandas");
        jtfComanda.add(jtfComandaListar);

        jMenuBar1.add(jtfComanda);

        jtfProduto.setText("Produto");

        jtfProdutoNovo.setText("Novo Produto");
        jtfProduto.add(jtfProdutoNovo);

        jtfProdutoListar.setText("Listar Produtos");
        jtfProduto.add(jtfProdutoListar);

        jMenuBar1.add(jtfProduto);

        jtfRelatorioEvento.setText("Relatórios");

        jMenuItem7.setText("Faturamento - Eventos");
        jtfRelatorioEvento.add(jMenuItem7);

        jtfRelatorioProduto.setText("Faturamento - Produtos");
        jtfRelatorioProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRelatorioProdutoActionPerformed(evt);
            }
        });
        jtfRelatorioEvento.add(jtfRelatorioProduto);

        jMenuBar1.add(jtfRelatorioEvento);

        jtfSair.setText("Sair");
        jtfSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfSairMouseClicked(evt);
            }
        });
        jtfSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jtfSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jtfSairActionPerformed

    private void jtfRelatorioProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRelatorioProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRelatorioProdutoActionPerformed

    private void jtfComandaNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfComandaNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfComandaNovoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ManutencaoComandaUI manutencaoComanda = new ManutencaoComandaUI();
        manutencaoComanda.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jtfBotaoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBotaoEventoActionPerformed
        // TODO add your handling code here:
        ManutencaoEventoUI manutencaoEvento = new ManutencaoEventoUI();
        manutencaoEvento.setVisible(true);
        
    }//GEN-LAST:event_jtfBotaoEventoActionPerformed

    private void jtfBotaoComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBotaoComandaActionPerformed
        // TODO add your handling code here:
        ManutencaoComandaUI manutencaoComanda = new ManutencaoComandaUI();
        manutencaoComanda.setVisible(true);
    }//GEN-LAST:event_jtfBotaoComandaActionPerformed

    private void jtfBotaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBotaoProdutoActionPerformed
        // TODO add your handling code here:
        ManutencaoProdutoUI manutencaoProduto = new ManutencaoProdutoUI();
        manutencaoProduto.setVisible(true);
    }//GEN-LAST:event_jtfBotaoProdutoActionPerformed

    private void jtfBotaoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBotaoRelatorioActionPerformed
        // TODO add your handling code here:
        RelatorioUI relatorioUI = new RelatorioUI();
        relatorioUI.setVisible(true);
    }//GEN-LAST:event_jtfBotaoRelatorioActionPerformed

    private void jtfBotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBotaoSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jtfBotaoSairActionPerformed

    private void jtfSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfSairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jtfSairMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(TelaPrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                obterInstancia().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jdpPainelPrincipal;
    private javax.swing.JButton jtfBotaoComanda;
    private javax.swing.JButton jtfBotaoEvento;
    private javax.swing.JButton jtfBotaoProduto;
    private javax.swing.JButton jtfBotaoRelatorio;
    private javax.swing.JButton jtfBotaoSair;
    private javax.swing.JMenu jtfComanda;
    private javax.swing.JMenuItem jtfComandaListar;
    private javax.swing.JMenuItem jtfComandaNovo;
    private javax.swing.JMenuItem jtfConsumoNovo;
    private javax.swing.JMenu jtfEvento;
    private javax.swing.JMenuItem jtfEventoListar;
    private javax.swing.JMenu jtfProduto;
    private javax.swing.JMenuItem jtfProdutoListar;
    private javax.swing.JMenuItem jtfProdutoNovo;
    private javax.swing.JMenu jtfRelatorioEvento;
    private javax.swing.JMenuItem jtfRelatorioProduto;
    private javax.swing.JMenu jtfSair;
    // End of variables declaration//GEN-END:variables

   
    
}
