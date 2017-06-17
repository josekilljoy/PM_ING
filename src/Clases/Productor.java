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
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the establecimientos
     */
    public ArrayList<Establecimiento> getEstablecimientos() {
        return establecimientos;
    }

    /**
     * @param establecimientos the establecimientos to set
     */
    public void setEstablecimientos(ArrayList<Establecimiento> establecimientos) {
        this.establecimientos = establecimientos;
    }

    /**
     * @return the idProductor
     */
    public int getIdProductor() {
        return idProductor;
    }

    /**
     * @param idProductor the idProductor to set
     */
    public void setIdProductor(int idProductor) {
        this.idProductor = idProductor;
    }
    
    private int idProductor;
    private String nombre;
    private int telefono;
    private ArrayList<Establecimiento> establecimientos;
    
    //Constante que indica el nro de objetos instanciados
    //Lo usaremos para asignar el nro de identificador de cada instancia
    private static int NroEstablecimiento=0;
    
    // Constructor con el id del productor por defecto
    public Productor(String nombre, int telefono) {        
        this.nombre=nombre;
        this.telefono=telefono;
        this.establecimientos=new ArrayList<Establecimiento>();
        
        idProductor=NroEstablecimiento;        
        NroEstablecimiento++;
    }
    
    public Productor(String nombre, int telefono, ArrayList<Establecimiento> establecimientos) {        
        this.nombre=nombre;
        this.telefono=telefono;
        this.establecimientos=establecimientos;
        
        idProductor=NroEstablecimiento;        
        NroEstablecimiento++;
    }
    
    //Constructor por defecto
    public Productor() {
        nombre="";
        telefono=0;
        establecimientos=new ArrayList<Establecimiento>();
        
        idProductor=NroEstablecimiento;        
        NroEstablecimiento++;
    }
}
