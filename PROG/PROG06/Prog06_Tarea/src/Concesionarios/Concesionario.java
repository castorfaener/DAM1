

package Concesionarios;

/**
 * 
 * @author Francisco alacreu Rosello
 */
public class Concesionario {
    
    int stockVehiculos = 0;
    Vehiculo coche[] = new Vehiculo[50];
    
    
    /**
     * Constructor de la clase Concesionario
     */
    public Concesionario(){
        
    }
    
    /**
     * Busca el vehiculo cuya matricula se pasa por parametro
     * @param matricula matricula que identifica el vehiculo a buscar
     * @return devuelve los datos del vehiculo solicitado o null si no lo encuentra
     */
    public String buscaVehiculo(String matricula){
        
    }
    /**
     * Recibe todos los datos de un vehículo y trata de insertarlo en el concesionario.
     * @param matricula Matricula del vehiculo
     * @param marca Marca del vehiculo
     * @param km km del vehiculo
     * @param diaMat Dia de matriculacion
     * @param mesMat Mes de matriculacion
     * @param anioMat Año de matriculacion
     * @param descrip Descripcion del vehiculo
     * @param precio precio del vehiculo
     * @param propietario Propietario del vehiculo
     * @param dni DNI del vehiculo
     * @return Devuelve 0 si se hizo con éxito, -1 si el concesionario está lleno y -2 si la matrícula ya existe
     */
    public int insertarVehiculo(String matricula, String marca, int km, int diaMat, int mesMat, int anioMat, String descrip, double precio, String propietario, String dni){
        
        for(int i=0; i<stockVehiculos; i++){                                //Verificamos que la matricula introducida no se encuentra ya registrada
            if(matricula.equals(coche[i].getMatricula())){
                return -2;
            }
        }
        
        if(stockVehiculos >= 50){                                               //Verificamos que no hayamos alcanzado el total de 50 vehiculos
            return -1;
        }
        coche[stockVehiculos] = new Vehiculo();
        coche[stockVehiculos].setMatricula(matricula);
        coche[stockVehiculos].setMarca(marca);
        coche[stockVehiculos].setKm(km);
        coche[stockVehiculos].setFechaMatriculacion(diaMat, mesMat, anioMat);
        coche[stockVehiculos].setDescripcion(descrip);
        coche[stockVehiculos].setPrecio(precio);
        coche[stockVehiculos].setPropietario(propietario);
        coche[stockVehiculos].setDNI(dni);
        
        stockVehiculos++;           //Aumentamos el Stock de Vehiculos
        
        return 0;
    }
    
    /**
     * Lista por pantalla los datos de todos los vehículos del concesionario.
     */
    public void listaVehiculos(){
        
        System.out.println("-- Listado de vehiculos --");
        System.out.println("Marca       Matricula       Precio      kilometraje     Descripcion\n");
        for(int i=0; i<stockVehiculos; i++){
            System.out.print(coche[i].getMarca());
            System.out.print("       ");
            System.out.print(coche[i].getMatricula());
            System.out.print("       ");
            System.out.print(coche[i].getPrecio());
            System.out.print("       ");
            System.out.print(coche[i].getPrecio());
            System.out.print("       ");
            System.out.println(coche[i].getDescripcion());
        }
        
    }
    
    /**
     * Recibe por parámetro una matrícula y un número de kilómetros, busca el vehículo con la cuya matrícula coincida y actualiza sus kilómetros
     * @param matricula Matricula del vehiculo
     * @param kms Kilometros del vehiculo
     * @return Devuelve true si se hizo con éxito y false en caso contrario
     */
    public boolean actualizaKms(String matricula, int kms){
        for(int i=0; i<stockVehiculos; i++){
            if(coche[i].getMatricula().equals(matricula)){
                coche[i].setKm(kms);
                return true;
            }
        }
        return false;
    }
}
