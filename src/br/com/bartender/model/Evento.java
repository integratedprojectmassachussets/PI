package br.com.bartender.model;

import java.util.Date;

/**
 *
 * @author felipe_beck
 */
public class Evento {
    
    private Integer idEvento;
    private String nomeEvento;
    private Date dataEvento;  
    private String horaInicio;
    private String horaFim;
    private Double valorMasc;
    private Double valorFem;

    public Evento(Integer idEvento, String nomeEvento, Date dataEvento, String horaInicio, String horaFim, Double valorMasc, Double valorFem) {
        this.idEvento = idEvento;
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.valorMasc = valorMasc;
        this.valorFem = valorFem;
    }

     
    
    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public Double getValorMasc() {
        return valorMasc;
    }

    public void setValorMasc(Double valorMasc) {
        this.valorMasc = valorMasc;
    }

    public Double getValorFem() {
        return valorFem;
    }

    public void setValorFem(Double valorFem) {
        this.valorFem = valorFem;
    }

    

    
    
    
    
}
