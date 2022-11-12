/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

/**
 *
 * @author nivi-
 */
public class Funcionario {
     private String nome;
     private String cpf;
     private String genero;
     private String idade;
     private String telefone;
     private String endereco;
     private String municipio;
     private String estado;  

    public Funcionario(String nome, String cpf, String genero, String idade, String telefone, String endereco, String municipio, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.municipio = municipio;
        this.estado = estado;
    }
     public Funcionario() {
         
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     
}
