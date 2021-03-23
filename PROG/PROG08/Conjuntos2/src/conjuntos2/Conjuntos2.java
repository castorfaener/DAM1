/*
 * 
 */
package conjuntos2;

import java.util.HashSet;
import java.util.Scanner;
 
public class Conjuntos2 {

   
    public static void main(String[] args) {
        HashSet<Integer> conjunto=new HashSet<Integer>();
        Scanner teclado=new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            System.out.println("Introduce numero:");
            conjunto.add(teclado.nextInt());
        }
        
        for(Integer i: conjunto){
            System.out.println("Elemento almacenado:" + i);
        }
        
    }
    
}
