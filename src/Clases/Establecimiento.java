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
  private String idEstablecimiento;


    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setUbicacion(String ubicación) {
        this.ubicacion = ubicación;
    }

    /**
     * @return the productores
     */
    public ArrayList<Productor> getProductores() {
        return productores;
    }

    /**
     * @param productores the productores to set
     */
    public void setProductores(ArrayList<Productor> productores) {
        this.productores = productores;
    }

    /**
     * @return the idEstablecimiento
     */
    public int getIdEstablecimiento() {
        return idEstablecimiento;
    }

    /**
     * @param idEstablecimiento the idEstablecimiento to set
     */
    public void setIdEstablecimiento(int idEstablecimiento) {
        this.idEstablecimiento = idEstablecimiento;
    }

    private int idEstablecimiento;
    private String nombre;
    private int telefono;
    private String ubicacion;
    private ArrayList<Productor> productores;

    //Constante que indica el nro de establecimientos creados
    //Lo usaremos para asignar el nro de identificador de cada instancia
    private static int NroEstablecimiento=0;
    
    //Sin identificador del Establecimiento
    public Establecimiento(String nombre, int telefono, String ubicacion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.productores = new ArrayList<Productor>();
        
        idEstablecimiento=NroEstablecimiento;        
        NroEstablecimiento++;
    }

    public Establecimiento(String nombre, int telefono, String ubicacion, ArrayList<Productor> productores) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.productores = productores;
        
        idEstablecimiento=NroEstablecimiento;
        NroEstablecimiento++;
    }
    
    //Constructor que se usa para le lectura un Establecimiento desde la base de datos
    public Establecimiento(int idEstablecimiento, String nombre, int telefono, String ubicacion, ArrayList<Productor> productores) {
        this.idEstablecimiento=idEstablecimiento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.productores = productores;        
    }
    
    public Establecimiento() {
        this.nombre = "";
        this.telefono = 0;
        this.ubicacion = "";
        this.productores = new ArrayList<Productor>();
        
        idEstablecimiento=NroEstablecimiento;
        NroEstablecimiento++;
    }
}
