/*
 * Agrupacion de metodos para la validacion de los diferentes datos
 */

package Concesionarios;

import java.time.LocalDate;
import java.util.regex.*;

/**
 * 
 * @author Francisco Alacreu Rosello
 */
public class Valida {

    /**
     *Verifica que la matricula que se pasa por parametro cumpla el patrón NNNNLLL N-> numeros L-> Letras mayúsculas y sin vocales
     * @param matricula el valor de matrícula
     * @return si cumple el patrón
     */
    public static boolean Matricula(String matricula) {
        Pattern pat = Pattern.compile("\\d{4}[B-DF-HJ-NP-TW-Z]{3}");
        Matcher mat = pat.matcher(matricula);
        
        return mat.matches();
    }
    /**
     * Verifica que el DNI que se pasa por parámetro cumpla el patrón L(opcional)NNNNNNNNL
     * @param dni el valor del DNI
     * @return si cumple el patrón
     */
    public static boolean DNI(String dni) {
        Pattern pat = Pattern.compile("[A-Z]?\\d{8}[A-Z]");
        Matcher mat = pat.matcher(dni);
        
        return mat.matches();
    }
    

    /**
     * Verifica que el nombre del propietario contenga nombre y dos apellidos
     * @param cadena String a comprobar
     * @return true si es correcto
     */
    public static boolean Propietario(String cadena) {
        int espacios = 0;
        if (cadena.length() > 40) {
            //Comprobamos la longitud de la cadena
            System.out.println("El nombre introducido tiene m\u00e1s de 40 car\u00e1cteres");
            return false;
        }
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                //Comprobamos que existan dos espacios
                espacios++;
            }
        }
        if (espacios != 2) {
            System.out.println("No has introducido el nombre y los dos apellidos correctamente");
            return false;
        }
        //Verificamos que no hayan numeros en la cadena
        if (cadena.contains("0") || cadena.contains("1") || cadena.contains("2") || cadena.contains("3") || cadena.contains("4") || cadena.contains("5") || cadena.contains("6") || cadena.contains("7") || cadena.contains("8") || cadena.contains("9")) {
            System.out.println("El nombre no puede contener numeros");
            return false;
        }
        return true;
    }

    /**
     * Verifica que el numero de km introducido es mayor que el numero actual
     * @param km kilometros actuales del vehiculo
     * @param kmNuevos dato actualizado de los nuevos kilometros del vehiculo
     * @return true si los km nuevos son mayores que los actuales
     */
    public static boolean Km(int km, int kmNuevos) {
        if (kmNuevos <= km) {
            System.out.println("Error! El numero de km introducido es menor o igual que los actuales\n");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Comprueba i la fecha de matriculacion es anterior a la fecha actual
     * @param anio Año de matriculacion
     * @param mes Mes de matriculacion
     * @param dia Día de matriculacion
     * @return Devuelve si la fecha de matriculacion es anterior a la fecha actual. Boolean
     */
    public static boolean FechaMatr(int anio, int mes, int dia) {
        boolean valida = LocalDate.of(anio, mes, dia).isBefore(LocalDate.now());
        return valida;
    }
    
}
