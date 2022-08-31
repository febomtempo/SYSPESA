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
public class DespesaServico extends Despesa implements Serializable{
    private String descricao;
    private double valor;

    public DespesaServico(String data, Fornecedor fornecedor, String descricao, double valor) {
        super(data, fornecedor);
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        Locale brazil = new Locale("pt", "BR");
        NumberFormat formatoBr = NumberFormat.getCurrencyInstance(brazil);
        return super.toString() + " -- Despesa de Serviço -- " + "Descrição: " 
                + this.descricao + " -- Valor Total: " +formatoBr.format(this.valor);
        }
}
