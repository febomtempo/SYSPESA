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

//Lista todas as despesas que contenham a sequência de mês e ano informada pelo usuário e também sejam DespesaAgua.


public class ListarDespesasDataTipo {
    public static String listaDespesasAgua(List<Despesa> despesas, String ano, String mes){
        
        String retorno = "\n";
        for(Despesa d : despesas){
            if(d.getData().endsWith(mes + "/" + ano) && d instanceof DespesaAgua){
                retorno += d.toString() + "\n";
            }
            
        }
        return retorno;
        
    }
    
    //Lista todas as despesas que contenham a sequência de mês e ano informada pelo usuário e também sejam DespesaEnergia.
    
     public static String listaDespesasEnergia(List<Despesa> despesas, String ano, String mes){
        
        String retorno = "\n";
        for(Despesa d : despesas){
            if(d.getData().endsWith(mes + "/" + ano) && d instanceof DespesaEnergia){
                retorno += d.toString() + "\n";
            }
            
        }
        return retorno;
        
    }
     
     //Lista todas as despesas que contenham a sequência de mês e ano informada pelo usuário e também sejam DespesaServico.
     
     public static String listaDespesasServico(List<Despesa> despesas, String ano, String mes){
        
        String retorno = "\n";
        for(Despesa d : despesas){
            if(d.getData().endsWith(mes + "/" + ano) && d instanceof DespesaServico){
                retorno += d.toString() + "\n";
            }
            
        }
        return retorno;
        
    }
     
     //Lista todas as despesas que contenham a sequência de mês e ano informada pelo usuário e também sejam DespesaProduto.
     
     public static String listaDespesasProduto(List<Despesa> despesas, String ano, String mes){
        
        String retorno = "\n";
        for(Despesa d : despesas){
            if(d.getData().endsWith(mes + "/" + ano) && d instanceof DespesaProduto){
                retorno += d.toString() + "\n";
            }
            
        }
        return retorno;
        
    }
}
