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
public class DespesaEnergia extends Despesa implements Serializable{
    private double kwMes;
    private String bandeira;
    private double valor;

    public DespesaEnergia(String data, Fornecedor fornecedor, double kwMes, String bandeira, double valor) {
        super(data, fornecedor);
        this.kwMes = kwMes;
        this.bandeira = bandeira;
        this.valor = valor;
    }


    public double getKwMes() {
        return kwMes;
    }

    public String getBandeira() {
        return bandeira;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        Locale brazil = new Locale("pt", "BR");
        NumberFormat formatoBr = NumberFormat.getCurrencyInstance(brazil);
        return super.toString() + " -- Despesa de Energia -- " + "Valor Total: " +formatoBr.format(this.valor);
    
    }
}
