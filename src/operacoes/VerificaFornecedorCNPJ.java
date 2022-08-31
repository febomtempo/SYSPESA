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
public class VerificaFornecedorCNPJ {
    
    //Verifica se o cnpj digitado pelo usuário existe, retornando verdadeiro ou falso.
    
    public static boolean verificaCNPJ(List<Fornecedor> fornecedores, String cnpj){
        boolean cnpjExiste = false;
        for(Fornecedor f: fornecedores){
            if(f.getCnpj().equals(cnpj)){
                cnpjExiste = true;
            }
        }
        return cnpjExiste;
    }
}
