/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import despesas.Despesa;
import java.util.List;
import fornecedores.Fornecedor;
import java.io.IOException;

/**
 *
 * @author Notebook
 */
public interface Leitura_Gravacao {
    public abstract void gravarDespesa(List<Despesa> despesas) throws IOException;
    public abstract void gravarFornecedor(List<Fornecedor> fornecedores) throws IOException;
    public abstract List<Despesa> lerDespesas() throws IOException, ClassNotFoundException;
    public abstract List<Fornecedor> lerFornecedores() throws IOException, ClassNotFoundException;
}
