/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifnmg.edu.tads.ltp3.trabalhoPraticoI;

/**
 *
 * @author Aline
 */
public class Caixa {
    private int codigo;
    private int numero;
    private double saldo;

    public Caixa() {
        this.saldo =0;
    }
 
    public int getCodigo() {
        return codigo;
    }
   
    public void setCodigo(int codigo) {
        if (codigo>0){
          this.codigo = codigo;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero>0){
          this.numero = numero;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.codigo;
        hash = 97 * hash + this.numero;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caixa other = (Caixa) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        return true;
    }
    
    //toString
    @Override
    public String toString() {
        return "Caixa{" + "codigo=" + codigo + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    
   
    
}
