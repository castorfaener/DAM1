

package PROG05_Ejerc1_util;

import java.time.*;

/**
 * Clase para las verificaciones de datos
 * 
 * @author Francisco Alacreu Rosello
 */
public class Valida {

    /**
     * Verifica si se ha instanciado un vehiculo para mostrar sus datos
     * @param vehiculo Parametro que indica si existe vehiculo
     * @return true si no existe un vehiculo creado
     */
    public static boolean existeVehiculo(boolean vehiculo){
        if(vehiculo==false){
            System.out.println("No existe ningun vehiculo para mostrar datos\n");
            return false;    
        }else{
            return true;
        }
    }
    
    /**
     * Verifica que el numero de kilometros introducido es mayor al actual
     * @param km kilometros actuales del vehiculo
     * @param kmNuevos dato actualizado de los nuevos kilometros del vehiculo
     * @return true si los km nuevos son mayores que los actuales
     */
    public static boolean Km(int km, int kmNuevos){
        if(kmNuevos <= km){
            System.out.println("Error! El numero de km introducido es menor o igual que los actuales\n");
            return false;
        }else{
            return true;
        }
    }
    
    
    private int numDNI;
    private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
    /**
     * Calcula la letra correspondiente al DNI
     * @param dni numero de DNI
     * @return Letra que corresponde al NIF
     */
    private static char calcularLetraNIF(int dni) {
        char letra;
        // Cálculo de la letra NIF
        letra = LETRAS_DNI.charAt(dni % 23);
        // Devolución de la letra NIF
        return letra;
    }
    /**
    * Extrae la letra del NIF pasado por parametro
    * @param nif NIF
    * @return letra en mayuscula del NIF
    */
    private static char extraerLetraNIF(String nif) {
        char letra = nif.charAt(nif.length() - 1);
        //return letra;
        return Character.toUpperCase(letra); //Devolvemos su equivalente en mayúscula para poder comparar con las letras de la cadena LETRAS_DNI
    }
    /**
     * Extrae el numero del NIF pasado por parametro
     * @param nif NIF
     * @return numero del NIF
     */
    private static int extraerNumeroNIF(String nif) {
        int numero = Integer.parseInt(nif.substring(0, nif.length() - 1));
        return numero;
    }
    /**
     * Comprueba que el nif sea correcto
     * @param nif NIF
     * @return Si es valido o no. Boolean
     * @throws PROG05_Ejerc1_util.Valida.Nif_Erroneo 
     */
    public static boolean validarNIF(String nif) throws Nif_Erroneo {
        boolean valido = true;   // Suponemos el NIF válido mientras no se encuentre algún fallo
        char letra_calculada;
        char letra_leida;
        int dni_leido;

        if (nif == null) {  // El parámetro debe ser un objeto no vacío
            valido = false;
            throw new Nif_Erroneo("El NIF no es correcto");
                   

        } else if (nif.length() < 8 || nif.length() > 9) {    // La cadena debe estar entre 8(7+1) y 9(8+1) caracteres
            valido = false;
            throw new Nif_Erroneo("El NIF no es correcto");

        } else {
            letra_leida = extraerLetraNIF(nif);    // Extraemos la letra de NIF (letra)
            dni_leido = extraerNumeroNIF(nif);  // Extraemos el número de DNI (int)
            letra_calculada = calcularLetraNIF(dni_leido);  // Calculamos la letra de NIF a partir del número extraído
            if (letra_leida != letra_calculada) {   // Comparamos la letra extraída con la calculada
                valido = false;
                throw new Nif_Erroneo("El NIF no es correcto");
                
            }
        }
        return valido;
    }
    
    
    /**
     * Verifica que la fecha que pasamos por parametros es anterior a la fecha actual del sistema
     * @param anio Año de matriculacion
     * @param mes Mes de matriculacion
     * @param dia Día de matriculacion
     * @return Devuelve si la fecha de matriculacion es anterior a la fecha actual. Boolean
     */
    public static boolean fechaMatr(int anio, int mes, int dia){
        
        boolean valida = LocalDate.of(anio, mes, dia).isBefore(LocalDate.now());
        return valida;
    }
    /**
     * Excepcion para la validacion del NIF
     */
    static class Nif_Erroneo extends Exception{
        
        public Nif_Erroneo(){
        }
        
        public Nif_Erroneo(String msj_error){
            
            super(msj_error);
        }
    
    }
}
