/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm;

import Clases.Establecimiento;
import Clases.Productor;
import Conexion.SQLconnection;
import Diseño.Sistema_de_Control;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josekilljoy95
 */
public class PM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //San Lautaro
        //jhgf
        //JJJJ
        //uuuu
        //dsdsdsd
        
        Sistema_de_Control s = new Sistema_de_Control();
        s.setTitle("Sistema de Control Lechero");
        s.setVisible(true);
        
        Establecimiento es = new Establecimiento();
       // es.getIdEstablecimiento();
        
        Establecimiento es2 = new Establecimiento();
        //es2.getIdEstablecimiento();
        
        Establecimiento es3 = new Establecimiento();
        //es3.getIdEstablecimiento();
        
        SQLconnection conn = new SQLconnection();
        conn.connect();
        
        ResultSet rs=conn.getProductoresResult();
        String cadena="";
        try {
            while (rs.next()) {
                cadena += rs.getString (1) + ", " + rs.getString(2) + ", " + rs.getString(3)+"\n";                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(cadena);
        
    }
    
}
