/*
 * Un número es primo si solo tiene dos divisores: el 1 y el propio número. 
 * Implementa un programa Java que pida por teclado 5 números. Para cada uno de ellos: 
 * - Comprueba si es negativo. En caso afirmativo, muestra el mensaje por pantalla "El número es negativo".
 * - Si es positivo, deberá mostrar por pantalla si es primo o no.
 * - Procesados los 5 números, el programa finaliza.
 */
package prog04_ejerc2;


import java.util.Scanner;

/**
 * Esta clase realiza el cálculo de 5 numeros para indicar si son primos.
 * En caso de introducir un numero negativo lo indicamos al usuario
 * @author Francisco Alacreu Rosello
 */
public class PROG04_Ejerc2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int contador = 0;

        while (contador <= 5) {
            System.out.println("Introduce un numero para saber si es primo:");
            
                numero = teclado.nextInt();                     //Guardamos el numero introducido por teclado
                if (numero > 0) {
                System.out.println("El número introducido es primo?: " + esPrimo(numero) + "\n");           //Verificamos que sea positivo para realizar el cálculo
            } else {
                System.out.println("El número es negativo");                    //Si es negativo lo indicamos al usuario
            }
            contador++;                     //Incrementamos el contador hasta que llegue a 5
        }    

    }

    /**
     * Este metodo calcula si el numero que pasamos como parametro es primo.
     *
     * @param num El parametro num es el numero primo a calcular
     * @return Si es primo o no
     */
    public static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
