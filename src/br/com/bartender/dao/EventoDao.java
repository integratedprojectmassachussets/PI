/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bartender.dao;

import java.util.ArrayList;
import br.com.bartender.model.Evento;
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
public class EventoDao {

    private ArrayList<Evento> listaEvento;
    private static EventoDao instanciaRep;
    private ConnectionUtil con;
    
    /*SINGLETON*/
    public static EventoDao obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new EventoDao();
        }
        return instanciaRep;
    }
    
    public EventoDao(){
        this.listaEvento = new ArrayList<Evento>();
        con = new ConnectionUtil();
    }
    
    public void inserir(Evento evento){
        try {
            String query = "INSERT INTO EVENTO ( IDEVENTO, NOMEEVENTO, DATAEVENTO, HORARIOEVENTO, VALORMASC, VALORFEM  ) VALUES ( ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.getConnection().prepareStatement(query);
            pst.setInt(1, evento.getIdEvento());
            pst.setString(2, evento.getNomeEvento());
            pst.setString(3, evento.getDataEvento());
            pst.setString(4, evento.getHorarioEvento());
            pst.setDouble(5, evento.getValorMasc());
            pst.setDouble(6, evento.getValorFem());
            pst.execute();
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Evento> listarTodos(){
        this.listaEvento = new ArrayList<>(); /*Para não duplicar a lista*/
        try {
            Statement st = con.getConnection().createStatement();
            String query = "SELECT * FROM EVENTO";
            ResultSet rs = st.executeQuery(query);
            while( rs.next() ){
                Evento e = new Evento();
                e.setIdEvento(rs.getInt("IDEVENTO"));
                e.setNomeEvento(rs.getString("NOMEEVENTO"));
                e.setDataEvento(rs.getString("DATAEVENTO"));
                e.setHorarioEvento(rs.getString("HORARIOEVENTO"));
                e.setValorMasc(rs.getDouble("VALORMASC"));
                e.setValorFem(rs.getDouble("VALORFEM"));
                
                
                this.listaEvento.add( e );
            }
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return this.listaEvento;
    }
    
    public void alterar(Evento evento){
         try {
             String query = "UPDATE EVENTO SET NOMEEVENTO=?, DATAEVENTO=?, HORARIOEVENTO=?, VALORMASC=?, VALORFEM=? WHERE IDEVENTO=?";
             PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setString(1, evento.getNomeEvento());
            st.setString(2, evento.getDataEvento());
            st.setString(3, evento.getHorarioEvento());
            st.setDouble(4, evento.getValorMasc());
            st.setDouble(5, evento.getValorFem());
            st.setInt(6, evento.getIdEvento());
            st.executeQuery(query);
           
            
           
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void remover(Evento evento) throws Exception{
       try {
             String query = "DELETE FROM EVENTO WHERE IDEVENTO=?";
             PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setInt(1,evento.getIdEvento());
            st.executeQuery(query);
             
           
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static EventoDao getInstanciaRep() {
        return instanciaRep;
    }
    
    public Integer verificaExistencia(Evento evento){
        for ( int i=0; i < this.listaEvento.size(); i++){
            if ( this.listaEvento.get(i).equals(evento) ) {
                return i;
            }
        }
        return null;
    }
}
