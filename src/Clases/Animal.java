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
    
    //La etiqueta del animal es el identificador
    private String etiqueta;
    private String raza;
    
    public Animal(String etiqueta, String raza) {
        this.etiqueta=etiqueta;
        this.raza=raza;
    }
    
    //Constructor por defecto
    public Animal() {
        etiqueta="";
        raza="";
    }
}
