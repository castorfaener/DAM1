

package Concesionarios;

/**
 * Clase para la gestion de vehiculos de un concesionario
 * @author Francisco alacreu Rosello
 */
public class Concesionario {
    
    int stockVehiculos = 0;
    Vehiculo coche[] = new Vehiculo[50];            //Instanciamos un array de objetos de tipo Vehiculo con un máximo de 50 unidades
    
    
    /**
     * Constructor de la clase Concesionario
     */
    public Concesionario(){
        
    }
 
  
    
    
    
    
    /**
     * Recibe por parámetro una matrícula y un número de kilómetros, busca el vehículo con la cuya matrícula coincida y actualiza sus kilómetros
     * @param matricula Matricula del vehiculo
     * @param km Kilometros del vehiculo
     * @return Devuelve true si se hizo con éxito y false en caso contrario
     */
    public boolean actualizaKms(String matricula, int km){
        for(int i=0; i<stockVehiculos; i++){
            if(coche[i].getMatricula().equals(matricula)){
                coche[i].setKm(km);
                return true;
            }
        }
        return false;
    }
}
