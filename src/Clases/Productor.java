/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Nelson
 */
public class Productor {

    /**
     * @return the codProductor
     */
    public String getCodProductor() {
        return codProductor;
    }

    /**
     * @param codProductor the codProductor to set
     */
    public void setCodProductor(String codProductor) {
        this.codProductor = codProductor;
    }

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
    
    
    private String codProductor;
    private String nombre;
    private String telefono;
    
    public Productor(String codProductor, String nombre, String telefono) {        
        this.codProductor=codProductor;
        this.nombre=nombre;
        this.telefono=telefono;
    }
    
    public Productor() {
    }
    
}
