/*
 
 */
package com.prog03.Principal;
import com.prog03.figuras.Rectangulo;


public class Principal {

    
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo();                //Instanciamos un objeto rect1 sin atributos
        Rectangulo rect2 = new Rectangulo(2,3);             //Instanciamos un objeto rect2 con base 2 y altura 3
        
        rect1.setAltura(4);         //definimos altura de rect1 a 4
        rect1.setBase(4);               //definimos base de rect1 a 4
        
        System.out.println(rect1);
        System.out.println("¿El objeto es cuadrado?: " + rect1.isCuadrado());
        System.out.println("Su base es " + rect1.getBase() + " y su altura es " + rect1.getAltura() + "\n\n");
        
        System.out.println(rect2);
        System.out.println("¿El objeto es cuadrado?: " + rect2.isCuadrado());
        System.out.println("Su base es " + rect2.getBase() + " y su altura es " + rect2.getAltura() + "\n\n");
        
        
        
    }
    
}
