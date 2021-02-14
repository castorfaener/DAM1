/*
 * Tarea PROG06
 * Concesionario
 * 
 */
package prog06_tarea;

import java.util.Scanner;
import Concesionarios.*;
import java.time.LocalDate;

/**
 *
 * @author Francisco Alacreu Rosello
 */
public class Principal {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Concesionario tienda = new Concesionario();
        
        int diaMatr;
        int mesMatr;
        int anioMatr;
        
        int select = 0;
        
        while(select!=5){
            
            select = menu();
            
            switch(select){
                case 1:
                    //Nuevo Vehiculo
                    System.out.println("Vamos a introducir los datos del nuevo vehiculo.\n");
                    System.out.println("Introduce la matrícula: ");
                    String matricula = teclado.nextLine();
                    System.out.println("Introduce la marca: ");
                    String marca = teclado.nextLine();
                    System.out.println("Introduce el numero de kilómetros: ");
                    int kms = teclado.nextInt();
                    teclado.nextLine();                     //consumimos el salto de linea
                    do{
                        System.out.println("Introduce la fecha de matriculacion.\nDia (1-31):  ");
                        diaMatr = teclado.nextInt();
                        System.out.println("Mes (1-12): ");
                        mesMatr = teclado.nextInt();
                        System.out.println("Año: ");
                        anioMatr = teclado.nextInt();
                        
                        if(validaFechaMatr(anioMatr, mesMatr, diaMatr)==false){            //Verificamos que la fecha sea correcta
                            System.out.println("Error!. La fecha introducida es posterior a la fecha actual.\n");
                        }
                    }while(validaFechaMatr(anioMatr, mesMatr, diaMatr) != true);       //No salimos del bucle hasta que la fecha no sea correcta 
                    
                    
                    teclado.nextLine();                     //consumimos el salto de linea
                    
                    System.out.println("Introduce la descripcion: ");
                    String descripcion = teclado.nextLine();
                    System.out.println("Introduce el precio: ");
                    double precio = teclado.nextDouble();
                    teclado.nextLine();                     //consumimos el salto de linea
                    
                    String propietario;
                    do{
                        System.out.println("Introduce el nombre del propietario: ");
                        propietario = teclado.nextLine();
                    }while(validaPropietario(propietario)!=true);
                    
                    
                    
                    System.out.println("Introduce el DNI del propietario: ");
                    String DNI = teclado.nextLine();
                    
                    int nuevoCoche = tienda.insertarVehiculo(matricula, marca, kms, diaMatr, mesMatr, anioMatr, descripcion, precio, propietario, DNI);
                switch (nuevoCoche) {
                    case -1:
                        System.out.println("El concesionario está lleno. No se pueden registrar más coches");
                        break;
                    case -2:
                        System.out.println("La matricula introducida ya existe.");
                        break;
                    default:
                        System.out.println("El nuevo coche se ha registrado correctamente");
                        break;
                }
                    break;

                
                case 2:
                    //Listar Vehiculos
                    tienda.listaVehiculos();
                    break;
                    
                case 3:
                    //Buscar Vehiculo
                    break;
                    
                case 4:
                    //Modificar kms Vehiculo
                    System.out.println("Introduce la matricula del vehiculo para actualizar los kms");
                    String mat=teclado.nextLine();
                    System.out.println("Introduce los kilometros");
                    int km=teclado.nextInt();
                    teclado.nextLine();             //consumimos el salto de linea
                    if(tienda.actualizaKms(mat, km)){
                        System.out.println("Dato actualizado correctamente");
                        break;
                    }else{
                        System.out.println("La matricula introducida no coincide con ningun vehículo");
                    }
                    break;
                    
                case -1:
                    //Seleccion no valida
                    System.out.println("La opción elegida no es válida. Inténtalo de nuevo.");
                    break;
            }
            
            
            
        }
        
        
    }
    
    /**
     * Muestra las opciones del menu
     * @return opcion elegida o -1 en caso de error
     */
    public static int menu(){
        
        System.out.println("------------------------------");
        System.out.println("-- Gestion de concesionario --");
        System.out.println("------------------------------\n");
        System.out.println("Elige una opción: \n");
        System.out.println("1. Nuevo Vehiculo");
        System.out.println("2. Listar Vehiculos");
        System.out.println("3. Buscar Vehiculo");
        System.out.println("4. Modificar kms Vehiculo");
        System.out.println("5. Salir");
        
        int sel = teclado.nextInt();
        teclado.nextLine();             //consumimos el salto de linea
        
        if(sel>5 || sel < 1){
            return -1;                  //si la opcion no es correcta devuelve -1
        }else{
            return sel;
        }
        
    }
    
    /**
     * Verifica que la fecha que pasamos por parametros es anterior a la fecha actual del sistema
     * @param anio Año de matriculacion
     * @param mes Mes de matriculacion
     * @param dia Día de matriculacion
     * @return Devuelve si la fecha de matriculacion es anterior a la fecha actual. Boolean
     */
    public static boolean validaFechaMatr(int anio, int mes, int dia){
        
        boolean valida = LocalDate.of(anio, mes, dia).isBefore(LocalDate.now());
        return valida;
    }
    
    /**
     * Verifica que el numero de kilometros introducido es mayor al actual
     * @param km kilometros actuales del vehiculo
     * @param kmNuevos dato actualizado de los nuevos kilometros del vehiculo
     * @return true si los km nuevos son mayores que los actuales
     */
    public static boolean validaKm(int km, int kmNuevos){
        if(kmNuevos <= km){
            System.out.println("Error! El numero de km introducido es menor o igual que los actuales\n");
            return false;
        }else{
            return true;
        }
    }
    /**
     * comprueba que la cadena pasada por parametro contienen tres palabras, es inferior a 40 caracteres y no contienen números
     * @param cadena String a comprobar
     * @return true si es correcto
     */
    public static boolean validaPropietario(String cadena){
        int espacios=0;
        if(cadena.length()>40){                                                                 //Comprobamos la longitud de la cadena
            System.out.println("El nombre introducido tiene más de 40 carácteres");
            return false;
        }
        for(int i=0;i<cadena.length();i++){
            
            if(cadena.charAt(i)==' '){                              //Comprobamos que existan dos espacios
                espacios++;
            }
        }
        if(espacios!=2){
            System.out.println("No has introducido el nombre y los dos apellidos correctamente");
            return false;
        }
        
        //Verificamos que no hayan numeros en la cadena
        if(cadena.contains("0")||cadena.contains("1")||cadena.contains("2")||cadena.contains("3")||cadena.contains("4")||cadena.contains("5")||cadena.contains("6")||cadena.contains("7")||cadena.contains("8")||cadena.contains("9")){
            System.out.println("El nombre no puede contener numeros");
            return false;
        }
        
        return true;
    }
    
    public static boolean validaMatricula(String matricula){
        
    }
    
}
