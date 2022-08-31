/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoesEntrada.relatorios;

import acoesEntrada.Acao;
import despesas.Despesa;
import fornecedores.Fornecedor;
import java.util.List;
import javax.swing.JOptionPane;
import operacoes.ListarDespesasTipo;

/**
 *
 * @author Notebook
 */
public class RelatorioTipoEnergiaJOption implements Acao{

    //Exibe o relatório de despesas de energia.
    
    @Override
    public void acao(List<Despesa> despesas, List<Fornecedor> fornecedores) {
        JOptionPane.showMessageDialog(null, ListarDespesasTipo.listaDespesasEnergia(despesas));
    }
    
}
