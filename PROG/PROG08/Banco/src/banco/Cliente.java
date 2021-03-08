

package banco;

import java.util.Objects;


public class Cliente {
    public Cliente(String nombre, String n_cuenta, double saldo){
        
        this.nombre=nombre;
        
        this.n_cuenta=n_cuenta;
        
        this.saldo=saldo;
        
    }
    
    private String nombre;
    private String n_cuenta;
    private double saldo;

    public String getNombre() {
        return nombre;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.n_cuenta, other.n_cuenta)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
