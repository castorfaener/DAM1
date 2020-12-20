/*
 * 
 */
package com.prog03.figuras;

public class Rectangulo {

    int base;
    int altura;

    public Rectangulo() {                                //Constructor con atributos a cero
        base = 0;
        altura = 0;
    }

    public Rectangulo(int rectBase, int rectAltura) {            //Constructor con atributos definidos
        base = rectBase;
        altura = rectAltura;
    }

    public void setAltura(int rectAltura) {                  //setter de altura
        altura = rectAltura;
    }

    public int getAltura() {                                     //getter de altura
        return altura;
    }

    public void setBase(int rectBase) {                          //setter de base
        base = rectBase;
    }

    public int getBase() {                           //getter de base
        return base;
    }

    public float getArea() {                        //Obtencion de area
        float area = base * altura;
        return area;
    }

    public String toString() {
        return ("El rectangulo tiene una base de " + getArea() + " y una altura de " + altura);
        
    }

    public boolean isCuadrado() {
        return (base == altura) ? true : false;
    }

}
