/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bartender.dao;

import java.util.ArrayList;
import br.com.bartender.model.Evento;
import br.com.bartender.util.Connection;
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
    private Connection con;
    
    /*SINGLETON*/
    public static EventoDao obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new EventoDao();
        }
        return instanciaRep;
    }
    
    public EventoDao(){
        this.listaEvento = new ArrayList<Evento>();
        con = new Connection();
    }
    
    public void inserir(Evento evento){
        try {
            String query = "INSERT INTO PRODUTO ( NOMEPRODUTO, VALORPRODUTO ) VALUES ( ?, ?)";
            PreparedStatement pst = con.getConnection().prepareStatement(query);
            pst.setString(1, evento.getNomeEvento());
            pst.setString(3, evento.getDataEvento());
            pst.setString(3, evento.getHorarioEvento());
           /* pst.setDouble(3, evento.);*/
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
            String query = "SELECT * FROM PRODUTO";
            ResultSet rs = st.executeQuery(query);
            while( rs.next() ){
                Evento p = new Evento();
                p.setNomeEvento(rs.getString("NOMEPRODUTO"));
              /*  p.setValorEvento(rs.getDouble("VALORPRODUTO"));*/
                /*p.setIdEvento(rs.getInt("Id"));*/
                
                this.listaEvento.add( p );
            }
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return this.listaEvento;
    }
    
    public void alterar(Evento evento){
         try {
             String query = "UPDATE PRODUTO SET NOMEPRODUTO=?, VALORPRODUTO=?, WHERE ID=?";
             PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setString(1,evento.getNomeEvento());
           /* st.setDouble(2,evento.getValorEvento());*/
            /*st.setInt(3,evento.getIdEvento());*/
            st.executeQuery(query);
           
            
           
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void remover(Evento evento) throws Exception{
       try {
             String query = "DELETE FROM PRODUTO WHERE ID=?";
             PreparedStatement st = con.getConnection().prepareStatement(query);
            
            st.setInt(1,evento.getIdEvento());
            st.executeQuery(query);
             
           
            con.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
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