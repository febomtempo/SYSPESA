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
public class AddDespesa {
    
    //Método de adicionar despesa usado nos lançamentos.
    
    public static void lancaDespesa(List<Despesa> despesas, Despesa despesa){
        despesas.add(despesa);
    }
}
