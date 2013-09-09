/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifnmg.edu.tads.ltp3.trabalhoPraticoI;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aline
 */
public class Lancamento {
    private int codigo;
    private String tipo;// 1-Credito 2-Debito
    private Date dataCadastro;
    private Date dataLiquidacao;
    private Date dataBaixa;
    private double valorAbsoluto;
    private double multa;
    private double desconto;
    private String historico;
    private String formaPagamento;//cartao,dinheiro, cheque, boleto
    private ArrayList<Sessao> sessoes;

    public Lancamento() {
        this.valorAbsoluto = 0;
        this.sessoes = new ArrayList<Sessao>();
   
  
    }
  
    
    public void addSessoes (Sessao sessao){
        
        if(!this.sessoes.contains(sessao)){
            this.sessoes.add(sessao);
        }
    }
    
     public void removeSessao (Sessao sessao){
        if (this.sessoes.contains(sessao)){
            this.sessoes.remove(sessao);
        }
    }
    
     
  

    public int getCodigo() {
      
        return codigo;
     
    }

    public void setCodigo(int codigo) {
        if(codigo>0){
             this.codigo = codigo;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
       
        if (tipo==1){
          this.tipo = "credito";
        } 
        if (tipo==2){
          this.tipo = "debito";
        }
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataLiquidacao() {
        return dataLiquidacao;
    }

    public void setDataLiquidacao(Date dataLiquidacao) {
        this.dataLiquidacao = dataLiquidacao;
    }

    public Date getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(Date dataBaixa) {
        this.dataBaixa = dataBaixa;
    }

    public double getValorAbsoluto() {
        return valorAbsoluto;
    }

    public void setValorAbsoluto(double valorAbsoluto) {
        
        this.valorAbsoluto = valorAbsoluto;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getDesconto() {
       
        return desconto;
    }

    public void setDesconto(double desconto) {
         if((desconto<this.valorAbsoluto)&&(desconto>0)){
              this.desconto = desconto;
         } else{
             System.out.print("Valor Invalido!");
         }
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        Pattern padraoHistorico = Pattern.compile("{3,}");
        Matcher comparar= padraoHistorico.matcher(historico);
        if(comparar.matches()){
           this.historico = historico;
        }
    }

    public String getFomaPagamento() {
        return formaPagamento;
    }

    public void setFomaPagamento(String formaPagamento) {
        
        
        this.formaPagamento = formaPagamento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.codigo;
        hash = 89 * hash + Objects.hashCode(this.tipo);
        hash = 89 * hash + Objects.hashCode(this.dataCadastro);
        hash = 89 * hash + Objects.hashCode(this.dataLiquidacao);
        hash = 89 * hash + Objects.hashCode(this.dataBaixa);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.valorAbsoluto) ^ (Double.doubleToLongBits(this.valorAbsoluto) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.multa) ^ (Double.doubleToLongBits(this.multa) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.desconto) ^ (Double.doubleToLongBits(this.desconto) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.historico);
        hash = 89 * hash + Objects.hashCode(this.formaPagamento);
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
        final Lancamento other = (Lancamento) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.dataCadastro, other.dataCadastro)) {
            return false;
        }
        if (!Objects.equals(this.dataLiquidacao, other.dataLiquidacao)) {
            return false;
        }
        if (!Objects.equals(this.dataBaixa, other.dataBaixa)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorAbsoluto) != Double.doubleToLongBits(other.valorAbsoluto)) {
            return false;
        }
        if (Double.doubleToLongBits(this.multa) != Double.doubleToLongBits(other.multa)) {
            return false;
        }
        if (Double.doubleToLongBits(this.desconto) != Double.doubleToLongBits(other.desconto)) {
            return false;
        }
        if (!Objects.equals(this.historico, other.historico)) {
            return false;
        }
        if (!Objects.equals(this.formaPagamento, other.formaPagamento)) {
            return false;
        }
        return true;
    }
   //to String
    @Override
    public String toString() {
        return "Lancamento{" + "codigo=" + codigo + ", tipo=" + tipo + ", dataCadastro=" + dataCadastro + ", dataLiquidacao=" + dataLiquidacao + ", dataBaixa=" + dataBaixa + ", valorAbsoluto=" + valorAbsoluto + ", multa=" + multa + ", desconto=" + desconto + ", historico=" + historico + ", formaPagamento=" + formaPagamento + '}';
    }
    
    
    
    
    
}
