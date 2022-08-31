/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import despesas.Despesa;
import java.util.List;

/**
 *
 * @author Notebook
 */
public class ListarDespesasData {
    
    //Lista todas as despesas que contenham a sequência de mês e ano informada pelo usuário.
    
    
    public static String listaDespesas(List<Despesa> despesas, String ano, String mes){
        
        String retorno = "\n";
        for(Despesa d : despesas){
            if(d.getData().endsWith(mes + "/" + ano)){
                retorno += d.toString() + "\n";
            }
            
        }
        return retorno;
        
    }

}
