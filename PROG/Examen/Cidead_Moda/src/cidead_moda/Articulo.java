/*
 * Clase para los articulos
 */

package cidead_moda;

/**
 * 
 * @author Francisco Alacreu
 */
public class Articulo {
    private int codigo;
    private String descripcion;
    private String genero;
    private String talla;
    private String composicion;
    private double precio;
    
    /**
     * constructor de clase
     * @param codigo
     * @param descripcion
     * @param genero
     * @param talla
     * @param composicion
     * @param precio 
     */
    public Articulo(int codigo, String descripcion, String genero, String talla, String composicion, double precio){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.genero=genero;
        this.talla=talla;
        this.composicion=composicion;
        this.precio=precio;
    }
    
    
    
    /**
     * setter del atributo codigo
     * @param codigo codigo a introducir
     */
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    /**
     * getter del atributo codigo
     * @return codigo del articulo
     */
    public int getCodigo(){
        return this.codigo;
    }
    
    /**
     * setter del atributo descripcion
     * @param descripcion descripcion a introducir
     */
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    /**
     * getter del atributo descripcion
     * @return descripcion del articulo
     */
    public String getDescripcion(){
        return this.descripcion;
    }
    
    /**
     * setter del atributo genero
     * @param genero genero a introducir
     */
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    /**
     * getter del atributo genero
     * @return genero del articulo
     */
    public String getGenero(){
        return this.genero;
    }
    
    /**
     * setter del atributo talla
     * @param talla talla a introducir
     */
    public void setTalla(String talla){
        this.talla=talla;
    }
    
    /**
     * getter del atributo talla
     * @return talla del articulo
     */
    public String getTalla(){
        return this.talla;
    }
    
    /**
     * setter del atributo composicion
     * @param composicion composicion a introducir
     */
    public void setComposicion(String composicion){
        this.composicion=composicion;
    }
    
    /**
     * getter del atributo composicion
     * @return composicion del articulo
     */
    public String getComposicion(){
        return this.composicion;
    }
    
    /**
     * setter del atributo precio
     * @param precio precio a introducir
     */
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    /**
     * getter del atributo precio
     * @return precio del articulo
     */
    public double getPrecio(){
        return this.precio;
    }
    
}
