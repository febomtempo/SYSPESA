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
public class AddFornecedor {
    
    //Método de adicionar fornecedor usado no cadastro de fornecedor.
    
    public static void cadastraFornecedor(List<Fornecedor> fornecedores, Fornecedor fornecedor){
        fornecedores.add(fornecedor);
    }
    
}
