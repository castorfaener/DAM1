/*
 * Ejercicio 1 para PROG03
 */
package prog03_ejerc1;

import prog03_ejerc1.newpackage.*;
import prog03_ejerc1.newpackage.Fecha.enumMes;

public class Prog03_Ejerc1 {

    
    public static void main(String[] args) {
      
        //Realizamos pruebas para compbrobar el codigo
        
        Fecha miFecha = new Fecha(1, enumMes.ENERO, 2012);
        
        int dia = Fecha.fechaDia;
        int anyo = Fecha.fechaAnio;
        boolean verano;
        
        verano = Fecha.isSummer();
        
        System.out.println("Hoy es " + dia +" del año " + anyo + "y estamos en verano? " + verano); 
        
        
    }
    
}
