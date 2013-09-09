/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifnmg.edu.tads.ltp3.trabalhoPraticoI;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Aline
 */
public class Sessao {
    private int codigo;
    private double saldoInicial;
    private double saldoFinal;
    private Funcionario operador;
    private Caixa  caixa;
   

    public Sessao() {
       this.operador= null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo>0){
          this.codigo = codigo;
        }
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public Funcionario getOperador() {
        return operador;
    }

    public void setOperador(Funcionario operador) {
        this.operador = operador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.codigo;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.saldoInicial) ^ (Double.doubleToLongBits(this.saldoInicial) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.saldoFinal) ^ (Double.doubleToLongBits(this.saldoFinal) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.operador);
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
        final Sessao other = (Sessao) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldoInicial) != Double.doubleToLongBits(other.saldoInicial)) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldoFinal) != Double.doubleToLongBits(other.saldoFinal)) {
            return false;
        }
        if (!Objects.equals(this.operador, other.operador)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
