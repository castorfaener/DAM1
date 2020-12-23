/*
 * El Mínimo Común Múltiplo (MCM) de un conjunto de dos números es el número positivo más pequeño que es múltiplo de los dos números.
 * Es posible calcular el MCM de tres o más números. Por ejemplo, el MCM (2,3) es 6. El 6 es el múltiplo mas pequeño de 2 y de 3.
 * Implementa un programa Java que pida dos números por teclado, compruebe que son positivos y calcule su MCM.
 * En caso de no ser ambos números positivos, el programa mostrará un mensaje por pantalla y finalizará.
 */
package prog04_ejerc3;

import java.util.Scanner;
/**
 * La clase calcula el Mínimo Comun Múltiplo de dos numeros introducidos por teclado. En caso de que uno de los dos números sea negativo
 * lo indica al usuario y finaliza el programa.
 * 
 * @author Francisco Alacreu Rosello
 */
public class PROG04_Ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero1, numero2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        numero1 = teclado.nextInt();                                //Guardamos el primer numero introducido por teclado y verificamos que sea positivo
        if(numero1 < 0){
            System.out.println("Has introducido un numero negativo. Finalizamos el programa!");
            System.exit(0);
        }
        
        System.out.println("Ahora el segundo numero: ");
        numero2 = teclado.nextInt();                                //Guardamos el segundo numero introducido por teclado y verificamos que sea positivo
        if(numero2 < 0){
            System.out.println("Has introducido un numero negativo. Finalizamos el programa!");             
            System.exit(0);
        }
        
        System.out.println("El Mínimo Común Múltiplo (MCM) de " + numero1 + " y " + numero2 + " es: " + mcm(numero1, numero2));
        
       
    }
    /**
     * Método que cálcula el Mínimo Común Múltiplo de dos numeros
     * 
     * @param n1 Define el primer numero
     * @param n2 Define el segundo numero
     * @return El cálculo del MCM resultante
     */
    
    
    public static int mcm(int n1, int n2){
        
        int mcmNum = (n1 > n2) ? n1 : n2;           //
        
        while((mcmNum % n1 != 0)&&(mcmNum % n2 != 0))
        
        if(mcmNum % n1 != 0){
            mcmNum++;
        }else if(mcmNum % n2 != 0){
             mcmNum++;
        }
        else{
            
            break;
        }
        return mcmNum;
        
            
        
    }
    
     
}
