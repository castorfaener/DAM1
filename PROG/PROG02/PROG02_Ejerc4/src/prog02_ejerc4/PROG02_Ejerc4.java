//Ejercicio 4 de PROG02
package prog02_ejerc4;

public class PROG02_Ejerc4 {

    public static void main(String[] args) {
        boolean mayorEdad;
        short edad = 32;                //edad utilizada para realizar el calculo
        final short ADULTO = 18;
        
       mayorEdad =  (ADULTO <= edad) ?  true : false;       //Comparamos con la edad de referencia (18)
        
        System.out.println("¿Es mayor de edad? "+ mayorEdad);
        
        
    }
    
}
