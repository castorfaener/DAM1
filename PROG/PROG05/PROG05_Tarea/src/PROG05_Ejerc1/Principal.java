/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG05_Ejerc1;

import java.util.Scanner;

/**
 *
 * @author Francisco Alacreu Rosello
 */
public class Principal {

     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int select;
        boolean vehiculo = false;
        
        select = menu();
        
        while(select != 9){
            switch(select){
                case 0:
                    System.out.println("La opcion elegida no es correcta. Intentalo de nuevo");
                    break;
                
                case 1:
                    //Nuevo Vehiculo
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    //Ver numero de kilometros
                    break;
                    
                case 4:
                    //Actualizar kilometros
                    break;
                    
                case 5:
                    //Ver años de antiguedad
                    break;
                    
                case 6:
                    //Mostrar propietario
                    break;
                    
                case 7:
                    //Mostrar descripcion
                    break;
                    
                case 8:
                    //Mostrar precio
                    break;
            }
        }
        
        
        
        
            
    }
    
    /**
     * Muestra el menu de opciones al usuario y devuelve la opcion elegida. 
     * En caso de seleccionar una opcion no valida, devuelve el valor 0
     * @return Opcion elegida por el usuario
     */
    
    static int menu(){
        int opcion;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Elige la opcion deseada:\n");       //Mostramos el menu
        System.out.println("1. Nuevo Vehiculo.");
        System.out.println("2. Ver Matrícula.");
        System.out.println("3. Ver Número de Kilómetros.");
        System.out.println("4. Actualizar Kilómetros.");
        System.out.println("5. Ver años de antigüedad.");
        System.out.println("6. Mostrar propietario.");
        System.out.println("7. Mostrar descripcion.");
        System.out.println("8. Mostrar precio.");
        System.out.println("9. Salir.");
        
        opcion = teclado.nextInt();
        
        if(opcion>9 || opcion<1){           //Verificamos que la opcion elegida se encuentre en la lista
            return(0); 
        }else{
            return(opcion); 
        }
        
       
}
    
    
    
}
