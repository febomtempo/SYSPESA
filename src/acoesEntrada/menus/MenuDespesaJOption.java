/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoesEntrada.menus;

import acoesEntrada.Acao;
import despesas.Despesa;
import java.util.List;
import javax.swing.JOptionPane;
import menus.MenuDespesa;
import menus.MenuToString;
import fornecedores.Fornecedor;
import operacoes.VerificaExistenciaFornecedor;

/**
 *
 * @author Notebook 
 */
public class MenuDespesaJOption implements Acao{
    
//Menu de despesa que após verificar a existência de um fornecedor, recebe o valor digitado pelo usuário 
//e verifica o valor do enum pelo MenuToString. Após comparar, a ação desejada é feita.
    
    @Override
    public void acao(List<Despesa> despesas, List<Fornecedor> fornecedores) {
        if (VerificaExistenciaFornecedor.verificaFornecedorExiste(fornecedores) == false) {
            JOptionPane.showMessageDialog(null, "É necessário cadastrar um Fornecedor antes de lançar uma Despesa!!!");
        } else {
            int op = Integer.parseInt(JOptionPane.showInputDialog(MenuToString.menuToString(MenuDespesa.values()) + "\nDigite a opção desejada:"));
            MenuDespesa item = MenuDespesa.values()[op - 1];
            item.getAcao().acao(despesas, fornecedores);
        }
    }

}
