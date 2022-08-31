/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoesEntrada;

import despesas.Despesa;
import java.util.List;
import fornecedores.Fornecedor;

/**
 *
 * @author Notebook
 */

//Interface pra passar despesas e fornecedores nos metodos de entrada

public interface Acao {
    abstract public void acao(List<Despesa> despesas, List<Fornecedor> fornecedores);
}
