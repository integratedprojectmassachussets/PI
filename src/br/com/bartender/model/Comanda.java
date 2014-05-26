package br.com.bartender.model;
import java.util.ArrayList;
/**
 *
 * @author felipe_beck
 */
public class Comanda {
    
    private Integer idComanda;
    private String nomeClienteComanda;
    private String sexoClienteComanda;
    private String telefoneClienteComanda;       
    private boolean situacaoComanda;
    private String tipoPagamentoComanda;
    private ArrayList<Produto> consumoComanda;

    public Comanda(Integer idComanda, String nomeClienteComanda, String telefoneClienteComanda, String sexoClienteComanda, ArrayList<Produto> consumoComanda, boolean situacaoComanda, String tipoPagamentoComanda) {
        this.idComanda = idComanda;
        this.nomeClienteComanda = nomeClienteComanda;
        this.telefoneClienteComanda = telefoneClienteComanda;
        this.sexoClienteComanda = sexoClienteComanda;        
        this.consumoComanda = consumoComanda;
        this.situacaoComanda = situacaoComanda;
        this.tipoPagamentoComanda = tipoPagamentoComanda;
    }

    
    public Integer getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(Integer idComanda) {
        this.idComanda = idComanda;
    }

    public String getNomeClienteComanda() {
        return nomeClienteComanda;
    }

    public void setNomeClienteComanda(String nomeClienteComanda) {
        this.nomeClienteComanda = nomeClienteComanda;
    }

    public String getTelefoneClienteComanda() {
        return telefoneClienteComanda;
    }

    public void setTelefoneClienteComanda(String telefoneClienteComanda) {
        this.telefoneClienteComanda = telefoneClienteComanda;
    }

    public String getSexoClienteComanda() {
        return sexoClienteComanda;
    }

    public void setSexoClienteComanda(String sexoClienteComanda) {
        this.sexoClienteComanda = sexoClienteComanda;
    }

    public ArrayList<Produto> getConsumoComanda() {
        return consumoComanda;
    }

    public void setConsumoComanda(ArrayList<Produto> consumoComanda) {
        this.consumoComanda = consumoComanda;
    }

    public boolean isSituacaoComanda() {
        return situacaoComanda;
    }

    public void setSituacaoComanda(boolean situacaoComanda) {
        this.situacaoComanda = situacaoComanda;
    }

    public String getTipoPagamentoComanda() {
        return tipoPagamentoComanda;
    }

    public void setTipoPagamentoComanda(String tipoPagamentoComanda) {
        this.tipoPagamentoComanda = tipoPagamentoComanda;
    }
    
    
}
    