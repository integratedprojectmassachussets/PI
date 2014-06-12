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
    private String situacaoComanda;
    private String tipoPagamentoComanda;
    private ArrayList<Consumo> consumoComanda;
    private Evento eventoVigente;

    public Evento getEventoVigente() {
        return eventoVigente;
    }

    public void setEventoVigente(Evento eventoVigente) {
        this.eventoVigente = eventoVigente;
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

    public ArrayList<Consumo> getConsumoComanda() {
        return consumoComanda;
    }

    public void setConsumoComanda(ArrayList<Consumo> consumoComanda) {
        this.consumoComanda = consumoComanda;
    }

    

    public String getSituacaoComanda() {
        return situacaoComanda;
    }

    public void setSituacaoComanda(String situacaoComanda) {
        this.situacaoComanda = situacaoComanda;
    }

    public String getTipoPagamentoComanda() {
        return tipoPagamentoComanda;
    }

    public void setTipoPagamentoComanda(String tipoPagamentoComanda) {
        this.tipoPagamentoComanda = tipoPagamentoComanda;
    }
    
    
}
    