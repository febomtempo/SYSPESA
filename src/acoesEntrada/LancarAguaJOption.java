/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoesEntrada;

import operacoes.BuscaFornecedorCNPJ;
import despesas.Despesa;
import despesas.DespesaAgua;
import fornecedores.Fornecedor;
import java.util.List;
import javax.swing.JOptionPane;
import operacoes.AddDespesa;
import operacoes.ListarFornecedores;
import validacoes.ValidacaoData;
import operacoes.VerificaFornecedorCNPJ;

/**
 *
 * @author Notebook
 */

//Realiza o lançamento de uma despesa de água, verificando se a data é digitada no formato correto e se o cnpj
//do fornecedor está cadastrado.

public class LancarAguaJOption implements Acao{

    @Override
    public void acao(List<Despesa> despesas, List<Fornecedor> fornecedores) {
        String data = JOptionPane.showInputDialog("Digite a Data do Pagamento da Despesa:");
        while (ValidacaoData.validarData(data) == false) {
            data = JOptionPane.showInputDialog("Digite uma data válida e no formato correto (dd/MM/yyyy):");
        }
        String cnpjFornecedor = JOptionPane.showInputDialog("Digite o CNPJ do Fornecedor desejado:\n" + ListarFornecedores.listaFornecedores(fornecedores));
        while (VerificaFornecedorCNPJ.verificaCNPJ(fornecedores, cnpjFornecedor) == false) {
            cnpjFornecedor = JOptionPane.showInputDialog("Esse CNPJ não existe, digite um CNPJ de Fornecedor existente:\n" + ListarFornecedores.listaFornecedores(fornecedores));
        }
        Fornecedor fornecedor = BuscaFornecedorCNPJ.buscaFornecedorCNPJ(fornecedores, cnpjFornecedor);
        double quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de kilolitros de água consumida:"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Total da Conta de Água:"));
        Despesa despesa = new DespesaAgua(data, fornecedor, quantidade, valor);
        AddDespesa.lancaDespesa(despesas, despesa);
        JOptionPane.showMessageDialog(null, "Despesa Lançada com Sucesso!!!");
    }
    
}
