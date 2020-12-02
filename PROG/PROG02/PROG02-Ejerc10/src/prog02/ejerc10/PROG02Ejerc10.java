
package prog02.ejerc10;

public class PROG02Ejerc10 {

    public static void main(String[] args) {
        float x = (float)4.50;
        float y = (float)3.0;
        int i = 2;
        int j = (int)(i * x);
        System.out.println("------- Conversiones entre enteros y coma flotante -------");
        System.out.printf("Producto de int por float: j = i * x = %d", j);
        double dx = 2.0;
        double dz = dx * y;
        System.out.printf("\nProducto de double por float: dz = dx * y = %.1f\n\n", dz);
        byte bx = 5;
        byte by = 2;
        byte bz = (byte)(bx - by);
        System.out.println("------- Operaciones con byte -------");
        System.out.printf("byte: " + bx +" - " + by + " = " + bz);
        bx = -128;
        by = 1;
        bz = (byte)(bx - by);
        System.out.printf("\nbyte : " + bx +" - " + by + " = " + bz);
        int bzint = (int)(bx - by);                                             
        System.out.printf("\n(int)("+ bx +" - " + by + ") = " + bzint);
        short sx = 5;
        short sy = 2;
        short sz = (short)(sx - sy);
        System.out.println("\n\n------- Operaciones con short -------");
        System.out.printf("short: " + sx +" - " + sy + " = " + sz);
        sx = 32767;
        sy = 1;
        sz = (short)(sx + sy);
        System.out.printf("\nshort: " + sx +" + " + sy + " = " + sz);
        System.out.println("\n\n------- Operaciones con char -------");
        
        
        
    }
    
}
