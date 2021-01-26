

package PROG05_Ejerc1_util;

/**
 * Clase para las verificaciones de datos
 * 
 * @author Francisco Alacreu Rosello
 */
public class Valida {

    /**
     * Verifica si se ha instanciado un vehiculo para mostrar sus datos
     * @param vehiculo Parametro que indica si existe vehiculo
     */
    public static void existeVehiculo(boolean vehiculo){
        if(vehiculo==false){
            System.out.println("No existe ningun vehiculo para mostrar datos");
            System.exit(0);
            
            
        }
    }
}
