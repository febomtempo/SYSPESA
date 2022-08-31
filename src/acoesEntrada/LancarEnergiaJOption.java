/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoesEntrada;

import operacoes.BuscaFornecedorCNPJ;
import despesas.Despesa;
import despesas.DespesaEnergia;
import java.util.List;
import javax.swing.JOptionPane;
import operacoes.AddDespesa;
import operacoes.ListarFornecedores;
import fornecedores.Fornecedor;
import validacoes.ValidacaoData;
import operacoes.VerificaFornecedorCNPJ;

/**
 *
 * @author Notebook
 */

//Realiza o lançamento de uma despesa de energia, verificando se a data é digitada no formato correto e se o cnpj
//do fornecedor está cadastrado.

public class LancarEnergiaJOption implements Acao{

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
        double kwMes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade gasta de kilowatts consumidos no mês:"));
        String bandeira = JOptionPane.showInputDialog("Digite a bandeira vigente:");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Total da Conta de Energia:"));
        Despesa despesa = new DespesaEnergia(data, fornecedor, kwMes, bandeira, valor);
        AddDespesa.lancaDespesa(despesas, despesa);
        JOptionPane.showMessageDialog(null, "Despesa Lançada com Sucesso!!!");
    }
    
}
