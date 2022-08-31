/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import fornecedores.Fornecedor;
import java.util.List;

/**
 *
 * @author Notebook
 */
public class VerificaExistenciaFornecedor {

    //Retorna true ou false em relação ao tamanho da lista, verificando a existência ou não
    //de um fornecedor cadastrado.
    
    public static boolean verificaFornecedorExiste(List<Fornecedor> fornecedores) {
        return fornecedores.size() > 0;
    }
}