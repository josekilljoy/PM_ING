/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComboBox;

import Clases.Tambo;
import Conexion.SQLconnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author josekilljoy95
 */
public class TamboCB {
    private SQLconnection conn= new SQLconnection();
    
        public void listar_los_Tambos(JComboBox box, String cod_E){
            DefaultComboBoxModel value;
            int i;
            ResultSet rs;
        try{
            conn.connect();
            rs=conn.getTambosAsociados(cod_E);
            value = new DefaultComboBoxModel();
            box.setModel(value);
            
            box.addItem("Código Tambo");
            while(rs.next()) {
               
              //value.addElement(rs.getString(1));//new Tambo(rs.getString(3),rs.getString(2),rs.getString(1),rs.getString(4))); 
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