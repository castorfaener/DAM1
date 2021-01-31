
package PROG05_Ejerc1;

import PROG05_Ejerc1_util.Valida;
import java.util.Scanner;
import java.time.*;
import java.lang.Exception;

/**
 *
 * @author Francisco Alacreu Rosello
 */
public class Principal {

    public static Scanner teclado = new Scanner(System.in);
    public static boolean vehiculo = false;
    public static int diaMatr;
    public static int mesMatr;
    public static int anioMatr;
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int select=10;
        
        Vehiculo coche = new Vehiculo();
        
        
        while(select != 9){
            
           
            
            select = menu();
            switch(select){
                case 0:
                    System.out.println("La opcion elegida no es correcta. Intentalo de nuevo");
                    break;
                
                case 1:
                    //Nuevo Vehiculo
                    System.out.println("Vamos a introducir los datos del nuevo vehiculo.\n");
                    System.out.println("Introduce la matrícula: ");
                    coche.setMatricula(teclado.nextLine());
                    System.out.println("Introduce la marca: ");
                    coche.setMarca(teclado.nextLine());
                    System.out.println("Introduce el numero de kilómetros: ");
                    coche.setKm(teclado.nextInt());
                    teclado.nextLine();                     //consumimos el salto de linea
                    
                    do{
                        System.out.println("Introduce la fecha de matriculacion.\nDia (1-31):  ");
                        diaMatr = teclado.nextInt();
                        System.out.println("Mes (1-12): ");
                        mesMatr = teclado.nextInt();
                        System.out.println("Año: ");
                        anioMatr = teclado.nextInt();
                        
                        if(Valida.fechaMatr(anioMatr, mesMatr, diaMatr)==false){            //Verificamos que la fecha sea correcta
                            System.out.println("Error!. La fecha introducida es posterior a la fecha actual.\n");
                        }
                    }while(Valida.fechaMatr(anioMatr, mesMatr, diaMatr) != true);       //No salimos del bucle hasta que la fecha no sea correcta
                    coche.setFechaMatriculacion(diaMatr, mesMatr, anioMatr);            //guardamnos la fecha de matriculacion
                    
                    teclado.nextLine();                     //consumimos el salto de linea
                    
                    System.out.println("Introduce la descripcion: ");
                    coche.setDescripcion(teclado.nextLine());
                    System.out.println("Introduce el precio: ");
                    coche.setPrecio(teclado.nextDouble());
                    teclado.nextLine();                     //consumimos el salto de linea
                    System.out.println("Introduce el nombre del propietario: ");
                    coche.setPropietario(teclado.nextLine());
                    
                    System.out.println("Introduce el DNI del propietario: ");
                    String DNI = teclado.nextLine();
                    
                    if(Valida.validarNIF(DNI)){
                        coche.setDNI(DNI);
                    }else{
                        throw new Exception ("NIF invalido");
                    } 
               
                    vehiculo = true;
                    
                    break;
                    
                case 2:
                    //Ver matricula
                    if(Valida.existeVehiculo(vehiculo)){                                        //Verificamos que se haya creado un vehiculo
                        String matricula = coche.getMatricula();
                        System.out.println("La matricula del vehiculo es: " + matricula); 
                        break;
                    }else{
                        break;
                    }
                    
                    
                    
                    
                case 3:
                    //Ver numero de kilometros
                    if(Valida.existeVehiculo(vehiculo)){                                        //Verificamos que se haya creado un vehiculo
                        System.out.println("El numero de kilómetros del vehículo es: " + coche.getKm() + " km");
                        break;
                    }else{
                        break;
                    }
                    
                case 4:
                    //Actualizar kilometros
                    if(Valida.existeVehiculo(vehiculo)){                                        //Verificamos que se haya creado un vehiculo
                        System.out.println("Introduce el numero de kilometros actual:");
                        int kmNuevos = teclado.nextInt();
                        if(Valida.Km(coche.getKm(), kmNuevos)){                                 //Verificamos que el nuevo dato sea superior al dato ya introducido
                            coche.setKm(kmNuevos);
                            break;
                        }else{
                            break;
                        }
                        
                    }
                    
                case 5:
                    //Ver años de antiguedad
                    if(Valida.existeVehiculo(vehiculo)){
                        System.out.println("El vehiculo tiene un total de " + coche.getAnios() + " años");
                        break;
                    }else{
                        break;
                    }

                    
                case 6:
                    //Mostrar propietario
                    if(Valida.existeVehiculo(vehiculo)){
                        System.out.println("El propietario del vehiculo es " + coche.getPropietario() + " y su DNI es " + coche.getDNI());
                    }
                    break;
                    
                case 7:
                    //Mostrar descripcion
                    if(Valida.existeVehiculo(vehiculo)){
                        System.out.println(coche.getDescripcion() + ". Su matricula es: " + coche.getMatricula() + " y tiene un total de " + coche.getKm() + " km.");
                        break;
                    }else{
                        break;
                    }
                    
                    
                case 8 :
                    //Mostrar precio
                    if(Valida.existeVehiculo(vehiculo)){
                        System.out.println("El precio del vehículo es: " + coche.getPrecio() + " €");
                        break;
                    }else{
                        break;
                    }
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
    
   
    
    
    
}
