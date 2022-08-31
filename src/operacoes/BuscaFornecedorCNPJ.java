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
public class BuscaFornecedorCNPJ {
    
    //Compara o cnpj dos fornecedores com o digitado e em caso de igualdade retorna o fornecedor correto.
    
     public static Fornecedor buscaFornecedorCNPJ(List<Fornecedor> fornecedores, String cnpj){
        Fornecedor retorno = null;
            for(Fornecedor f: fornecedores){
                if(f.getCnpj().equals(cnpj)){
                    retorno = f;
                }
            }
        return retorno;
    }
}
