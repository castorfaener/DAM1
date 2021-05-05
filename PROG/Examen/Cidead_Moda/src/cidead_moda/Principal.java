/*
 * Clase principal del programa
 */
package cidead_moda;

import java.util.*;

/**
 *
 * @author Francisco Alacreu
 */
public class Principal {

    static Scanner teclado = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int seleccionMenu=0;
        
        int codigo;
        String descripcion;
        String genero;
        String talla;
        String composicion;
        double precio;
        
        boolean verTalla=false;
        boolean verGenero=false;
        boolean finded;
        
        
        
        
        while(seleccionMenu!=6){
            
            seleccionMenu = menu();
        
            switch(seleccionMenu){
                case 1:
                    //Nuevo Articulo
                    System.out.println("Vamos a introducir los datos del nuevo articulo");
                    
                    do{
                        try{
                            System.out.println("Introduce el codigo: ");
                            codigo = teclado.nextInt();
                            
                          
                        }catch(InputMismatchException e){
                            System.out.println("El dato introducido tiene que ser numérico");
                            codigo=-1;
                            teclado.nextLine();                     //consumimos el salto de linea
                        }
                    }while(codigo==-1);
                    
                    teclado.nextLine(); 
                    System.out.println("Introduce la descripcion:");
                    descripcion=teclado.nextLine();
                    do{
                        System.out.println("Introduce el genero:");
                        genero=teclado.nextLine();
                        if(Validar.comprobarGenero(genero)){
                            verGenero=true;
                        }else{
                            System.out.println("El tipo de genero introducido no es correcto. Los valores admitidos son:\nM, H, U\n");
                        
                        }
                    }while(verGenero=false);
                    
                    
                    
                    do{
                        System.out.println("Introduce la talla:");
                        talla=teclado.nextLine();
                        if(Validar.comprobarTalla(talla)){
                            verTalla=true;
                        }else{
                            System.out.println("La talla introducida no es correcta. Los valores admitidos son:\nXS, S, M, L, XL, XXL\n");
                        
                        }
                    }while(verTalla=false);
                    
                    System.out.println("Introduce la composicion:");
                    composicion=teclado.nextLine();
                    do{
                        try{
                            System.out.println("Introduce el precio: ");
                            precio = teclado.nextInt();
                            
                          
                        }catch(InputMismatchException e){
                            System.out.println("El dato introducido tiene que ser numérico");
                            precio=-1;
                            teclado.nextLine();                     //consumimos el salto de linea
                        }
                    }while(precio==-1);
                    
                    Ticket.insertarArticulo(codigo, descripcion, genero, talla, composicion, precio);
                    break;
                    
                case 2:
                    //Listar Articulos
                    System.out.println("-- Listado de Articulos --\n");
                    Ticket.mostrarListaArticulos();
                    
                    
                    
                    break;
                    
                case 3:
                    //Buscar un articulo
                    System.out.println("Introduce lel codigo del articulo a buscar");
                    codigo = teclado.nextInt();
                    
                    Ticket.buscarArticulo(codigo);

                    break;
                    
                case 4:
                    //Modificar Datos de un Articulo
                    System.out.println("Vamos a introducir los datos del articulo a modificar");
                    
                    do{
                        try{
                            System.out.println("Introduce el codigo: ");
                            codigo = teclado.nextInt();
                            
                          
                        }catch(InputMismatchException e){
                            System.out.println("El dato introducido tiene que ser numérico");
                            codigo=-1;
                            teclado.nextLine();                     //consumimos el salto de linea
                        }
                    }while(codigo==-1);
                    
                    teclado.nextLine(); 
                    System.out.println("Introduce la descripcion:");
                    descripcion=teclado.nextLine();
                    do{
                        System.out.println("Introduce el genero:");
                        genero=teclado.nextLine();
                        if(Validar.comprobarGenero(genero)){
                            verGenero=true;
                        }else{
                            System.out.println("El tipo de genero introducido no es correcto. Los valores admitidos son:\nM, H, U\n");
                        
                        }
                    }while(verGenero=false);
                    
                    
                    
                    do{
                        System.out.println("Introduce la talla:");
                        talla=teclado.nextLine();
                        if(Validar.comprobarTalla(talla)){
                            verTalla=true;
                        }else{
                            System.out.println("La talla introducida no es correcta. Los valores admitidos son:\nXS, S, M, L, XL, XXL\n");
                        
                        }
                    }while(verTalla=false);
                    
                    System.out.println("Introduce la composicion:");
                    composicion=teclado.nextLine();
                    do{
                        try{
                            System.out.println("Introduce el precio: ");
                            precio = teclado.nextInt();
                            
                          
                        }catch(InputMismatchException e){
                            System.out.println("El dato introducido tiene que ser numérico");
                            precio=-1;
                            teclado.nextLine();                     //consumimos el salto de linea
                        }
                    }while(precio==-1);
                    
                    Ticket.actualizarUnArticulo(codigo, descripcion, genero, talla, composicion, precio);
                    break;
                    
                case 5:
                    //Eliminar un Articulo
                    System.out.println("Introduce lel codigo del articulo a eliminar");
                    codigo = teclado.nextInt();
                    Ticket.eliminarUnArticulo(codigo);
                    
                    break;
                    
                case 6:
                    //Salir
                    
                    break;
                    
                case -1:
                    //Seleccion no válida
                    System.out.println("La opcion elegida no es correcta. Intentalo de nuevo:");
                    break;
            }
        }
    }
        
        
    
    
    public static int menu(){
        System.out.println("-------------------------------------------");
        System.out.println("GESTIÓN DE COMPRA DE ARTICULOS: CIDEAD MODA");
        System.out.println("-------------------------------------------");
        System.out.println("1. Nuevo Artículo");
        System.out.println("2. Listar Artículos");
        System.out.println("3. Buscar un Artículo");
        System.out.println("4. Modificar Datos de un Artículo");
        System.out.println("5. Eliminar un Artículo");
        System.out.println("6. Salir");
        System.out.println("-------------------------------------------");
        System.out.println("Elige una opción: \n");
        
        int sel = teclado.nextInt();
        teclado.nextLine();             //consumimos el salto de linea
        
        if(sel>6 || sel < 1){
            return -1;                  //si la opcion no es correcta devuelve -1
        }else{
            return sel;
        }
    }
    
}
