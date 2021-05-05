/*
 * Clase ticket para la gestion de articulos
 */

package cidead_moda;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Francisco Alacreu
 */
public class Ticket {
   
    static ArrayList<Articulo> ticketCompra=new ArrayList<Articulo>();
    
    /**
     * metodo para la busqueda de articulos
     * @param codigo codigo del articulo a buscar
     * 
     */
    public static void buscarArticulo(int codigo){
        for(Articulo v: Ticket.ticketCompra){
                        if(v.getCodigo() == codigo){
                            System.out.println("Codigo: " + codigo + "\nDescripcion: "+ v.getDescripcion() + "\nGenero: "+ v.getGenero() + "\nTalla: "+ v.getTalla() + "\nComposicion: "+ v.getComposicion() + "\nPrecio: " + v.getPrecio());
                            
                        }
        }
    }
    /**
     * Metodo para la insercion de nuevos articulos en el ticket
     * @param codigo
     * @param descripcion
     * @param genero
     * @param talla
     * @param composicion
     * @param precio 
     */
    public static void insertarArticulo(int codigo, String descripcion, String genero, String talla, String composicion, double precio){
        ticketCompra.add(new Articulo(codigo, descripcion, genero, talla, composicion, precio));                //introducimos los datos del nuevo articulo
    }
    
    
    /**
     * Metodo para mostrar el listado de articulos ordenados por codigo
     */
    public static void mostrarListaArticulos(){
        for(Articulo v: ticketCompra){
                        System.out.print(v.getCodigo());
                        System.out.print("       ");
                        System.out.print(v.getDescripcion());
                        System.out.print("       ");
                        System.out.print(v.getGenero());
                        System.out.print("       ");
                        System.out.print(v.getTalla());
                        System.out.print("       ");
                        System.out.print(v.getComposicion());
                        System.out.print("       ");
                        System.out.println(v.getPrecio());
                    }
        
    }
    
    /**
     * Metodo para actualizar articulos con los datos que se pasan como parametros
     * @param codigo
     * @param descripcion
     * @param genero
     * @param talla
     * @param composicion
     * @param precio
     */
    public static void actualizarUnArticulo(int codigo, String descripcion, String genero, String talla, String composicion, double precio){
        Iterator <Articulo> it = ticketCompra.iterator();
                    
                    while(it.hasNext()){
                        if(it.next().getCodigo()==codigo){
                            it.next().setDescripcion(descripcion);
                            it.next().setGenero(genero);
                            it.next().setTalla(talla);
                            it.next().setComposicion(composicion);
                            it.next().setPrecio(precio);
                        }
                    }
    }
    
    /**
     * Metodo para eliminar articulos
     * @param codigo codigo del articulo a eliminar 
     */
    public static void eliminarUnArticulo(int codigo){
       Iterator <Articulo> it = ticketCompra.iterator();
                    
                    while(it.hasNext()){
                        if(it.next().getCodigo()==codigo){
                            it.remove();
                        }
                    }
    }
    
    
}





