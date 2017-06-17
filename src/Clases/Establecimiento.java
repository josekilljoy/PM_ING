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
	private Productor m_Productor = new Productor();

    public Establecimiento(String nombre, String telefono, String ubicación, Productor m_Productor) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicación = ubicación;
        this.m_Productor = m_Productor;
    }

    public Establecimiento(String nombre, String telefono, String ubicación) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicación = ubicación;
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
        
        

}
