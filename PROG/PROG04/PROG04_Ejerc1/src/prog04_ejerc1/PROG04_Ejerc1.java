/*
 *  Implementar un programa que muestre la tabla de multiplicar de un número leido desde teclado utilizando al menos tres bucles diferentes. 
 *  El número leído desde teclado debe ser menor que 30. En caso contrario se mostrará un mensaje por pantalla y el programa finalizará.
 */
package prog04_ejerc1;

import java.util.Scanner;

public class PROG04_Ejerc1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);       //Creamos objeto teclado para introduccion de datos

        System.out.println("Introduce un numero del 1 al 30 para mostrar su tabla de multiplicar: ");
        int numero = teclado.nextInt();

        if (numero > 0 && numero < 30) {

            //multiplicarFor(numero);
            multiplicarWhile(numero);
            multiplicarDoWhile(numero);

        } else {
            System.out.println("El numero introducido no está en el rango correcto");

        }

    }
/*
    /**
    
    
    static void multiplicarFor(int num) {

        System.out.println("Utilizando el bucle for, la tabla de multiplicar del numero " + num + " es:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));

        }
    
    */
        
    static void multiplicarWhile(int num) {

        int i = 0;
        System.out.println("Utilizando el bucle while, la tabla de multiplicar del numero " + num + " es:");
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;

        }

    } 
    
    static void multiplicarDoWhile(int num){
        
        int i = 0;
        System.out.println("Utilizando el bucle do while, la tabla de multiplicar del numero " + num + " es:");
        do{
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
        while(i<=10);
            
        }
    }


