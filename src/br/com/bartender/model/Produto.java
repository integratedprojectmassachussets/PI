package br.com.bartender.model;

/**
 *
 * @author felipe_beck
 */
public class Produto {
    
    private Integer idProduto;
    private String nomeProduto;
    private String tipoProduto;    
    private Double valorProduto;

    
    public Produto(Integer idProduto, String tipoProduto, String nomeProduto, Double valorProduto) {
        this.idProduto = idProduto;
        this.tipoProduto = tipoProduto;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }
    
    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
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
