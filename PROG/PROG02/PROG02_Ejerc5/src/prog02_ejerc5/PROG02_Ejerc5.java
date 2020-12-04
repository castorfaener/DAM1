//Ejercicio 5 de PROG02
package prog02_ejerc5;


public class PROG02_Ejerc5 {

  
    public static void main(String[] args) {
       int minutos;
       int horas;
       int dias;
       int segundos = 144642;                    //Variable para indicar el numero de segundos a calcular
       int segundosRestantes;
       
       dias = segundos / 86400;             //Dividimos los segundos totales entre el numero de segundos que tiene un dia
       horas = segundos / 3600;            //Dividimos los segundos totales entre el numero de segundos que tiene una hora 
       horas = horas % 24;                      //Asignamos el resto a la variable horas
       minutos = segundos / 60;             //Calculamos el numero de minutos
       minutos = minutos % 60;              //Asignamos el resto a la variable minutos
       segundosRestantes = segundos % 3600;             //Calculamos el numero de segundos
       segundosRestantes = segundosRestantes % 60;           //Asignamos el resto a la variable segundosRestantes
       
       
       System.out.println("Un total de " + segundos + " segundos equivalen a: \n" + dias + " dias\n" + horas + " horas\n" + minutos + " minutos\n" +segundosRestantes +" segundos\n");
       
    }
    
}
