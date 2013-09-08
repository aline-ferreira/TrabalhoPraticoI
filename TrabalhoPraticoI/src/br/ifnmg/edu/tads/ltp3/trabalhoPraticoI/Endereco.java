/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifnmg.edu.tads.ltp3.trabalhoPraticoI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aline
 */
public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private int numero;
    private String cep;
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        Pattern padraoBairro = Pattern.compile("[a-zA-Z]{3,250}");
        Matcher comparar= padraoBairro.matcher(bairro);
       
       if(comparar.matches()){
           this.bairro = bairro;
       }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        Pattern padraoCidade = Pattern.compile("[a-zA-Z]{3,250}");
        Matcher comparar= padraoCidade.matcher(cidade);
        if(comparar.matches()){
            this.cidade = cidade;
        }
    }

    public int getNumero() {
        
        return numero;
    }

    public void setNumero(int numero) {
        
        if(numero>0){
          this.numero = numero;
        }
    }

    public String getCep() {  
        return cep;
    }

    public void setCep(String cep) {
        Pattern padraoCep = Pattern.compile("\\d{5}-\\d{3}");
        Matcher comparar= padraoCep.matcher(cep);
        if(comparar.matches()){
            this.cep=cep;
        }
        
     
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", numero=" + numero + ", cep=" + cep + '}';
    }
    
    
}
