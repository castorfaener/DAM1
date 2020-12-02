
package prog02.ejerc6;

public class PROG02Ejerc6 {
    public enum Razas {Mastin, Terrier, Bulldog, Pekines, Caniche, Galgo }
    
    public static void main(String[] args) {
        Razas var1 = Razas.Terrier;
        Razas var2 = Razas.Caniche;
        boolean comparacion;
        
        comparacion = (var1 == var2)? true:false; 
        
        System.out.println("El resultado de la comparacion es:" + comparacion);
        System.out.println("La posicion de " + var1 + " es: "+ var1.ordinal());
        System.out.println("La posicion de " + var2 + " es: "+ var2.ordinal());
    }
    
}
