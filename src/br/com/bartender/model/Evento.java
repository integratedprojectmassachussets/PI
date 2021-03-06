package br.com.bartender.model;


/**
 *
 * @author felipe_beck
 */
public class Evento {
    
    private Integer idEvento;
    private String nomeEvento;
    private String dataEvento;  
    private String horarioEvento;
    private Double valorMasc;
    private Double valorFem;

    

     
    
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

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getHorarioEvento() {
        return horarioEvento;
    }

    public void setHorarioEvento(String horaInicio) {
        this.horarioEvento = horarioEvento;
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
