/* Ejercicio 10 de PROG02*/
package prog02.ejerc10;

public class PROG02Ejerc10 {

    public static void main(String[] args) {
        //Operaciones con floats
        
        float x = (float)4.50;
        float y = (float)3.0;
        int i = 2;
        int j = (int)(i * x);
        System.out.println("------- Conversiones entre enteros y coma flotante -------");
        System.out.printf("Producto de int por float: j = i * x = %d", j);
        double dx = 2.0;
        double dz = dx * y;
        System.out.printf("\nProducto de double por float: dz = dx * y = %.1f\n\n", dz);
        
        //Operaciones con bytes
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
        
        //operaciones con shorts
        short sx = 5;
        short sy = 2;
        short sz = (short)(sx - sy);
        System.out.println("\n\n------- Operaciones con short -------");
        System.out.printf("short: " + sx +" - " + sy + " = " + sz);
        sx = 32767;
        sy = 1;
        sz = (short)(sx + sy);
        System.out.printf("\nshort: " + sx +" + " + sy + " = " + sz);
        
        //Operaciones con char
        System.out.println("\n\n------- Operaciones con char -------");
        char cx = '\u000F';
        char cy = '\u0001';
        int z = (int)cx - (int)cy;
        System.out.println("char: "+ cx + " - " + cy + " = " + z );
        z = (int)cx - 1;
        System.out.println("char: "+ cx + " - 1 = " + z );
        cx = '\uFFFF';
        z = (int)cx;
        System.out.println("(int)(" + cx + ") = " + z);
        sx = (short)cx;
        System.out.println("(short)(" + cx + ") = " + sx);
        sx = -32768;
        cx = (char)sx;
        z = (int)sx;
        
        //Las ultimas dos operaciones no entiendo como realizarlas
        
    }
    
}
