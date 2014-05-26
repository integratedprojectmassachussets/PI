package br.com.bartender.controller;
import br.com.bartender.model.Comanda;
import br.com.bartender.model.Produto;
import javax.swing.JOptionPane; 

/**
 *
 * @author felipe_beck
 */

public class Consumo {
    
    public void consumo(Produto produto, Comanda comanda){
        
        int quantidadeConsumo;
        produto.getTipoProduto();
        produto.getNomeProduto();
        produto.getValorProduto();
        
        quantidadeConsumo = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
        
        
        
        
        
        
    }
}
