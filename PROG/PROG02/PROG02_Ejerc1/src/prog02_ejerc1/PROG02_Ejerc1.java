// Ejercicio 1 de PROG02
package prog02_ejerc1;

public class PROG02_Ejerc1 {

    public static void main(String[] args) {
        final short valorNoModificable = 5000;
        boolean carnet = true;
        String mesAnyo = "11 Noviembre";
        String nombreApellidos = "Paco Alacreu";
        char sexo = 'M';
        //long milisegundosTranscurridos = 1606694400000; EL numero de milisegundos es muy grande para una variable long
        double saldoCuenta = 12340.5;
        int distanciaJupiter = 600000000;
        
        System.out.printf("1. El valor no modificable es: %d", valorNoModificable);
        System.out.printf("\n2. Tiene carnet: %b", carnet);
        System.out.printf("\n3. El numero y mes del año es: %s", mesAnyo);
        System.out.printf("\n4. El nombre y apellidos es: %s", nombreApellidos);
        System.out.printf("\n5. El sexo es: %c", sexo);
        System.out.printf("\n7. El saldo de la cuenta bancaria es: %f", saldoCuenta);
        System.out.printf("\n8. La distancia entre la tierra y jupiter en km es: %d", distanciaJupiter);
        
        
        
    }
    
}
