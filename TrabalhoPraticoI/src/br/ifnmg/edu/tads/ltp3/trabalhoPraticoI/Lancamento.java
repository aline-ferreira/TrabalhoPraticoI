/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifnmg.edu.tads.ltp3.trabalhoPraticoI;

import java.util.Date;

/**
 *
 * @author Aline
 */
public class Lancamento {
    private int codigo;
    private String tipo;
    private Date dataCadastro;
    private Date dataLiquidacao;
    private Date dataBaixa;
    private double valorAbsoluto;
    private double multa;
    private double desconto;
    private String historico;
    private String formaPagamento;

    public Lancamento() {
        if(codigo>0){
           this.valorAbsoluto = 0;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        this.historico = historico;
    }

    public String getFomaPagamento() {
        return formaPagamento;
    }

    public void setFomaPagamento(String fomaPagamento) {
        
        this.formaPagamento = fomaPagamento;
    }
    
    
    
    
    
}
