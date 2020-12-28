/*
 * Deseamos implementar un juego en Java que permita al usuario adivinar un número oculto (que será aleatorio).  El funcionamiento será el siguiente:
 *
 *   El programa mostrará un pequeño menú en pantalla con las siguientes opciones (1. Configurar, 2. Jugar, 3. Salir).
 *       Si el usuario selecciona el la primera opción, se le solicitará por teclado el número de intentos permitidos (numInt) y el número máximo  (numMax) generado.
 *       Si el usuario selecciona la opción 2,  el programa generará un número aleatorio entre 0 y numMax que será el número a adivinar (numOculto). A partir de este momento, se le solicitarán al usuario números hasta adivinar el número oculto.
 *           Si el usuario adivina el número, se mostrará un mensaje "Has ganado!. Has necesitado X intentos".
 *           Si se consume el número de intentos sin adivinar el número, se mostrará el mensaje "Perdiste!. Intentos consumidos".
 *           En cada intento, si el usuario no adivina el número se le proporcionará una pista, por ejemplo, "El número oculto es menor".
 *           En ambos casos, la siguiente acción será mostrar el menú.
 *           Si el usuario selecciona Jugar sin configurar previamente el número de intentos y el número máximo generado, se tomarán como valores por defecto: numInt=5 y numMax=10.
 *       Si el usuario pulsa la opción 3, el programa finaliza.
 *
 */
package prog04_ejerc4;
import java.util.Scanner;


/**
 *
 * @author Francisco Alacreu Rosello
 */
public class PROG04_Ejerc4 {

    public static Scanner teclado = new Scanner(System.in);
    
    static int numInt = 5; // intentos permitidos
    static int numMax = 10; // numero máximo generado
    
    public static void main(String[] args) {
        
       
        
        do{
        switch(menu()){
            case 0:
                System.out.println("La opcion elegida no es correcta. Finalizando programa");
                System.exit(0);
                break;
            
            case 1: 
                System.out.println("****Configuracion****");
                configurar();
                break;
            
            case 2: 
                System.out.println("****A jugar!!****");
                juego();
                break;    
            
            case 3: 
                System.out.println("Salimos del programa");
                System.exit(0);
                break;    
            }
        }while(menu()!=0);
        
        
    }
    
    /**
     *  Muestra por pantalla un menu de tres opciones a elegir por el usuario
     * 
     * @return opcion elegida desde el menu. 
     */
    public static int menu(){
        int opcion;
        System.out.println("****Juego del numero oculto****\nElige una opcion");
        System.out.println("1. Configurar\n2. Jugar\n3. Salir");
        
        opcion = teclado.nextInt();
        
        if(opcion>3 || opcion<1){
            return 0;                   //En caso de no ser una opcion valida devuelve 0.
        }
        return opcion;
    }
    
    /**
     *  Solicita por teclado el numero de intentos permitidos y el máximo valor del numero generado
     */
    public static void configurar(){
        
        System.out.println("introduce el numero de intentos permitidos: ");
        numInt = teclado.nextInt();
        System.out.println("introduce el valor máximo del numero generado: ");
        numMax = teclado.nextInt();
        
    }
    
    /**
     *  No funciona
     */
    public static void juego(){
        int numOculto = (int)Math.floor(Math.random()*numMax+1);
        int numero;
        int intentos = 0;
        
        System.out.println("Tienes que adivinar un numero entre 0 y "+ numMax + ".\nTienes " + numInt + " intentos. Buena suerte!");
        System.out.println("Introduce un numero: ");
        numero = teclado.nextInt();
        intentos++;
        
        while(numero != numOculto){
            if(numero<numOculto){
                System.out.println("El numero introducido es menor. Intentalo de nuevo");
            }else{
                System.out.println("El numero introducido es mayor. Intentalo de nuevo");
            }
            System.out.println("Introduce un numero: ");
            numero = teclado.nextInt();
            intentos++;
        }
        
        System.out.println("Has ganado!. Has necesitado " + intentos + " intentos");
    }
}
