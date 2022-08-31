/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoesEntrada;

import operacoes.BuscaFornecedorCNPJ;
import despesas.Despesa;
import despesas.DespesaProduto;
import java.util.List;
import javax.swing.JOptionPane;
import operacoes.AddDespesa;
import operacoes.ListarFornecedores;
import fornecedores.Fornecedor;
import validacoes.ValidacaoData;
import validacoes.ValidacaoDescricao;
import operacoes.VerificaFornecedorCNPJ;

/**
 *
 * @author Notebook
 */

//Realiza o lançamento de uma despesa de produto, verificando se a data é digitada no formato correto, se o cnpj
//do fornecedor está cadastrado e se a descrição possui 2 ou mais caracteres.

public class LancarProdutoJOption implements Acao {

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
        String descricao = JOptionPane.showInputDialog("Digite a descrição do Produto:");
        while (ValidacaoDescricao.validarDescricao(descricao) == false){
            descricao = JOptionPane.showInputDialog("A descrição deve ter ao menos 2 caracteres, digite novamente:");
        }
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos adquiridos:"));
        double valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Unitário de cada Produto:"));
        Despesa despesa = new DespesaProduto(data, fornecedor, descricao, quantidade, valorUnitario);
        AddDespesa.lancaDespesa(despesas, despesa);
        JOptionPane.showMessageDialog(null, "Despesa Lançada com Sucesso!!!");
    }

}
