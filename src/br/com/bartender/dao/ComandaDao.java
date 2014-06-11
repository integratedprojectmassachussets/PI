
package br.com.bartender.dao;

import java.util.ArrayList;
import br.com.bartender.model.Comanda;
import br.com.bartender.util.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Karim
 */
public class ComandaDao {
    
    private ArrayList<Comanda> listaComanda;
    private static ComandaDao instanciaRep;
    private Connection con;
        
    
    
    public static ComandaDao obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new ComandaDao();
        }
        return instanciaRep;
    }
    
    public ComandaDao(){
        this.listaComanda = new ArrayList<Comanda>();
        con = new Connection();
    }
    
    public void inserir(Comanda comanda){
        /*Verificar a inser;áo do valorentradacomanda*/
        /* Verificar a situacao comanda*/
        try {
            String query = "INSERT INTO COMANDA ( IDCOMANDA, NOMECLIENTECOMANDA, SEXOCLIENTECOMANDA, TELEFONECLIENTECOMANDA,) VALUES ( ?, ?, ?, ?)";
            PreparedStatement pst = con.getConnection().prepareStatement(query);
            pst.setInt(1, comanda.getIdComanda());
            pst.setString(2, comanda.getNomeClienteComanda());
            pst.setString(3, comanda.getSexoClienteComanda());
            pst.setString(4, comanda.getTelefoneClienteComanda());
            pst.execute();
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public ArrayList<Comanda> listarTodos(){
        this.listaComanda = new ArrayList<>(); /*Para não duplicar a lista*/
        try {
            Statement st = con.getConnection().createStatement();
            String query = "SELECT * FROM COMANDA";
            ResultSet rs = st.executeQuery(query);
            while( rs.next() ){
                Comanda c = new Comanda();
                c.setIdComanda(rs.getInt("IDCOMANDA"));
                c.setNomeClienteComanda(rs.getString("NOMECLIENTECOMANDA"));
                c.setSexoClienteComanda(rs.getString("SEXOCLIENTECOMANDA"));
                c.setTelefoneClienteComanda(rs.getString("TELEFONECLIENTECOMANDA"));
                
                
                
                this.listaComanda.add( c );
            }
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return this.listaComanda;
    }
    
    public void alterar(Comanda comanda){
         try {
             String query = "UPDATE COMANDA SET NOMECLIENTECOMANDA=?, SEXOCLIENTECOMANDA=?, TELEFONECLIENTECOMANDA=? WHERE IDCOMANDA=?";
             PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setString(1, comanda.getNomeClienteComanda());
            st.setString(2, comanda.getSexoClienteComanda());
            st.setString(3, comanda.getTelefoneClienteComanda());
            st.setInt(4, comanda.getIdComanda());
            st.executeQuery(query);
           
            
           
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public void remover(Comanda comanda) throws Exception{
       try {
             String query = "DELETE FROM COMANDA WHERE IDCOMANDA=?";
             PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setInt(1, comanda.getIdComanda());
            st.executeQuery(query);
             
           
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Integer verificaExistencia(Comanda comanda){
        for ( int i=0; i < this.listaComanda.size(); i++){
            if ( this.listaComanda.get(i).equals(comanda) ) {
                return i;
            }
        }
        return null;
    }
    
    
        
}
