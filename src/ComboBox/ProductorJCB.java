/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComboBox;

import Conexion.SQLconnection;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author josekilljoy95
 */
public class ProductorJCB {
    private SQLconnection conn= new SQLconnection();    
    
    
        public void listar_los_productores(JComboBox box){
        DefaultComboBoxModel value;
        int i;
        ResultSet rs;
        conn.connect();
        rs=conn.getProductoresResult();
        try{
           
            value = new DefaultComboBoxModel();
            box.setModel(value);
            box.addItem("Código Productor");
            while(rs.next()){
               
             
            //value.addElement(rs.getString(3));//new Productor(rs.getString(3),rs.getString(1),rs.getString(2)));  
            box.addItem(rs.getString(3));
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
