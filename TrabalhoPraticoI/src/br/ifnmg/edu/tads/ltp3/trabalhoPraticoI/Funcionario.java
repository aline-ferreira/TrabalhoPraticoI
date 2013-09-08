/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifnmg.edu.tads.ltp3.trabalhoPraticoI;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Aline
 */
public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String senha;
    
     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo>0){
          this.codigo = codigo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Pattern patternNome= Pattern.compile("[\\w\\s]{3,250}");
        Matcher comparar= patternNome.matcher(nome);
        if(comparar.matches()){
         this.nome = nome;   
        }else{
            
           System.out.print("String muito curta! minimo de 3 caracteres");
        }
        
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
   
   
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        Pattern patternCpf= Pattern.compile("\\d{3}.\\d{3}.\\d{3}-\\d{2}");
        Matcher comparar= patternCpf.matcher(cpf);
        if(comparar.matches()){
            this.cpf=cpf;
        } else{
            System.out.print("Informe um cpf valido!");
        }
               
    }

   

    public void setSenha(String senha) {
        //A senha sera composta de letras e numeros e não aceita caracteres especiais
        Pattern padraoSenha= Pattern.compile("[a-zA-Z][\\S\\w]{6,250}");
        Matcher comparar= padraoSenha.matcher(senha);
        
           if(comparar.matches()){
               this.senha = senha;
           }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.codigo;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.cpf);
        hash = 47 * hash + Objects.hashCode(this.endereco);
        hash = 47 * hash + Objects.hashCode(this.senha);
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
        final Funcionario other = (Funcionario) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
   
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
