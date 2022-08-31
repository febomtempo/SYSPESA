/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despesas;

import fornecedores.Fornecedor;
import java.io.Serializable;

/**
 *
 * @author Notebook
 */
public abstract class Despesa implements Serializable{
    protected String data;
    protected Fornecedor fornecedor;

    public Despesa(String data, Fornecedor fornecedor) {
        this.data = data;
        this.fornecedor = fornecedor;
    }

    public String getData() {
        return data;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    @Override
    public String toString() {
        return "Data: " + this.data;
    }
    

}
