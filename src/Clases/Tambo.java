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
public class Tambo {

    /**
     * @return the idTambo
     */
    public int getIdTambo() {
        return idTambo;
    }

    /**
     * @param idTambo the idTambo to set
     */
    public void setIdTambo(int idTambo) {
        this.idTambo = idTambo;
    }

    /**
     * @return the distribucion
     */
    public String getDistribucion() {
        return distribucion;
    }

    /**
     * @param distribucion the distribucion to set
     */
    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
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
    
    private int idTambo;
    private String distribucion;
    private String nombre;
    
    private static int NroTambo=0;
    
    //Constructor principal
    public Tambo(String nombre, String distribucion) {
        this.nombre=nombre;
        this.distribucion=distribucion;
        
        idTambo=NroTambo;
        NroTambo++;
    }
    
    public Tambo(String nombre, String distribucion, ArrayList<Animal> animales) {
        this.nombre=nombre;
        this.distribucion=distribucion;
        
        idTambo=NroTambo;
        NroTambo++;
    }
    
    //Constructor que se usa para le lectura un Tambo desde la base de datos
    public Tambo(int idTambo, String nombre, String distribucion, ArrayList<Animal> animales) {
        this.idTambo=idTambo;
        this.nombre=nombre;
        this.distribucion=distribucion;
    }
    
    //Constructor por defecto
    public Tambo() {
        this.nombre="";
        this.distribucion="";
        
        idTambo=NroTambo;
        NroTambo++;
    }
    
}
