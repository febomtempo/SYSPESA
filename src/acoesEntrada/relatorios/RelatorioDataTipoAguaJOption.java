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
import operacoes.ListarDespesasDataTipo;

/**
 *
 * @author Notebook
 */
public class RelatorioDataTipoAguaJOption implements Acao{

    //Relatórios por Data (Ano e Mês) e Despesa de Água que que recebe os valores da data digitados pelo usuário 
    //e verifica o valor do tipo de água do enum pelo MenuToString.
    //Após comparar, o relatório é exibido.
    
    @Override
    public void acao(List<Despesa> despesas, List<Fornecedor> fornecedores) {
        String ano = JOptionPane.showInputDialog("Digite o Ano que deseja pesquisar no Relatório:");
        String mes = JOptionPane.showInputDialog("Digite o Mês que deseja pesquisar no Relatório:");
        JOptionPane.showMessageDialog(null, ListarDespesasDataTipo.listaDespesasAgua(despesas, ano, mes));
    }
}
