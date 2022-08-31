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
public class Fornecedor implements Serializable{
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String telefone;
    private Endereco endereco;
    private String eMail;

    public Fornecedor(String cnpj, String razaoSocial, String nomeFantasia, String telefone, Endereco endereco, String eMail) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.telefone = telefone;
        this.endereco = endereco;
        this.eMail = eMail;
    }


    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String geteMail() {
        return eMail;
    }
    
    
    
}
