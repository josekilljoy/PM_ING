/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author josekilljoy95
 */
public class Establecimiento {

  private String nombre;
	private String telefono;
	private String ubicación;
	private Productor m_Productor = new Productor();
        private String Cod_E;

    public Establecimiento(String nombre, String telefono, String ubicación, String Cod_E) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicación = ubicación;
        this.Cod_E = Cod_E;
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

    public Productor getM_Productor() {
        return m_Productor;
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

    public void setM_Productor(Productor m_Productor) {
        this.m_Productor = m_Productor;
    }

    public void setCod_E(String Cod_E) {
        this.Cod_E = Cod_E;
    }
    
    
        


}