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
public class ValidacaoDescricao {
    
    //Valida se a descrição possui 2 ou mais caracteres.
    
    public static boolean validarDescricao(String desc){
        
        desc = desc.trim();
        return desc.length()>=2;
       
    }
}
