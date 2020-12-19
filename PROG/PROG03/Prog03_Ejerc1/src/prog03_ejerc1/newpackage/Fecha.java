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
    public static enumMes mesAnio;
   
    
    public Fecha(enumMes mes){
        fechaDia = 0;
        fechaAnio = 0;
        mesAnio = mes;
    }
    
    public Fecha(int dia, enumMes mes, int anio){
        fechaDia = dia;
        fechaAnio = anio;
        mesAnio = mes;
    }
    
    public int getDia(){
        return fechaDia;
    }
    
    public void setDia(int dia){
        fechaDia = dia;
    }
    
    public static boolean isSummer(){
        boolean summer = ((mesAnio == enumMes.JUNIO && fechaDia >= 21) || mesAnio == enumMes.JULIO || mesAnio == enumMes.AGOSTO || (mesAnio == enumMes.SEPTIEMBRE && fechaDia <=20))? true : false;
        return summer;
    }
}
