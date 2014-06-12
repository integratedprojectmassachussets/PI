package br.com.bartender.model;
import java.util.ArrayList; 

/**
 *
 * @author felipe_beck
 */

public class Consumo {
    
    private Integer quantidadeProduto;
    private Comanda comandaRelacionada;
    private Produto produtoInserido;

    
    
    
    
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
