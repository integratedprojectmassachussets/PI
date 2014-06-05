/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bartender.view;
import br.com.bartender.model.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo_niederauer
 */
public class ManutencaoProdutoUI extends javax.swing.JInternalFrame {
private Produto produtoAlterar;

    public ManutencaoProdutoUI(Produto produto) {
       initComponents();

       if(produto != null){

           produtoAlterar = produto;
           

       }
    }

    ManutencaoProdutoUI() {
       throw new UnsupportedOperationException("Not yet implemented");
    /**
     * Creates new form ManutencaoProdutoUI
     */
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfManutencaoProduto = new javax.swing.JTabbedPane();
        jtfCadastrarProduto = new javax.swing.JDesktopPane();
        jtfEditarProduto = new javax.swing.JDesktopPane();
        jtfListarProdutos = new javax.swing.JDesktopPane();

        jtfManutencaoProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfManutencaoProduto.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jtfManutencaoProduto.setToolTipText("");
        jtfManutencaoProduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jtfCadastrarProduto.setBackground(new java.awt.Color(0, 0, 0));
        jtfManutencaoProduto.addTab("Cadastrar Produto", jtfCadastrarProduto);

        jtfEditarProduto.setBackground(new java.awt.Color(0, 0, 0));
        jtfManutencaoProduto.addTab("Editar Produto", jtfEditarProduto);

        jtfListarProdutos.setBackground(new java.awt.Color(0, 0, 0));
        jtfManutencaoProduto.addTab("Listar Produtos", jtfListarProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtfManutencaoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtfManutencaoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jtfCadastrarProduto;
    private javax.swing.JDesktopPane jtfEditarProduto;
    private javax.swing.JDesktopPane jtfListarProdutos;
    private javax.swing.JTabbedPane jtfManutencaoProduto;
    // End of variables declaration//GEN-END:variables
}