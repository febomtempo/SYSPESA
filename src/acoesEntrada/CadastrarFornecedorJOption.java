/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoesEntrada;

import despesas.Despesa;
import java.util.List;
import javax.swing.JOptionPane;
import operacoes.AddFornecedor;
import fornecedores.Endereco;
import fornecedores.Fornecedor;
import operacoes.CadastrarEndereco;
import validacoes.ValidacaoCEP;
import validacoes.ValidacaoCNPJ;
import validacoes.ValidacaoEmail;
import validacoes.ValidacaoTelefone;
import operacoes.VerificaFornecedorCNPJ;

/**
 *
 * @author Notebook 
 */ 

//Realiza o cadastro de fornecedores, validando se o cnpj foi digitado no formato correto e se o 
//cnpj já existe, além da validação de telefone, cep e e-mail.

public class CadastrarFornecedorJOption implements Acao {

    @Override
    public void acao(List<Despesa> despesas, List<Fornecedor> fornecedores) {
        String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do Fornecedor:");
        while(ValidacaoCNPJ.validarCNPJ(cnpj) == false){
            cnpj = JOptionPane.showInputDialog("CNPJ digitado no formato incorreto, digite novamente (##.###.###/####-##)");
        }
        while(VerificaFornecedorCNPJ.verificaCNPJ(fornecedores, cnpj) == true){
            cnpj = JOptionPane.showInputDialog("Esse CNPJ já existe, digite um CNPJ diferente:\n");
        }    
        String razaoSocial = JOptionPane.showInputDialog("Digite a Razão Social do Fornecedor:");
        String nomeFantasia = JOptionPane.showInputDialog("Digite o Nome Fantasia do Fornecedor:");
        String telefone = JOptionPane.showInputDialog("Digite o Telefone do Fornecedor:");
        while(ValidacaoTelefone.validarFone(telefone) == false){
            telefone = JOptionPane.showInputDialog("Número de Telefone digitado no formato incorreto, digite novamente ((##)#####-#### ou (##)####-####)");
        }
        String cep = JOptionPane.showInputDialog("Digite o CEP da localização do Fornecedor:");
        while(ValidacaoCEP.validarCEP(cep) == false){
            cep = JOptionPane.showInputDialog("CEP digitado no formato incorreto, digite novamente (#####-###)");
        }
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Imóvel:"));
        String complemento = JOptionPane.showInputDialog("Complemento (Opcional):");
        Endereco endereco = CadastrarEndereco.cadastraEndereco(cep, numero, complemento);
        String eMail = JOptionPane.showInputDialog("Digite o eMail do Fornecedor:");
        while(ValidacaoEmail.validarEmail(eMail) == false){
            eMail = JOptionPane.showInputDialog("E-mail inválido, digite um e-mail válido:");
        }
        Fornecedor fornecedor = new Fornecedor(cnpj, razaoSocial, nomeFantasia, telefone, endereco, eMail);
        AddFornecedor.cadastraFornecedor(fornecedores, fornecedor);
        JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com Sucesso!!!");
    }
}
    
