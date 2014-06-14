
package br.com.bartender.dao;

import java.util.ArrayList;
import br.com.bartender.model.Comanda;
import br.com.bartender.model.Evento;
import br.com.bartender.util.ConnectionUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Karim
 */
public class ComandaDao {
    
    private ArrayList<Comanda> listaComanda;
    private static ComandaDao instanciaRep;
    private ConnectionUtil con;
        
    
    
    public static ComandaDao obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new ComandaDao();
        }
        return instanciaRep;
    }
    
    public ComandaDao(){
        this.listaComanda = new ArrayList<Comanda>();
        con = new ConnectionUtil();
    }
    
    public void inserir(Comanda comanda){
        /*Verificar a inser;áo do valorentradacomanda*/
        try {
            
            String query = "INSERT INTO COMANDA ( IDCOMANDA, NOMECLIENTECOMANDA, SEXOCLIENTECOMANDA, TELEFONECLIENTECOMANDA, SITUACAOCOMANDA, EVENTO_IDEVENTO) VALUES ( ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.getConnection().prepareStatement(query);
            pst.setInt(1, comanda.getIdComanda());
            pst.setString(2, comanda.getNomeClienteComanda());
            pst.setString(3, comanda.getSexoClienteComanda());
            pst.setString(4, comanda.getTelefoneClienteComanda());
            pst.setString(5, "A");
            pst.setInt(6, comanda.getEventoVigente().getIdEvento());
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
            String query = "SELECT C.IDCOMANDA, C.NOMECLIENTECOMANDA, C.SEXOCLIENTECOMANDA, C.TELEFONECLIENTECOMANDA, E.IDEVENTO, E.NOMEEVENTO, E.DATAEVENTO FROM COMANDA C JOIN EVENTO E ON C.EVENTO_IDEVENTO = E.IDEVENTO";
            ResultSet rs = st.executeQuery(query);
            while( rs.next() ){
                Comanda c = new Comanda();
                Evento e = new Evento();
                c.setIdComanda(rs.getInt("IDCOMANDA"));
                c.setNomeClienteComanda(rs.getString("NOMECLIENTECOMANDA"));
                c.setSexoClienteComanda(rs.getString("SEXOCLIENTECOMANDA"));
                c.setTelefoneClienteComanda(rs.getString("TELEFONECLIENTECOMANDA"));
                
                e.setIdEvento(rs.getInt("EVENTO_IDEVENTO"));
                e.setNomeEvento(rs.getString("NOMEEVENTO"));
                e.setDataEvento(rs.getDate("DATAEVENTO"));
                
                
                c.setEventoVigente(e);
                
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
             String query = "UPDATE COMANDA SET NOMECLIENTECOMANDA=?, SEXOCLIENTECOMANDA=?, TELEFONECLIENTECOMANDA=? WHERE IDCOMANDA=? AND EVENTO_IDEVENTO=?";
             PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setString(1, comanda.getNomeClienteComanda());
            st.setString(2, comanda.getSexoClienteComanda());
            st.setString(3, comanda.getTelefoneClienteComanda());
            st.setInt(4, comanda.getIdComanda());
            st.setInt(5, comanda.getEventoVigente().getIdEvento());
            st.executeQuery(query);
           
            
           
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public void remover(Comanda comanda) throws Exception{
       try {
             String query = "DELETE FROM COMANDA WHERE IDCOMANDA=? AND IDEVENTO=?";
             PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setInt(1, comanda.getIdComanda());
            st.setInt(2, comanda.getEventoVigente().getIdEvento());
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
