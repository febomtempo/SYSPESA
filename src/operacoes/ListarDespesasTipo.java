/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import despesas.Despesa;
import despesas.DespesaAgua;
import despesas.DespesaEnergia;
import despesas.DespesaProduto;
import despesas.DespesaServico;
import java.util.List;

/**
 *
 * @author Notebook
 */
public class ListarDespesasTipo {
    
    //Lista todas as despesas do tipo DespesaAgua.
    
    public static String listaDespesasAgua(List<Despesa> despesas){
        
        String retorno = "\n";
        for(Despesa d : despesas){
            if(d instanceof DespesaAgua){
                retorno += d.toString() + "\n";
            }
            
        }
        return retorno;
        
    }
    
    //Lista todas as despesas do tipo DespesaEnergia.
    
    public static String listaDespesasEnergia(List<Despesa> despesas){
        
        String retorno = "\n";
        for(Despesa d : despesas){
            if(d instanceof DespesaEnergia){
                retorno += d.toString() + "\n";
            }
            
        }
        return retorno;
        
    }
    
    //Lista todas as despesas do tipo DespesaServico
    
    public static String listaDespesasServico(List<Despesa> despesas){
        
        String retorno = "\n";
        for(Despesa d : despesas){
            if(d instanceof DespesaServico){
                retorno += d.toString() + "\n";
            }
            
        }
        return retorno;
        
    }
    
    //Lista todas as despesas do tipo DespesaProduto.
    
    public static String listaDespesasProduto(List<Despesa> despesas){
        
        String retorno = "\n";
        for(Despesa d : despesas){
            if(d instanceof DespesaProduto){
                retorno += d.toString() + "\n";
            }
            
        }
        return retorno;
        
    }
}
