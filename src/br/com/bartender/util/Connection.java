package br.com.bartender.util;

/*
 import java.sql.Connection;
 */
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karim.scofield
 */
public class Connection {

    private static java.sql.Connection con;
    
    public static java.sql.Connection getConnection(){
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bartender";
            con = DriverManager.getConnection(url,"root","");
            con.setAutoCommit(true);
            return con;
        } catch ( ClassNotFoundException e){
            e.printStackTrace();
        } catch ( SQLException se){
            se.printStackTrace();
        }
        return null;
    }
    
    public static void closeConnection(){
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}