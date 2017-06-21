/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Clases.Productor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nelson
 */
public class SQLconnection {
    private final String url = "jdbc:postgresql://localhost/PM_ING BD";
    private final String user = "postgres"; // Aquí el usuario de la BD
    private final String password = "postgres"; // Aquí el password de la BD
    
    private Connection conn;
 
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    
    //Se conecta con la BD
    public Connection connect() {
        conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }        
        
        return conn;
    }
    
    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* Método genérico que devuelve el resultado de una consulta en SQL */
    public ResultSet executeQuery(String query) {
        ResultSet rs=null;
        Statement s=null;
        
        try {
            s=conn.createStatement();
            rs=s.executeQuery(query);
        }
        catch(SQLException e) {
            System.out.println("Error executeQuery! " + e.getErrorCode());
        }
        
        return rs;
    }
    
    /* Método genérico para realizar las Altas/Bajas y Modificaciones en SQL */
    public boolean updateQuery(String query) {
        boolean exito=false;
        Statement s=null;
        
         try {
            s=conn.createStatement();
            s.executeUpdate(query);
            exito=true;
        }
        catch(SQLException e) {
            System.out.println("Error updateQuery! " + e.getErrorCode());
        }
        
        return exito;
    }
    
    // OBTENER TODOS LOS PRODUCTORES
    public ResultSet getProductoresResult() {
        ResultSet rs=executeQuery("SELECT * FROM Productor");
        
        return rs;
    }
    public ResultSet getEstablecimientosResult() {
        ResultSet rs=executeQuery("SELECT * FROM Establecimiento");
        
        return rs;
    }
    
    // OBTENER TODOS LOS PRODUCCION
    public ResultSet getProducccionResult() {
        ResultSet rs=executeQuery("SELECT * FROM Produccion");
        
        return rs;
    }
    //OBTENER EL CÓDIGO DE LOS ESTABLECIMIENTOS ASOCIOADOS AL PRODUCTOR
    public ResultSet getEstablecimientosAsociados(String cod_P){
        ResultSet rs= executeQuery("SELECT cod_E FROM Establecimiento WHERE cod_P = '"+cod_P+"'");
        
        return rs;
    }
    //OBTENER EL CÓDIGO DE LOS TAMBOS ASOCIOADOS AL ESTABLECIMIENTO
     public ResultSet getTambosAsociados(String cod_E){
        ResultSet rs= executeQuery("SELECT cod_T FROM Tambo WHERE cod_E = '"+cod_E+"'");
        
        return rs;
    }
    //OBTENER LOS CAMPOS DE LOS ANIMALES QUE PERTENECEN AL TAMBO Y ESTAN EN LA CLASE CONTROL_LECHERO 
         public ResultSet getControl_Lechero(String cod_T){
        ResultSet rs= executeQuery("SELECT Etq_A,fecha,Producción,ide FROM Control_lechero WHERE cod_T = '"+cod_T+"'");
        
        return rs;
    }
    // ALTA PRODUCTOR
    public boolean insertProductor(Productor p) {
        String query = "INSERT INTO Productor VALUES ( '" + p.getNombre() + "','" + p.getTelefono() + "','" + p.getCodProductor() + "' )";        
        boolean exito=updateQuery(query);
        
        return exito;
    }
    
    // ALTA PRODUCTOR   
    public boolean insertProductor(String codigo, String nombre, String telefono) {
        String query="INSERT INTO Productor VALUES ( '"+nombre+"' , '"+telefono+"', '"+codigo+"' )";
        boolean exito=updateQuery(query);
        
        return exito;
    }

    public ResultSet getAnimales(String Cod_T) {
        ResultSet rs= executeQuery("SELECT Nbre_A,Etq_A FROM Animal WHERE cod_T = '"+Cod_T+"'");
        return rs;
    }
    
    // ALTA ESTABLECIMIENTO
    public boolean insertEstablecimiento(String nom, String tel, String ub, String cod_e, String cod_p) {
        return updateQuery("INSERT INTO establecimiento VALUES ( '"+nom+"','"+tel+"','"+ub+"','"+cod_e+"','"+cod_p+"' )");
    }
    
    // DEVUELVE EL CODIGO DE ESTABLECIMIENTO, A PARTIR DEL NOMBRE DE ESTABLECIMIENTO
    public String getCodEstablecimiento(String nom) {
        String query="SELECT cod_e FROM establecimiento WHERE nbr_e='"+nom+"'";
        String cod="";
        boolean salir=false;
        
        ResultSet rs=executeQuery(query);
        
        try {
            while (rs.next()&&!salir) {
                cod=rs.getString(1);
                salir=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cod;
    }
    
    // ALTA TAMBO
    public boolean insertTambo(String distr, String nom, String codT, String codE) {
        return updateQuery("INSERT INTO tambo VALUES ( '"+distr+"','"+nom+"','"+codT+"','"+codE+"')");
    }
    
    // ALTA ANIMAL
    public boolean insertAnimal(String nom, String raza, String etqa, String cod_t) {
        return updateQuery("INSERT INTO animal VALUES ( '"+nom+"','"+raza+"','"+etqa+"','"+cod_t+"')");
    }
    
    // OBTIENE EL RESULTSET DE LOS EMPLEADOS
    public ResultSet getEmpleadosResult() {
        ResultSet rs=executeQuery("SELECT * FROM Empleado");
        
        return rs;
    }
    
    // INSERTA UNA PRODUCCION 
    public boolean insertProduccion(String codT, String etqA, String fec, String prod, String idE) {
        return updateQuery( "INSERT INTO control_lechero VALUES ( '"+codT+"','"+etqA+"','"+fec+"','"+prod+"','"+idE+"' )" );
    }
    
    // VERIFICA SI EXISTE UNA PRODUCCION YA REGISTRADA
    public boolean existeProduccion(String codT, String etqA) {
        boolean exito=false;
        ResultSet rs=executeQuery("SELECT cod_t, etq_a FROM control_lechero WHERE cod_t='"+codT+"' AND etq_a='"+etqA+"'");
        
        try {
            while (rs.next()&&!exito) {
                exito=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return exito;
    }
}
