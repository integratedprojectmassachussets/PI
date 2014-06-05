package br.com.bartender.controller;

import br.com.bartender.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author felipe_beck
 */
public class ProdutoController {
    
    private static ProdutoController instanciaRep;
    
    public static ProdutoController obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new ProdutoController();
        }
        return instanciaRep;
    }
    
    public void Cadastrar(Produto produto) throws Exception{
        
        if (produto.getIdProduto().equals("") ){
            throw new Exception("Id inválido.");
        }
        if (produto.getNomeProduto().isEmpty() ){
            throw new Exception("Favor inserir o nome do produto.");
        }
        if ( produto.getTipoProduto().isEmpty() ){
            throw new Exception("Favor inserir tipo do produto.");
        }
        if ( produto.getValorProduto().equals("") ){
            throw new Exception("Favor inserir o valor unitário do produto.");
        }
               
        
        ProdutoController.obterInstancia().Cadastrar(produto);
    }
    
    public ArrayList<Produto> listarTodos(){
        return ProdutoController.obterInstancia().listarTodos();
    }
    
    public void Editar(Produto produto) throws Exception{
        if ( produto == null ){
            throw new Exception("Selecione um produto");
        }
        if ( produto.getIdProduto().equals("") ){
            throw new Exception("Favor inserir o id do produto.");        
        }
        if (produto.getNomeProduto().isEmpty() ){
            throw new Exception("Favor inserir o nome do produto.");
        }
        if ( produto.getTipoProduto().isEmpty() ){
            throw new Exception("Favor inserir tipo do produto.");
        }
        if ( produto.getValorProduto().equals("") ){
            throw new Exception("Favor inserir o valor unitário do produto.");
        }
        
        ProdutoController.obterInstancia().Editar(produto);
    
    
    }
    
    public void Excluir(Produto produto) throws Exception{
        if ( produto == null){
            throw new Exception("Selecione um produto");
        }
        ProdutoController.obterInstancia().Excluir(produto);
    }
}
