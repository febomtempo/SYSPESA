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

//Formata o nome do arquivo para que seja ano-mes.


public class FormatarArquivo {
    public static String formatarArquivo(List<Despesa> despesas){
        String ano = "";
        String mes = "";
        for(Despesa d : despesas){
            ano = d.getData().substring(6,10);
            mes = d.getData().substring(3,5);
        }
        
        return ano + "-" + mes;
    }
}
