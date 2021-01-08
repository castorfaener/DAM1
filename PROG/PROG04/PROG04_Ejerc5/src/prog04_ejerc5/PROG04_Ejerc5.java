/*
 * Cuando dividimos un número entre 0 se genera un valor indeterminado. En cualquier lenguaje de programación este tipo de operaciones genera un error de ejecución que debe ser 
 * controlado desde el código para evitar malas experiencias al usuario. En Java, cuando se produce esta operación se genera la excepción ArithmeticException.
 * Queremos implementar un programa Java que calcule la división de dos números solicitados por teclado (dividendo y divisor).
 * El programa solicitará números indefinidamente hasta que los dos números solicitados sean -1. Se debe controlar mediante excepciones que el divisor no sea 0.
 * En caso de serlo, se mostrará un mensaje por pantalla. También habrá que mostrar por pantalla el número de divisiones calculadas. Utiliza número enteros para las variables.
 */
package prog04_ejerc5;

import java.util.Scanner;

/**
 *
 * @author Francisco Alacreu Rosello
 */
public class PROG04_Ejerc5 {

    static Scanner teclado = new Scanner(System.in);
    
    static int dividendo;
    static int divisor;
    
    
    public static void main(String[] args) {
        
        System.out.println("Introduce el valor para el dividendo: ");
        dividendo = teclado.nextInt();
        System.out.println("Introduce el valor del divisor");
        divisor = teclado.nextInt();
        
        System.out.println("El resultado de la división es: " + divide(dividendo,divisor));
        
    }
    
    static double divide(int a, int b){
        return (a/b);
    }
    
}
