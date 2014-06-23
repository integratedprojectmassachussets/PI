package br.com.bartender.controller;

import br.com.bartender.dao.ConsumoDao;
import br.com.bartender.model.Consumo;
import java.util.ArrayList;

/**
 *
 * @author felipe_beck
 */
public class ConsumoController {
    
    private static ConsumoController instanciaRep;
    
    public static ConsumoController obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new ConsumoController();
        }
        return instanciaRep;
    }
    
    public void Buscar(Consumo consumo) throws Exception{
        
        if(consumo.getComandaRelacionada().getIdComanda().equals("")){
            throw new Exception("Favor inserir o ID da comanda.");                    
        }
        
        ConsumoDao.obterInstancia().inserir(consumo);
    }
    
    public void inserir(Consumo consumo) throws Exception{
        
        if(consumo.getProdutoInserido().getIdProduto().equals("")){
            throw new Exception("Favor inserir o ID do produto.");                    
        }
        
        if(consumo.getQuantidadeProduto().equals("")){
            throw new Exception("Favor inserior a quantidade.");
        }
        
        ConsumoDao.obterInstancia().inserir(consumo);
    }
    
    public ArrayList<Consumo> listarConsumoComanda(Integer idComanda) throws Exception{
        
        if(idComanda.equals("")){
            throw new Exception("ID inválido");
        }
        
        return ConsumoDao.obterInstancia().listarConsumoComanda(idComanda);
    }
    
}
