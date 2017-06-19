/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Nelson
 */
public class Productor {    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the idProductor
     */
    public String getIdProductor() {
        return idProductor;
    }

    /**
     * @param idProductor the idProductor to set
     */
    public void setIdProductor(String idProductor) {
        this.idProductor = idProductor;
    }
    
    private String idProductor;
    private String nombre;
    private String telefono;
    
    //Constante que indica el nro de objetos instanciados
    //Lo usaremos para asignar el nro de identificador de cada instancia
    private static int NroEstablecimiento=0;
    
    // Constructor con el id del productor por defecto
    public Productor(String nombre, String telefono) {        
        this.nombre=nombre;
        this.telefono=telefono;
        
        idProductor=Integer.toString(NroEstablecimiento);
        NroEstablecimiento++;
    }
    
    public Productor(String nombre, String telefono, ArrayList<Establecimiento> establecimientos) {        
        this.nombre=nombre;
        this.telefono=telefono;
        
        idProductor=Integer.toString(NroEstablecimiento);
        NroEstablecimiento++;
    }
    
    //Constructor que se usa para le lectura un Productor desde la base de datos
    public Productor(String idProductor, String nombre, String telefono, ArrayList<Establecimiento> establecimientos) {        
        this.idProductor=idProductor;
        this.nombre=nombre;
        this.telefono=telefono;
    }
    
    //Constructor por defecto
    public Productor() {
        nombre="";
        telefono="";
        
        idProductor=Integer.toString(NroEstablecimiento);
        NroEstablecimiento++;
    }
    
}
