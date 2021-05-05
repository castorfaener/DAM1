/*
 * Clase para la realizacion de validaciones
 */

package cidead_moda;

/**
 * 
 * @author Francisco Alacreu
 */
public class Validar {
    public enum Tallas{
        XS, S, M, L, XL, XXL
    }
    
    public enum Generos {
        M, F, U
    }
    /**
     * metodo para verificar que las tallas sean las correctas
     * @param talla valor a comparar entre los datos validos
     * @return 
     */
    public static boolean comprobarTalla(String talla){
        if(talla.equals(Tallas.values())){
            return true;
        }
        else{
            return false;    
        }
        
    }
    /**
     * metodo para verificar que los gfeneros sean los correctos
     * @param genero valor a comparar entre los datos validos
     * @return 
     */
    public static boolean comprobarGenero(String genero){
        if(genero.equals(Generos.values())){
            return true;
        }
        else{
            return false;    
        }
        
    }
    
}
