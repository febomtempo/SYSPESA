/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornecedores;

import java.io.Serializable;

/**
 *
 * @author Notebook
 */
public class Endereco implements Serializable {
    
    private String cep;
    private String rua;
    private String cidade;
    private String bairro;
    private String estado;
    private int numeroImovel;
    private String complemento;

    public Endereco(String cep, String rua, String cidade, String bairro, String estado, int numeroImovel, String complemento) {
        this.cep = cep;
        this.rua = rua;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.numeroImovel = numeroImovel;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroImovel() {
        return numeroImovel;
    }

    public void setNumeroImovel(int numeroImovel) {
        this.numeroImovel = numeroImovel;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    

}
