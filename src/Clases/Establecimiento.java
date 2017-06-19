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

    private String nombre;
    private String telefono;
    private String ubicación;
    private String codProductor;
    private String Cod_E;
    
    private static int NroEstablecimiento=0;

    public Establecimiento(String nombre, String telefono, String ubicación, String Cod_E) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicación = ubicación;
        this.Cod_E = Cod_E;
    }
    
    public Establecimiento(String nombre, String telefono, String ubicación) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicación = ubicación;
        this.Cod_E = Integer.toString(NroEstablecimiento);
        
        NroEstablecimiento++;
    }

    public Establecimiento() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUbicación() {
        return ubicación;
    }

    public String getCod_E() {
        return Cod_E;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    public void setCod_E(String Cod_E) {
        this.Cod_E = Cod_E;
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
    
    
        


}