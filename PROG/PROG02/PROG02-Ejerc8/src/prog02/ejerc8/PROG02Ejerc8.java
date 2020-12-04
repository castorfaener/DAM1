//Ejercicio 8 de PROG02
package prog02.ejerc8;


public class PROG02Ejerc8 {
    enum PROG{Pepe,  Vanesa, Juan, Jose, Eva, Benito}
    enum ED{ Paco, Ana, Vicente, Susi}
    enum BD{Susana, Jorge, Pedro, Ines, Juan, Jessica, Luis, Edu}
    public static void main(String[] args) {
        int totalProg = PROG.values().length;                   //Calculamos el numero de alumnos por grupo
        int totalEd = ED.values().length;
        int totalBd = BD.values().length;
        int totalAlumnos = totalProg + totalEd + totalBd;       //Calculamos el total de alumnos
        float percentProg, percentEd, percentBd;
        
        percentProg = ((float)totalProg / (float)totalAlumnos )*100;        //Calculamos el perceentaje por cada grupo sobre el total de alumnos
        percentEd = ((float)totalEd / (float)totalAlumnos )*100;
        percentBd = ((float)totalBd / (float)totalAlumnos )*100;
        
        System.out.println("El numero total de alumnos es " + totalAlumnos +" separados en los siguientes módulos:\n");
        System.out.printf("Programacion: "+ totalProg);
        System.out.printf("\nEntornos de desarrollo: "+ totalEd);
        System.out.printf("\nBases de datos: "+ totalBd);
        
        System.out.printf("\nEl porcentaje de alumnos en Programación es del %.2f", percentProg);
       System.out.printf("\nEl porcentaje de alumnos en Entornos de desarrollo es del %.2f", percentEd);
       System.out.printf("\nEl porcentaje de alumnos en Bases de datos es del %.2f", percentBd);
        
        
        
        
        
    }
    
}
