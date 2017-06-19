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
    public ResultSet getProductores() {
        ResultSet rs=executeQuery("SELECT * FROM Productor");
        
        return rs;
    }
    
    // ALTA DE PRODUCTOR
    public boolean insertarProductor(Productor p) {
        String query = "INSERT INTO Productor VALUES ( '" + p.getNombre() + "','" + p.getTelefono() + "'," + p.getIdProductor() + " )";        
        boolean exito=updateQuery(query);
        
        return exito;
    }
   
}
