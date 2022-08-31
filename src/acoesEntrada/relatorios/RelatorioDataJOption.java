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
import operacoes.ListarDespesasData;

/**
 *
 * @author Notebook
 */
public class RelatorioDataJOption implements Acao{
    
    //Relatório por Data (Ano e Mês) que que recebe o valor digitado pelo usuário e verifica o valor do enum pelo MenuToString.
    //Após comparar, a ação desejada é feita.
    
    @Override
    public void acao(List<Despesa> despesas, List<Fornecedor> fornecedores) {
        String ano = JOptionPane.showInputDialog("Digite o Ano que deseja pesquisar no Relatório:");
        String mes = JOptionPane.showInputDialog("Digite o Mês que deseja pesquisar no Relatório:");
        JOptionPane.showMessageDialog(null, ListarDespesasData.listaDespesas(despesas, ano, mes));
    }
}
