
package bartender.karim;
import javax.swing.JOptionPane; 

/**
 *
 * @author Adriana
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
