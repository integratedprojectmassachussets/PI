package br.com.bartender.model;
import java.util.ArrayList; 

/**
 *
 * @author felipe_beck
 */

public class Consumo {
    
    
    private Integer idConsumo;

    private Integer quantidadeProduto;
    private Comanda comandaRelacionada;
    private Produto produtoInserido;
    private Double valorTotal;

    
    
    
    
    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {
        
        
        this.valorTotal = this.quantidadeProduto * this.produtoInserido.getValorProduto();
    }
    
    public Integer getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(Integer idConsumo) {
        this.idConsumo = idConsumo;
    }
    
    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Comanda getComandaRelacionada() {
        return comandaRelacionada;
    }

    public void setComandaRelacionada(Comanda comandaRelacionada) {
        this.comandaRelacionada = comandaRelacionada;
    }

    public Produto getProdutoInserido() {
        return produtoInserido;
    }

    public void setProdutoInserido(Produto produtoInserido) {
        this.produtoInserido = produtoInserido;
    }

    

 
    
    
        
       
        
        
        
        
        
        
    
}
