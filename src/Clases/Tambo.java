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
public class Tambo {

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
    
    private String codTambo;
    private String nombre;
    private String distribucion;
    private String codEmpleado;
    
    //Constructor principal
    public Tambo(String codTambo, String nombre, String distribucion, String codEmpleado) {
        this.codTambo=codTambo;
        this.nombre=nombre;
        this.distribucion=distribucion;        
        this.codEmpleado=codEmpleado;
    }
    
    //Constructor por defecto
    public Tambo() {
    }

    /**
     * @return the codEmpleado
     */
    public String getCodEmpleado() {
        return codEmpleado;
    }

    /**
     * @param codEmpleado the codEmpleado to set
     */
    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }
    
}
