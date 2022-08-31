/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despesas;

import fornecedores.Fornecedor;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Notebook
 */
public class DespesaAgua extends Despesa implements Serializable{
    private double quantidade;
    private double valor;

    public DespesaAgua(String data, Fornecedor fornecedor, double quantidade, double valor) {
        super(data, fornecedor);
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        Locale brazil = new Locale("pt", "BR");
        NumberFormat formatoBr = NumberFormat.getCurrencyInstance(brazil);
        return super.toString() + " -- Despesa de Água -- " + "Valor Total: " +formatoBr.format(this.valor);
        
    }

    
    
}
