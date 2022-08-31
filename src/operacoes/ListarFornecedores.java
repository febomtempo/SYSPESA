/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import java.util.List;
import fornecedores.Fornecedor;

/**
 *
 * @author Notebook
 */

//Lista o cnpj e nome de todos os fornecedores para auxiliar o usuário no lançamento de despesas.

public class ListarFornecedores {
    public static String listaFornecedores(List<Fornecedor> fornecedores){
        String retorno = "\n";
        for(Fornecedor f : fornecedores){
            retorno += "CNPJ: " + f.getCnpj()+ " - Nome: " + f.getNomeFantasia() + "\n";
        }
        return retorno;
        
    }
}
