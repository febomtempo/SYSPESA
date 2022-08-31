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
public class ValidacaoTelefone {
    
    //Valida se o telefone digitado está no formato correto: (##)#####-#### ou (##)####-####

    
    public static boolean validarFone(String fone){
        
        fone = fone.trim();
        return fone.matches("\\(\\d{2}\\)\\d{4,5}-\\d{4}");
       
    }
}
