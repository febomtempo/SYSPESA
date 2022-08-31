/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacoes;

/**
 *
 * @author Notebook
 */
public class ValidacaoCEP {
    
    //Valida se o CEP digitado está no formato correto: #####-###
    
    public static boolean validarCEP(String cep){
        
        cep = cep.trim();
        return cep.matches("\\d{5}-\\d{3}");
       
    }
}
