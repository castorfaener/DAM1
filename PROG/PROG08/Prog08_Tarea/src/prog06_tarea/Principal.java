/*
 * Tarea PROG06
 * Concesionario
 * 
 */
package prog06_tarea;


import Concesionarios.Valida;
import Concesionarios.Vehiculo;
import java.util.*;

/**
 *
 * @author Francisco Alacreu Rosello
 */
public class Principal {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        ArrayList<Vehiculo> tienda=new ArrayList<Vehiculo>();    //Instanciamos un arraylist para la gestion de objetos de tipo vehículo.
        
        Iterator <Vehiculo> it = tienda.iterator();
        
        int diaMatr;
        int mesMatr;
        int anioMatr;
        String matricula;
        String DNI;
        double precio;
        String descripcion;
        int kms=0;
        String marca;
        String propietario;
        
        boolean matriculaDuplic=false;            //Variable para el control de duplicidades en las matriculas
        
        int select = 0;                     //Variable para el control de la seleccion del menu
        
        while(select!=6){
            
            select = menu();
            
            switch(select){
                case 1:
                    //Nuevo Vehiculo
                    System.out.println("Vamos a introducir los datos del nuevo vehiculo.\n");
                
                    //Introducimos matricula
                    do{
                        System.out.println("Introduce la matrícula: ");
                        matricula = teclado.nextLine();
                    }while(Valida.Matricula(matricula)==false);                 //Verificamos que la matricula cumpla el patrón
                
                    //Introducimos marca
                    System.out.println("Introduce la marca: ");
                    marca = teclado.nextLine();
                    
                    //Introducimos el numero de kilómetros
                    do{
                        try{
                            System.out.println("Introduce el numero de kilómetros: ");
                            kms = teclado.nextInt();
                            
                          
                        }catch(InputMismatchException e){
                            System.out.println("El dato introducido tiene que ser numérico");
                            kms=-1;
                            teclado.nextLine();                     //consumimos el salto de linea
                        }
                    }while(kms==-1);
                    
                    //Introducimos fecha de matriculacion
                    do{
                        System.out.println("Introduce la fecha de matriculacion.\nDia (1-31):  ");
                        diaMatr = teclado.nextInt();
                        System.out.println("Mes (1-12): ");
                        mesMatr = teclado.nextInt();
                        System.out.println("Año: ");
                        anioMatr = teclado.nextInt();
                        
                        if(Valida.FechaMatr(anioMatr, mesMatr, diaMatr)==false){            //Verificamos que la fecha sea correcta
                            System.out.println("Error!. La fecha introducida es posterior a la fecha actual.\n");
                        }
                    }while(Valida.FechaMatr(anioMatr, mesMatr, diaMatr) != true);       //No salimos del bucle hasta que la fecha no sea correcta 
                    
                    
                    teclado.nextLine();                     //consumimos el salto de linea
                    
                    //Introducimos descripcion
                    System.out.println("Introduce la descripcion: ");
                    descripcion = teclado.nextLine();
                    
                    //Introducimos precio
                    do{
                        try{
                            System.out.println("Introduce el precio: ");
                            precio = teclado.nextDouble();
                        }catch(InputMismatchException e){
                            System.out.println("El dato introducido tiene que ser numérico");
                            precio=-1;
                            teclado.nextLine();                     //consumimos el salto de linea
                        }
                    }while(precio==-1);
                    
                    teclado.nextLine();                     //consumimos el salto de linea
                    
                   //Introducimos propietario
                    do{
                        System.out.println("Introduce el nombre del propietario: ");
                        propietario = teclado.nextLine();
                    }while(Valida.Propietario(propietario)!=true);                  //Verificamos que cumple el patrón 
                    
                    
                    //Introducimos DNI
                    do{
                        System.out.println("Introduce el DNI del propietario: ");
                        DNI = teclado.nextLine();
                    }
                    while(Valida.DNI(DNI)==false);                                  //Verificamos que cumple el patrón
                    
                  
                    //Insertamos los datos 
                    
                    
                    
                    if(tienda.size()<50){                //Comprobamos que el concesionario no esté lleno
                        for(Vehiculo v: tienda){
                            if(matricula==v.getMatricula()){    //Comprobamos que la matricula no se haya introducido ya
                                
                                matriculaDuplic=true;
                            }
                        }if(matriculaDuplic==true){
                            System.out.println("Esta matrícula ya se ha introducido");
                        }else{
                            tienda.add(new Vehiculo(matricula, marca, kms, diaMatr, mesMatr, anioMatr, descripcion, precio, propietario,DNI));           //Introducimos el vehículo en el sistema
                        }              
                    }else{
                        System.out.println("El concesionario está lleno");
                    }
                    
                    Collections.sort(tienda);       //Ordenamos el ArrayList por matricula
     
                    break;


                
                case 2:
                    //Listar Vehiculos
                    
                    System.out.println("-- Listado de vehiculos --");
                    System.out.println("Marca       Matricula       Precio      kilometraje     Descripcion\n");
                    for(Vehiculo v: tienda){
                        System.out.print(v.getMarca());
                        System.out.print("       ");
                        System.out.print(v.getMatricula());
                        System.out.print("       ");
                        System.out.print(v.getPrecio());
                        System.out.print("       ");
                        System.out.print(v.getKm());
                        System.out.print("       ");
                        System.out.println(v.getDescripcion());
                    }
                    break;
                    
                case 3:
                    //Buscar Vehiculo
                    System.out.println("Introduce la matrícula del vehiculo a buscar");
                    matricula = teclado.nextLine();
                    boolean finded=false;
                    
                    for(Vehiculo v: tienda){
                        if(v.getMatricula().equals(matricula)){
                            System.out.println("Marca: " + it.next().getMarca() + "\nMatricula: "+ matricula + "\nPrecio: " + it.next().getPrecio());
                            finded=true;
                        }
                    }
                    if(finded==false){
                        System.out.println("No existe vehículo con la matrícula introducida");
                    }
                    
    
                    break;
                    
                case 4:
                    //Modificar kms Vehiculo
                    
                    System.out.println("Introduce la matricula del vehiculo para actualizar los kms");
                    matricula=teclado.nextLine();
                    finded=false;
                    for(Vehiculo v: tienda){
                        if(v.getMatricula().equals(matricula)){
                            System.out.println("Introduce los kilometros");
                            kms=teclado.nextInt();
                            teclado.nextLine();
                            v.setKm(kms);
                            System.out.println("Kilometraje actualizado correctamente");
                            finded=true;
                        }
                    }
                    if(finded==false){
                        System.out.println("La matricula introducida no pertenece a ningún vehiculo del concesionario");
                    }
                    
                    break;    
          
                case 5:
                    //Eliminar Vehiculo
                    
                    System.out.println("Introduce la matricula del vehiculo a eliminar");
                    matricula=teclado.nextLine();
                    
                    while(it.hasNext()){
                        if(it.next().getMatricula().equals(matricula)){
                            it.remove();
                            System.out.println("El vehiculo con matricula " + matricula + " ha sido eliminado");
                    }
                    }
                    
                case -1:
                    //Seleccion no valida
                    System.out.println("La opción elegida no es válida. Inténtalo de nuevo.");
                    break;
            }
            
            
            
        }
        
    }
    
    /**
     * Muestra las opciones del menu
     * @return opcion elegida o -1 en caso de error
     */
    public static int menu(){
        
        System.out.println("------------------------------");
        System.out.println("-- Gestion de concesionario --");
        System.out.println("------------------------------\n");
        System.out.println("Elige una opción: \n");
        System.out.println("1. Nuevo Vehiculo");
        System.out.println("2. Listar Vehiculos");
        System.out.println("3. Buscar Vehiculo");
        System.out.println("4. Modificar kms Vehiculo");
        System.out.println("5. Eliminar Vehiculo");
        System.out.println("6. Salir");
        
        int sel = teclado.nextInt();
        teclado.nextLine();             //consumimos el salto de linea
        
        if(sel>6 || sel < 1){
            return -1;                  //si la opcion no es correcta devuelve -1
        }else{
            return sel;
        }
        
    }
    
    
    
}


