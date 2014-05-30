package br.com.bartender.view;

import br.com.bartender.model.Produto;
import javax.swing.JOptionPane;


/**
 *
 * @author felipe_beck
 */
public class NovoProdutoUI extends javax.swing.JPanel {

    private Produto produtoAlterar;
    
    public NovoProdutoUI(Produto produto) {
        initComponents();
        
        if(produto != null){
            
            produtoAlterar = produto;
            jtfProdutoNome.setText(produto.getNomeProduto());
            jtfProdutoTipo.setText(produto.getTipoProduto());
            jtfProdutoValor.setText(produto.getValorProduto().toString());
            
        }
    }

    NovoProdutoUI() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlProdutoNome = new javax.swing.JLabel();
        jlProdutoTipo = new javax.swing.JLabel();
        jlProdutoValor = new javax.swing.JLabel();
        jtfProdutoNome = new javax.swing.JTextField();
        jtfProdutoTipo = new javax.swing.JTextField();
        jtfProdutoValor = new javax.swing.JTextField();

        jlProdutoNome.setText("Nome:");

        jlProdutoTipo.setText("Tipo:");

        jlProdutoValor.setText("Valor:");

        jtfProdutoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProdutoNomeActionPerformed(evt);
            }
        });

        jtfProdutoTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProdutoTipoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jlProdutoNome)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jtfProdutoNome))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jlProdutoTipo)
                            .add(jlProdutoValor))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jtfProdutoValor, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .add(jtfProdutoTipo))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlProdutoNome)
                    .add(jtfProdutoNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlProdutoTipo)
                    .add(jtfProdutoTipo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlProdutoValor)
                    .add(jtfProdutoValor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfProdutoTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProdutoTipoActionPerformed
        try{
            if(produtoAlterar != null){
                produtoAlterar.setNomeProduto(jtfProdutoNome.getText());
                produtoAlterar.setTipoProduto(jtfProdutoTipo.getText());
                produtoAlterar.setValorProduto(Double.parseDouble(jtfProdutoValor.getText()));
                /* ProdutoController.obterInstancia().alterar(produtoAlteracao);*/
            }else {
                Produto produto = new Produto();
                
                produto.setNomeProduto(jtfProdutoNome.getText());
                produto.setTipoProduto(jtfProdutoTipo.getText());
                produto.setValorProduto(Double.parseDouble(jtfProdutoValor.getText()));
                /* ProdutoController.obterInstancia().alterar(produtoAlteracao);*/
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.");
            }
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }          
                    
                    
    }//GEN-LAST:event_jtfProdutoTipoActionPerformed

    private void jtfProdutoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProdutoNomeActionPerformed
        
    }//GEN-LAST:event_jtfProdutoNomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlProdutoNome;
    private javax.swing.JLabel jlProdutoTipo;
    private javax.swing.JLabel jlProdutoValor;
    private javax.swing.JTextField jtfProdutoNome;
    private javax.swing.JTextField jtfProdutoTipo;
    private javax.swing.JTextField jtfProdutoValor;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
