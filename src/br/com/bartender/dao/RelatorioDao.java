
package br.com.bartender.dao;

import br.com.bartender.util.ConnectionUtil;

/**
 *
 * @author karim_scofield
 */
public class RelatorioDao {
 
    
    private ConnectionUtil con;
    private static RelatorioDao instanciaRep;
    
    /*SINGLETON*/
    public static RelatorioDao obterInstancia(){
        if ( instanciaRep == null ){
            instanciaRep = new RelatorioDao();
        }
        return instanciaRep;
    }
    
    
    
    
    
}
