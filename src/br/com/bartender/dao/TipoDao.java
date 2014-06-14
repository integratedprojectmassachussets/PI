package br.com.bartender.dao;

import java.util.ArrayList;
import br.com.bartender.model.Tipo;
import br.com.bartender.util.ConnectionUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author karim_scofield
 */
public class TipoDao {
    
    private ArrayList<Tipo> listaTipo;
    private static TipoDao instanciaRep;
    private ConnectionUtil con;
    
    
    /*SINGLETON*/
    public static TipoDao obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new TipoDao();
        }
        return instanciaRep;
    }
    
    public TipoDao(){
        this.listaTipo = new ArrayList<Tipo>();
        con = new ConnectionUtil();
    }
    
    public void inserir(Tipo tipo){
        try {
            String query = "INSERT INTO TIPO ( IDTIPO, NOMETIPO ) VALUES ( ?, ?)";
            PreparedStatement pst = con.getConnection().prepareStatement(query);
            pst.setInt(1, tipo.getIdTipo());
            pst.setString(2, tipo.getNomeTipo());
            pst.execute();
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Tipo> listarTodos(){
        this.listaTipo = new ArrayList<>(); /*Para não duplicar a lista*/
        try {
            Statement st = con.getConnection().createStatement();
            String query = "SELECT * FROM TIPO";
            ResultSet rs = st.executeQuery(query);
            while( rs.next() ){
                Tipo p = new Tipo();
                p.setIdTipo(rs.getInt("IDTIPO"));
                p.setNomeTipo(rs.getString("NOMETIPO"));
                
                this.listaTipo.add( p );
            }
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return this.listaTipo;
    }
    
    
    public void remover(Tipo tipo) throws Exception{
       try {
             String query = "DELETE FROM TIPO WHERE IDTIPO=?";
             PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setInt(1, tipo.getIdTipo());
            st.executeQuery(query);
             
           
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Integer verificaExistencia(Tipo tipo){
        for ( int i=0; i < this.listaTipo.size(); i++){
            if ( this.listaTipo.get(i).equals(tipo) ) {
                return i;
            }
        }
        return null;
    }
}
    
    

