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
public class DespesaProduto extends Despesa implements Serializable{
    private String descricao;
    private int quantidade;
    private double valorUnitario;
    private double valorTotal;

    public DespesaProduto(String data, Fornecedor fornecedor, String descricao, int quantidade, double valorUnitario) {
        super(data, fornecedor);
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorUnitario*quantidade;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        Locale brazil = new Locale("pt", "BR");
        NumberFormat formatoBr = NumberFormat.getCurrencyInstance(brazil);
        return super.toString() + " -- Despesa de Produto -- " + "Descrição: " 
                + this.descricao + " -- Valor Total: " +formatoBr.format(this.valorTotal);
        }
}
