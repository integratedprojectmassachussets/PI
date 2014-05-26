package bartender.karim;

import java.util.Date;

/**
 *
 * @author Adriana
 */
public class Evento {
    
    private Integer idEvento;
    private String nomeEvento;
    private Date dataInicioEvento;
    private Date dataFimEvento;
    private Double valorMasc;
    private Double valorFem;

    public Evento(Integer idEvento, String nomeEvento, Date dataInicioEvento, Date dataFimEvento, Double valorMasc, Double valorFem) {
        this.idEvento = idEvento;
        this.nomeEvento = nomeEvento;
        this.dataInicioEvento = dataInicioEvento;
        this.dataFimEvento = dataFimEvento;
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

    public Date getDataInicioEvento() {
        return dataInicioEvento;
    }

    public void setDataInicioEvento(Date dataInicioEvento) {
        this.dataInicioEvento = dataInicioEvento;
    }

    public Date getDataFimEvento() {
        return dataFimEvento;
    }

    public void setDataFimEvento(Date dataFimEvento) {
        this.dataFimEvento = dataFimEvento;
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
