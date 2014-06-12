
package br.com.bartender.dao;

import java.util.ArrayList;
import br.com.bartender.model.Produto;
import br.com.bartender.util.ConnectionUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author karim.scofield
 */
public class ProdutoDao {

    private ArrayList<Produto> listaProduto;
    private static ProdutoDao instanciaRep;
    private ConnectionUtil con;
    
    /*SINGLETON*/
    public static ProdutoDao obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new ProdutoDao();
        }
        return instanciaRep;
    }
    
    public ProdutoDao(){
        this.listaProduto = new ArrayList<Produto>();
        con = new ConnectionUtil();
    }
    
    public void inserir(Produto produto){
        try {
            String query = "INSERT INTO PRODUTO ( NOMEPRODUTO, VALORPRODUTO ) VALUES ( ?, ?)";
            PreparedStatement pst = con.getConnection().prepareStatement(query);
            pst.setString(1, produto.getNomeProduto());
            pst.setDouble(2, produto.getValorProduto());
            pst.execute();
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Produto> listarTodos(){
        this.listaProduto = new ArrayList<>(); /*Para não duplicar a lista*/
        try {
            Statement st = con.getConnection().createStatement();
            String query = "SELECT * FROM PRODUTO";
            ResultSet rs = st.executeQuery(query);
            while( rs.next() ){
                Produto p = new Produto();
                p.setNomeProduto(rs.getString("NOMEPRODUTO"));
                p.setValorProduto(rs.getDouble("VALORPRODUTO"));
                p.setIdProduto(rs.getInt("IdPRODUTO"));
                
                this.listaProduto.add( p );
            }
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return this.listaProduto;
    }
    
    public void alterar(Produto produto){
         try {
             String query = "UPDATE PRODUTO SET NOMEPRODUTO=?, VALORPRODUTO=?, WHERE IDPRODUTO=?";
             PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setString(1, produto.getNomeProduto());
            st.setDouble(2, produto.getValorProduto());
            st.setInt(3, produto.getIdProduto());
            st.executeQuery(query);
           
            
           
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void remover(Produto produto) throws Exception{
       try {
             String query = "DELETE FROM PRODUTO WHERE IDPRODUTO=?";
             PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setInt(1, produto.getIdProduto());
            st.executeQuery(query);
             
           
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Integer verificaExistencia(Produto produto){
        for ( int i=0; i < this.listaProduto.size(); i++){
            if ( this.listaProduto.get(i).equals(produto) ) {
                return i;
            }
        }
        return null;
    }
}
