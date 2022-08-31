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
public class ValidacaoData {

    //Valida se a Data digitada está no formato correto: dd/MM/yyyy
    
    public static boolean validarData(String data){
        
        data = data.trim();
        return data.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/\\d{4}");
       
    }
    
}
