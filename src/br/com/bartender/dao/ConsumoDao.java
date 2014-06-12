package br.com.bartender.dao;

import java.util.ArrayList;
import br.com.bartender.model.Consumo;
import br.com.bartender.model.Produto;
import br.com.bartender.util.ConnectionUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author karim_scofield
 */
public class ConsumoDao {
    
    
    private ArrayList<Consumo> listaConsumo;
    private static ConsumoDao instanciaRep;
    private ConnectionUtil con;
    
    /*SINGLETON*/
    public static ConsumoDao obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new ConsumoDao();
        }
        return instanciaRep;
    }
    
    
    public ConsumoDao(){
        this.listaConsumo = new ArrayList<Consumo>();
        con = new ConnectionUtil();
    }
    
    public void inserir(Consumo consumo){
        try {
            String query = "INSERT INTO CONSUMO ( QUANTIDADEPRODUTO, COMANDAID, PRODUTOID) VALUES ( ?, ?, ?)";
            PreparedStatement pst = con.getConnection().prepareStatement(query);
            pst.setInt(1, consumo.getQuantidadeProduto());
            pst.setInt(2, consumo.getComandaRelacionada().getIdComanda());
            pst.setInt(3, consumo.getProdutoInserido().getIdProduto());
            pst.execute();
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Consumo> listarConsumoComanda(Consumo consumo){
        this.listaConsumo = new ArrayList<>(); /*Para não duplicar a lista*/
        try {
            String query = "SELECT P.IDPRODUTO, P.NOMEPRODUTO, P.VALORPRODUTO, C.QUANTIDADEPRODUTO FROM CONSUMO C JOIN PRODUTO P ON C.PRODUTOIDPRODUTO = P.IDPRODUTO WHERE IDCOMANDA=?";
            PreparedStatement pst = con.getConnection().prepareStatement(query);
            pst.setInt(1, consumo.getComandaRelacionada().getIdComanda());
            ResultSet rs = pst.executeQuery(query);
            while( rs.next() ){
                Consumo c = new Consumo();
                Produto p = new Produto();
                c.setQuantidadeProduto(rs.getInt("QUANTIDADEPRODUTO"));
                
                p.setValorProduto(rs.getDouble("VALORPRODUTO"));
                p.setNomeProduto(rs.getString("NOMEPRODUTO"));
                
                c.setProdutoInserido(p);
                this.listaConsumo.add( c );
            }
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return this.listaConsumo;
    }
    
    
}
