/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoesEntrada.menus;

import acoesEntrada.Acao;
import despesas.Despesa;
import fornecedores.Fornecedor;
import java.util.List;
import javax.swing.JOptionPane;
import menus.MenuRelatorioDataTipos;
import menus.MenuToString;

/**
 *
 * @author Notebook
 */

//Menu de Relatórios por Data e Tipo que recebe o valor digitado pelo usuário e verifica o valor do enum pelo MenuToString.
//Após comparar, a ação desejada é feita.

public class MenuRelatorioDataTiposJOption implements Acao{

    @Override
    public void acao(List<Despesa> despesas, List<Fornecedor> fornecedores) {
        int op = Integer.parseInt(JOptionPane.showInputDialog(MenuToString.menuToString(MenuRelatorioDataTipos.values()) + "\nDigite a opção desejada:"));
        MenuRelatorioDataTipos item = MenuRelatorioDataTipos.values()[op-1];
        item.getAcao().acao(despesas, fornecedores);
    }
    
}
