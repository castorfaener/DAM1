/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Concesionarios;

import java.time.*;


/**
 * 
 * 
 * @author Francisco Alacreu Rosello
 * 
 */
public class Vehiculo {
    
    private String matricula;
    private String marca;
    private int kilometros;
    private static LocalDate fechaMatriculacion;
    private String descripcion;
    private double precio;
    private String nombrePropietario;
    private String DNI;
    
    
    
    
    /**
     * setter para el atributo marca
     * @param m marca del coche
     */
    public void setMarca(String m){
        this.marca = m;
    }
    
    /**
     * getter del atributo marca
     * @return marca del coche
     */
    public String getMarca(){
        return this.marca;
    }
    
    /**
     * setter para el atributo matricula
     * @param m matricula del coche
     */
    public void setMatricula(String m){
        this.matricula = m;
    }
    
    /**
     * getter del atributo matricula
     * @return matricula del coche
     */
    public String getMatricula(){
        return this.matricula;
    }
    
    /**
     * setter para el atributo kilometros
     * @param km kilometros del coche
     */
    public void setKm(int km){
        this.kilometros = km;
    }
    
    /**
     * getter para el atributo kilometros
     * @return kilometros del coche
     */
    public int getKm(){
        return this.kilometros;
    }
    
    /**
     * setter para el atributo nombrePropietario
     * @param prp Propietario del coche
     */
    public void setPropietario(String prp){
        this.nombrePropietario = prp;
    }
    
    /**
     * getter para el atributo nombrePropietario
     * @return nombre del propietario del coche
     */
    public String getPropietario(){
        return this.nombrePropietario;
    }
    
    /**
     * setter del atributo precio del coche
     * @param pr precio del coche
     */
    public void setPrecio(double pr){
        this.precio = pr;
    }
    
    /**
     * getter del atributo precio del coche
     * @return precio del coche
     */
    public double getPrecio(){
        return this.precio;
    }
    
    /**
     * setter del atributo descripcion del coche
     * @param desc descripcion del coche
     */
    public void setDescripcion(String desc){
        this.descripcion = desc;
    }
    
    /**
     * getter del atributo descripcion del coche
     * @return descripcion del coche
     */
    public String getDescripcion(){
        return this.descripcion;
    }
    
    /**
     * setter para el atributo de fecha de matriculacion
     * @param dia Dia de matriculacion
     * @param mes Mes de matriculacion
     * @param anio Año de matriculacion
     */
    public void setFechaMatriculacion(int dia, int mes, int anio){
        fechaMatriculacion = LocalDate.of(anio, mes, dia);
        
    }
    
    /**
     * getter del atributo fecha de matriculacion
     * @return fecha de matriculacion. LocalDate
     */
    public LocalDate getFechaMatriculacion(){
        return fechaMatriculacion;
    }
    
    /**
     * setter para el atributo DNI del propietario
     * @param DNI DNI del propietario
     */
    public void setDNI(String DNI){
        this.DNI = DNI;
    }
    
    /**
     * getter para el atributo DNI del propietario
     * @return DNI del propietario
     */
    public String getDNI(){
        return this.DNI;
    }
    
    /**
     * Calcula los años que tiene el coche según la fecha de matriculacion. 
     * @return Años desde matriculacion
     */
    public int getAnios(){
        int Anios = Period.between(fechaMatriculacion, LocalDate.now()).getYears();
        
        return Anios;
        
    }
    
    /**
     * Constructor de la clase vehiculo
     */
    public Vehiculo(){
        matricula = "";
        marca  = "";
        kilometros = 0;
        descripcion = "";
        precio = 0;
        nombrePropietario = "";
        DNI = "";
        
        
    }
}

