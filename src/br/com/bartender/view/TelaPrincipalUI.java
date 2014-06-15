package br.com.bartender.view;

import br.com.bartender.model.Comanda;
import br.com.bartender.model.Consumo;
import br.com.bartender.model.Produto;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfIdComanda = new javax.swing.JTextField();
        jbBuscarComanda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaConsumoTemp = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jbAdicionarConsumo = new javax.swing.JButton();
        jtfIdProduto = new javax.swing.JTextField();
        jbCadastrarConsumo = new javax.swing.JButton();
        jbLimparConsumo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtfQuantidadeConsumo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

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
        jdpPainelPrincipal.setPreferredSize(new java.awt.Dimension(1024, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bartender/view/BarTenderLogo-Preto.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jtfBotaoEvento.setBackground(new java.awt.Color(255, 255, 255));
        jtfBotaoEvento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtfBotaoEvento.setText("Evento");
        jtfBotaoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBotaoEventoActionPerformed(evt);
            }
        });

        jtfBotaoComanda.setBackground(new java.awt.Color(255, 255, 255));
        jtfBotaoComanda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtfBotaoComanda.setText("Comanda");
        jtfBotaoComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBotaoComandaActionPerformed(evt);
            }
        });

        jtfBotaoProduto.setBackground(new java.awt.Color(255, 255, 255));
        jtfBotaoProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtfBotaoProduto.setText("Produto");
        jtfBotaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBotaoProdutoActionPerformed(evt);
            }
        });

        jtfBotaoRelatorio.setBackground(new java.awt.Color(255, 255, 255));
        jtfBotaoRelatorio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtfBotaoRelatorio.setText("Relatório");
        jtfBotaoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBotaoRelatorioActionPerformed(evt);
            }
        });

        jtfBotaoSair.setBackground(new java.awt.Color(255, 255, 255));
        jtfBotaoSair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtfBotaoSair.setText("Sair");
        jtfBotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBotaoSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 228, 228));
        jLabel1.setText("Bartender v1.0 - All Rights Reserved");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentX(0.5F);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Comanda:");

        jtfIdComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdComandaActionPerformed(evt);
            }
        });

        jbBuscarComanda.setText("Buscar");
        jbBuscarComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarComandaActionPerformed(evt);
            }
        });

        jtListaConsumoTemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Valor Unitário", "Quantidade", "Valor Total"
            }
        ));
        jtListaConsumoTemp.setGridColor(new java.awt.Color(0, 0, 0));
        jtListaConsumoTemp.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jtListaConsumoTemp.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtListaConsumoTempComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jtListaConsumoTemp);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Produto:");

        jbAdicionarConsumo.setText("Adicionar");
        jbAdicionarConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarConsumoActionPerformed(evt);
            }
        });

        jbCadastrarConsumo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbCadastrarConsumo.setText("Inserir");

        jbLimparConsumo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbLimparConsumo.setText("Limpar");
        jbLimparConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparConsumoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantidade");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Consumo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfIdComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBuscarComanda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfQuantidadeConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAdicionarConsumo)))
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jbCadastrarConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimparConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIdComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarComanda)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAdicionarConsumo)
                    .addComponent(jtfIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQuantidadeConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrarConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimparConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jdpPainelPrincipalLayout = new javax.swing.GroupLayout(jdpPainelPrincipal);
        jdpPainelPrincipal.setLayout(jdpPainelPrincipalLayout);
        jdpPainelPrincipalLayout.setHorizontalGroup(
            jdpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                .addContainerGap(667, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(320, 320, 320)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jdpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jtfBotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfBotaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBotaoComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBotaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBotaoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(208, 208, 208)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jdpPainelPrincipalLayout.setVerticalGroup(
            jdpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jdpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jdpPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jdpPainelPrincipalLayout.createSequentialGroup()
                        .addComponent(jtfBotaoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jtfBotaoComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jtfBotaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jtfBotaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jtfBotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 251, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jbLimparConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimparConsumoActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Se fosse na quarta fase, este trabalho não passava.");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jtfIdComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdComandaActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jtfIdComandaActionPerformed

    private void jbBuscarComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarComandaActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jbBuscarComandaActionPerformed

    private void jtListaConsumoTempComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtListaConsumoTempComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtListaConsumoTempComponentAdded

    private void jbAdicionarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarConsumoActionPerformed
        // TODO add your handling code here:
        
        Consumo consumo = new Consumo();
        Comanda comandaRelacionada = new Comanda();
        Produto produtoInserido = new Produto();
        double valorTotal = 0;
        
        comandaRelacionada.setIdComanda(Integer.parseInt(jtfIdComanda.getText()));
        produtoInserido.setIdProduto(Integer.parseInt(jtfIdProduto.getText()));
        
        /* Retirar para testar
        produtoInserido.setNomeProduto("Coca-Cola");
        produtoInserido.setValorProduto(5D);
        */
        
        consumo.setComandaRelacionada(comandaRelacionada);
        consumo.setProdutoInserido(produtoInserido);
        consumo.setQuantidadeProduto(Integer.parseInt(jtfQuantidadeConsumo.getText()));
        
        jtListaConsumoTemp.setValueAt(consumo.getProdutoInserido().getNomeProduto(), 0, 0);
        jtListaConsumoTemp.setValueAt(consumo.getProdutoInserido().getValorProduto(), 0, 1);
        jtListaConsumoTemp.setValueAt(consumo.getQuantidadeProduto(),0, 2);
        
        valorTotal = consumo.getQuantidadeProduto() * consumo.getProdutoInserido().getValorProduto();
        
        jtListaConsumoTemp.setValueAt(valorTotal, 0, 3);
        
        
    }//GEN-LAST:event_jbAdicionarConsumoActionPerformed

    
    
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdicionarConsumo;
    private javax.swing.JButton jbBuscarComanda;
    private javax.swing.JButton jbCadastrarConsumo;
    private javax.swing.JButton jbLimparConsumo;
    private javax.swing.JPanel jdpPainelPrincipal;
    private javax.swing.JTable jtListaConsumoTemp;
    private javax.swing.JButton jtfBotaoComanda;
    private javax.swing.JButton jtfBotaoEvento;
    private javax.swing.JButton jtfBotaoProduto;
    private javax.swing.JButton jtfBotaoRelatorio;
    private javax.swing.JButton jtfBotaoSair;
    private javax.swing.JTextField jtfIdComanda;
    private javax.swing.JTextField jtfIdProduto;
    private javax.swing.JTextField jtfQuantidadeConsumo;
    // End of variables declaration//GEN-END:variables

   
    
}
