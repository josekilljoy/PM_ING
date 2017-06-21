/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComboBox;

import Clases.Establecimiento;
import Conexion.SQLconnection;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author josekilljoy95
 */
public class EstablecimientoCB {
     private SQLconnection conn= new SQLconnection();    
    
    
        public void listar_los_Establecimientos(JComboBox box, String cod_P){
        DefaultComboBoxModel value;
        int i;
        conn.connect();
        ResultSet rs=conn.getEstablecimientosAsociados(cod_P);
        try{
            
            
            value = new DefaultComboBoxModel();
            box.setModel(value);
            
            box.addItem("Código establecimiento");
            while(rs.next()){
               
              //value.addElement(rs.getString(4));//new Establecimiento(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(5),rs.getString(4)));  
             box.addItem(rs.getString(1));
            }
        }catch(Exception ex){
        }finally{
            try{
                conn.close();
            }catch(Exception ex){
                
            }
        }
    
}
}