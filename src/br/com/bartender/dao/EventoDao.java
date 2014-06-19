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
import java.sql.Date;
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
            String query = "INSERT INTO EVENTO ( NOMEEVENTO, DATAEVENTO, HORARIOEVENTO, VALORMASC, VALORFEM  ) VALUES ( ?, ?, ?, ?, ? )";
            PreparedStatement pst = con.getConnection().prepareStatement(query);
            
            pst.setString(1, evento.getNomeEvento());
            pst.setDate(2, new java.sql.Date(evento.getDataEvento().getTime()));
            pst.setString(3, evento.getHorarioEvento());
            pst.setDouble(4, evento.getValorMasc());
            pst.setDouble(5, evento.getValorFem());
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
                e.setDataEvento(rs.getDate("DATAEVENTO"));
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
    
    
    public ArrayList<Evento> listarEventoId(Evento evento){
        this.listaEvento = new ArrayList<>(); /*Para não duplicar a lista*/
        try {
            String query = "SELECT * FROM EVENTO WHERE IDEVENTO=?";
            PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setInt(1, evento.getIdEvento());
            
            ResultSet rs = st.executeQuery();
            while( rs.next() ){
                Evento e = new Evento();
                e.setIdEvento(rs.getInt("IDEVENTO"));
                e.setNomeEvento(rs.getString("NOMEEVENTO"));
                e.setDataEvento(rs.getDate("DATAEVENTO"));
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
    
    public ArrayList<Evento> listarEventoNome(Evento evento){
        this.listaEvento = new ArrayList<>(); /*Para não duplicar a lista*/
        try {
            String query = "SELECT * FROM EVENTO WHERE NOMEEVENTO LIKE ?";
            PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setString(1, "%"+evento.getNomeEvento()+"%");
            
            ResultSet rs = st.executeQuery();
            while( rs.next() ){
                Evento e = new Evento();
                e.setIdEvento(rs.getInt("IDEVENTO"));
                e.setNomeEvento(rs.getString("NOMEEVENTO"));
                e.setDataEvento(rs.getDate("DATAEVENTO"));
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
    
    public ArrayList<Evento> listarEventoIntervaloData(Date evento1, Date evento2){
        this.listaEvento = new ArrayList<>(); /*Para não duplicar a lista*/
        try {
            String query = "SELECT * FROM EVENTO WHERE DATAEVENTO BETWEEN ? AND ?";
            PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setDate(1, evento1);
            st.setDate(2, evento2);
            
            ResultSet rs = st.executeQuery();
            while( rs.next() ){
                Evento e = new Evento();
                e.setIdEvento(rs.getInt("IDEVENTO"));
                e.setNomeEvento(rs.getString("NOMEEVENTO"));
                e.setDataEvento(rs.getDate("DATAEVENTO"));
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
            st.setDate(2, new java.sql.Date(evento.getDataEvento().getTime()));
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
             String query = "DELETE FROM EVENTO WHERE IDEVENTO= ?";
             PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setInt(1,evento.getIdEvento());
            st.executeUpdate();
             
           
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
