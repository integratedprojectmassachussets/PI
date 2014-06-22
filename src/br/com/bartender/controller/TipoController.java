package br.com.bartender.controller;

import br.com.bartender.dao.EventoDao;
import br.com.bartender.dao.TipoDao;
import br.com.bartender.model.Tipo;
import java.util.ArrayList;

/**
 *
 * @author felipe_beck
 */
public class TipoController {
    
    
    private static TipoController instanciaRep;
    
    public static TipoController obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new TipoController();
        }
        return instanciaRep;
    }
    
    
    public void Cadastrar(Tipo tipo) throws Exception{
        
        if ( tipo.getNomeTipo().isEmpty() ){
            throw new Exception("Favor inserir o nome do tipo de produto.");
        }
  
        TipoDao.obterInstancia().inserir(tipo);
    }
    
    public Tipo buscarTipo(String nome)throws Exception{
        
        if(nome.equals("")){
            throw new Exception("Escolha um tipo de produto");
        }
        
        return TipoDao.obterInstancia().buscarTipo(nome);
    }
    
    
    public ArrayList<Tipo> listarTodos(){
        return TipoDao.obterInstancia().listarTodos();
    }
    
    public void Excluir(Tipo tipo) throws Exception{
        if ( tipo == null){
            throw new Exception("Selecione um tipo de produto");
        }
        TipoDao.obterInstancia().remover(tipo);
    }
    
    
    
    
}
