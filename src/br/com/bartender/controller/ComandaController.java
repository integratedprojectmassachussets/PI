package br.com.bartender.controller;

import br.com.bartender.dao.ComandaDao;
import br.com.bartender.model.Comanda;
import java.util.ArrayList;

/**
 *
 * @author felipe_beck
 */
public class ComandaController {
    
    private static ComandaController instanciaRep;
    
    public static ComandaController obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new ComandaController();
        }
        return instanciaRep;
    }
    
    public void Cadastrar(Comanda comanda) throws Exception{
        
        if (comanda.getIdComanda().equals("") ){
            throw new Exception("Id inválido.");
        }
        if (comanda.getNomeClienteComanda().isEmpty() ){
            throw new Exception("Nome do cliente inválido.");
        }
        if ( comanda.getTelefoneClienteComanda().isEmpty() ){
            throw new Exception("Telefone inválido.");
        }
        if ( comanda.getSexoClienteComanda().isEmpty() ){
            throw new Exception("Sexo inválido.");
        }
        ComandaController.obterInstancia().Cadastrar(comanda);
    }
    
    public ArrayList<Comanda> listarTodos(){
        return ComandaController.obterInstancia().listarTodos();
    }
    
    public Comanda listarComandaId(Comanda comanda) throws Exception {
        if(comanda.getIdComanda().equals("")){
            throw new Exception("ID inválido");
        }
        
        return ComandaDao.obterInstancia().listarComandaId(comanda);
    }
    
    public void Editar(Comanda comanda) throws Exception{
        if ( comanda == null ){
            throw new Exception("Selecione um produto");
        }
        if ( comanda.getIdComanda().equals("") ){
            throw new Exception("Favor inserir o id da comanda.");        
        }
        if (comanda.getNomeClienteComanda().isEmpty() ){
            throw new Exception("Favor inserir o nome.");
        }
        if ( comanda.getTelefoneClienteComanda().isEmpty() ){
            throw new Exception("Favor inserir o telefone.");
        }
        if ( comanda.getSexoClienteComanda().equals("") ){
            throw new Exception("Favor inserir o sexo.");
        }
        
        ComandaController.obterInstancia().Editar(comanda);
    
    
    }
    
    public void Excluir(Comanda comanda) throws Exception{
        if ( comanda == null){
            throw new Exception("Selecione um produto");
        }
        ComandaController.obterInstancia().Excluir(comanda);
    }
    
}
