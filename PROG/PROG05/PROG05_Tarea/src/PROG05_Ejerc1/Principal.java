/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG05_Ejerc1;

import PROG05_Ejerc1_util.Valida;
import java.util.Scanner;

/**
 *
 * @author Francisco Alacreu Rosello
 */
public class Principal {

    public static Scanner teclado = new Scanner(System.in);
    public static boolean vehiculo = false;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int select=10;
        
        
        
        
        while(select != 9){
            
            Vehiculo coche;
            
            select = menu();
            switch(select){
                case 0:
                    System.out.println("La opcion elegida no es correcta. Intentalo de nuevo");
                    break;
                
                case 1:
                    //Nuevo Vehiculo
                    System.out.println("Vamos a introducir los datos del nuevo vehiculo.\n");
                    coche = new Vehiculo();
                    
                    break;
                    
                case 2:
                    //Ver matricula
                    Valida.existeVehiculo(vehiculo);
                    String matricula = coche.getMatricula();
                    System.out.println("La matricula del vehiculo es: " + matricula); 
                    
                    break;
                    
                case 3:
                    //Ver numero de kilometros
                    Valida.existeVehiculo(vehiculo);
                    break;
                    
                case 4:
                    //Actualizar kilometros
                    Valida.existeVehiculo(vehiculo);
                    System.out.println("Introduce el numero de kilometros actual:");
                    
                    break;
                    
                case 5:
                    //Ver años de antiguedad
                    Valida.existeVehiculo(vehiculo);
                    break;
                    
                case 6:
                    //Mostrar propietario
                    Valida.existeVehiculo(vehiculo);
                    break;
                    
                case 7:
                    //Mostrar descripcion
                    Valida.existeVehiculo(vehiculo);
                    break;
                    
                case 8 :
                    //Mostrar precio
                    Valida.existeVehiculo(vehiculo);
                    break;
            }
        }
        
        
        
        
            
    }
    
    /**
     * Muestra el menu de opciones al usuario y devuelve la opcion elegida. 
     * En caso de seleccionar una opcion no valida, devuelve el valor 0
     * @return Opcion elegida por el usuario
     */
    
    public static int menu(){
        int opcion;
        
        
        
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
        teclado.nextLine();                 //consumimos el salto de linea
        
        if(opcion>9 || opcion<1){           //Verificamos que la opcion elegida se encuentre en la lista
            return(0); 
        }else{
            return(opcion); 
        }
        
       
    }
    
    public static void nuevoVehiculo(){
        
        System.out.println("Vamos a introducir los datos del nuevo vehiculo.\n");
                    
                    System.out.println("Introduce la matrícula: ");
                    coche.setMatricula(teclado.nextLine());
                    System.out.println("Introduce la marca: ");
                    coche.setMarca(teclado.nextLine());
                    System.out.println("Introduce el numero de kilómetros: ");
                    coche.setKm(teclado.nextInt());
                    teclado.nextLine();                     //consumimos el salto de linea
                    System.out.println("Introduce la fecha de matriculacion: ");
                    coche.setFechaMatriculacion(teclado.nextLine());
                    System.out.println("Introduce la descripcion: ");
                    coche.setDescripcion(teclado.nextLine());
                    System.out.println("Introduce el precio: ");
                    coche.setPrecio(teclado.nextDouble());
                    teclado.nextLine();                     //consumimos el salto de linea
                    System.out.println("Introduce el nombre del propietario: ");
                    coche.setPropietario(teclado.nextLine());
                    System.out.println("Introduce el DNI del propietario: ");
                    coche.setDNI(teclado.nextLine());
                    vehiculo = true;
    }
    
    
}
