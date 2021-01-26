/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dninif;

import dninif.util.DNI;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Principal {
    static Scanner sca = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.out.println("Escriba su DNI:");
        String dni = sca.nextLine();
        System.out.println("dni:" + dni);
        
        //Comprobamos si el dni suministrado en correcto
        boolean valido=DNI.validarNIF(dni);
        if(valido)
            System.out.println("El dni es válido");
        else
            System.out.println("El dni no es válido");
        
    }
    
}
