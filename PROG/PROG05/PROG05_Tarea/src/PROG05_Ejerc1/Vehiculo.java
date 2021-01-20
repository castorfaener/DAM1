/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PROG05_Ejerc1;

/**
 * 
 * 
 * @author 
 * Francisco Alacreu Rosello
 */
public class Vehiculo {
    
    String matricula;
    String marca;
    int kilometros;
    String fechaMatriculacion;
    String descripcion;
    double precio;
    String nombrePropietario;
    String DNI;
    
    public Vehiculo(){
        
    }
    
    
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
     * Calcula los años que tiene el coche según la fecha de matriculacion. Pendiente!!!
     * @return Años desde matriculacion
     */
    public int get_Anios(){
        int Anios;
        
        return Anios;
        
    }
}
