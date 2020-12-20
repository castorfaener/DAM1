/*
 *
 */
package prog03_ejerc1.newpackage;


public class Fecha {
    
    public enum enumMes{
    ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
    }
    public static int fechaDia;
    public static int fechaAnio;
    public static enumMes fechaMes;
   
    
    public Fecha(enumMes mes){
        fechaDia = 0;
        fechaAnio = 0;
        fechaMes = mes;
    }
    
    public Fecha(int dia, enumMes mes, int anio){
        fechaDia = dia;
        fechaAnio = anio;
        fechaMes = mes;
    }
    
    public int getDia(){
        return fechaDia;
    }
    
    public void setDia(int dia){
        fechaDia = dia;
    }
    
    public int getAnio(){
        return fechaAnio;
    }
    
    public void setAnio(int anio){
        fechaAnio = anio;
    }
    
    public boolean isSummer(){
        boolean summer = ((fechaMes == enumMes.JUNIO && fechaDia >= 21) || fechaMes == enumMes.JULIO || fechaMes == enumMes.AGOSTO || (fechaMes == enumMes.SEPTIEMBRE && fechaDia <=20))? true : false;
        return summer;
    }
    
    public void totString(){
        System.out.println("La fecha es " + fechaDia + " de " + fechaMes + " de " + fechaAnio);
    }
}
