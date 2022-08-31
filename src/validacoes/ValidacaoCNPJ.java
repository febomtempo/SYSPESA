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
public class ValidacaoCNPJ {
    
    //Valida se o CNPJ digitado está no formato correto:  ##.###.###/####-##
    
     public static boolean validarCNPJ(String cnpj){
        
        cnpj = cnpj.trim();
        return cnpj.matches("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}");
       
    }
    
}
