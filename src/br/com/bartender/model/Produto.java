package br.com.bartender.model;

/**
 *
 * @author felipe_beck
 */
public class Produto {
    
    private Integer idProduto;
    private String nomeProduto;    
    private Double valorProduto;
    private Tipo tipoProduto;

    
    
    
    public Tipo getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(Tipo tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }
    
    
    
    
    
    
}
