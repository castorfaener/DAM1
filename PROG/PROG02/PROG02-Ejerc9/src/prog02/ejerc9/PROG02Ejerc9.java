//Ejercicio 9 de PROG02
package prog02.ejerc9;


public class PROG02Ejerc9 {

    public static void main(String[] args) {
        
        int anyo = 2000;        //Año utilizado para realizar el calculo
        int resultado4, resultado100, resultado400;
        
        resultado4 = anyo % 4;              //Realizacmos los calculos
        resultado400 = anyo % 400;
        resultado100 = anyo % 100;
        
        if (resultado4==0 && (resultado100!=0 || resultado400==0)){     //Comparamos los resultados
            System.out.println("El año " + anyo + " SI es bisiesto");
        }else{
            System.out.println("El año " + anyo + " NO es bisiesto");
        }
    }
    
    
}
