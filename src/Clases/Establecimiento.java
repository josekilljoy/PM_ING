/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author josekilljoy95
 */
public class Establecimiento {

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
     * @return the ubicación
     */
    public String getUbicación() {
        return ubicación;
    }

    /**
     * @param ubicación the ubicación to set
     */
    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

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
     * @return the Cod_E
     */
    public String getCod_E() {
        return Cod_E;
    }

    /**
     * @param Cod_E the Cod_E to set
     */
    public void setCod_E(String Cod_E) {
        this.Cod_E = Cod_E;
    }

    private String nombre;
    private String telefono;
    private String ubicación;
    private String codProductor;
    private String Cod_E;
    
    public Establecimiento(String nombre, String telefono, String ubicación, String codProductor, String Cod_E) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicación = ubicación;
        this.codProductor = codProductor;
        this.Cod_E = Cod_E;
    }
    
    public Establecimiento() {
    }
    
}