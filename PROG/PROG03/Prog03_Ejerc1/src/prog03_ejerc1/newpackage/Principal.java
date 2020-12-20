/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prog03_ejerc1.newpackage;

import prog03_ejerc1.newpackage.Fecha.enumMes;


public class Principal {
    public static void main (String [] args){
        Fecha objFecha1 = new Fecha(enumMes.JULIO);
        objFecha1.setDia(22);
        objFecha1.setAnio(2012);
        
        System.out.println("Primera fecha, inicializada con el primer constructor");
        System.out.println(objFecha1);
        System.out.println("¿Es verano?: " + objFecha1.isSummer() + "\n\n");
        
        Fecha objFecha2 = new Fecha(4, enumMes.ENERO, 1985);
        System.out.println("Segunda fecha, inicializada con el segundo constructor");
        System.out.println("Contiene el año " + objFecha2.getAnio());
        System.out.println(objFecha2);
        System.out.println("¿Es verano?: " + objFecha2.isSummer() + "\n\n");
        
        
    }
}
