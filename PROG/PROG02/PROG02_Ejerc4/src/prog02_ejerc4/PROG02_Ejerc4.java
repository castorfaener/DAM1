
package prog02_ejerc4;

public class PROG02_Ejerc4 {

    public static void main(String[] args) {
        boolean mayorEdad = false;
        short edad = 32;
        final short ADULTO = 18;
        
       mayorEdad =  (ADULTO <= edad) ?  true : false;
        
        System.out.println("¿Es mayor de edad? "+ mayorEdad);
        
        
    }
    
}
