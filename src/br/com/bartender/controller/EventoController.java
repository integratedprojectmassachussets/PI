package br.com.bartender.controller;

import br.com.bartender.model.Evento;
import java.util.ArrayList;

/**
 *
 * @author felipe_beck
 */
public class EventoController {
    
    private static EventoController instanciaRep;
    
    public static EventoController obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new EventoController();
        }
        return instanciaRep;
    }
    
    public void Cadastrar(Evento evento) throws Exception{
        
        if (evento.getIdEvento().equals("") ){
            throw new Exception("Id inválido.");
        }
        if (evento.getNomeEvento().isEmpty() ){
            throw new Exception("Favor inserir o nome do evento.");
        }
        if ( evento.getDataEvento().isEmpty() ){
            throw new Exception("Favor inserir a data do evento.");
        }
        if ( evento.getHorarioEvento().isEmpty() ){
            throw new Exception("Favor inserir o horário do evento.");
        }
        if ( evento.getValorMasc().equals("") ){
            throw new Exception("Favor inserir o valor do evento.");
        }
        if ( evento.getValorFem().equals("") ){
            throw new Exception("Favor inserir o valor do evento.");
        }
        
        EventoController.obterInstancia().Cadastrar(evento);
    }
    
    public ArrayList<Evento> listarTodos(){
        return EventoController.obterInstancia().listarTodos();
    }
    
    public void Editar(Evento evento) throws Exception{
        if ( evento == null ){
            throw new Exception("Selecione o evento.");
        }
        if ( evento.getIdEvento().equals("") ){
            throw new Exception("Favor inserir o id do evento.");        
        }
        if (evento.getDataEvento().isEmpty() ){
            throw new Exception("Favor inserir a data do evento.");
        }
        if ( evento.getHorarioEvento().isEmpty() ){
            throw new Exception("Favor inserir o horário do evento.");
        }
        if ( evento.getValorMasc().equals("") ){
            throw new Exception("Favor inserir o valor do ingresso masculino.");
        }
        if ( evento.getValorFem().equals("") ){
            throw new Exception("Favor inserir o valor do ingresso feminino.");
        }
        
        EventoController.obterInstancia().Editar(evento);
    
    
    }
    
    public void Excluir(Evento evento) throws Exception{
        if ( evento == null){
            throw new Exception("Selecione um evento");
        }
        EventoController.obterInstancia().Excluir(evento);
    }
    
}
