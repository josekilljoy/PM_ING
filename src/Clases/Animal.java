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
public class Animal {

    /**
     * @return the etiqueta
     */
    public String getEtiqueta() {
        return etiqueta;
    }

    /**
     * @param etiqueta the etiqueta to set
     */
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
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
    
    //La etiqueta del animal es el identificador
    private String nombre;
    private String raza;
    private String etiqueta;
    private String codTambo;
    
    public Animal(String nombre, String raza, String etiqueta, String codTambo) {
        this.nombre=nombre;
        this.etiqueta=etiqueta;
        this.raza=raza;
        this.codTambo=codTambo;
    }
    
    //Constructor por defecto
    public Animal() {
    }

    /**
     * @return the codTambo
     */
    public String getCodTambo() {
        return codTambo;
    }

    /**
     * @param codTambo the codTambo to set
     */
    public void setCodTambo(String codTambo) {
        this.codTambo = codTambo;
    }
   
}
