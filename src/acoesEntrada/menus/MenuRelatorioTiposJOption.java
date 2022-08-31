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
import menus.MenuRelatorioTipos;
import menus.MenuToString;

/**
 *
 * @author Notebook
 */
public class MenuRelatorioTiposJOption implements Acao{

    //Menu de Relatórios por Tipo que que recebe o valor digitado pelo usuário e verifica o valor do enum pelo MenuToString.
    //Após comparar, a ação desejada é feita.
    
    @Override
    public void acao(List<Despesa> despesas, List<Fornecedor> fornecedores) {
        int op = Integer.parseInt(JOptionPane.showInputDialog(MenuToString.menuToString(MenuRelatorioTipos.values()) + "\nDigite a opção desejada:"));
        MenuRelatorioTipos item = MenuRelatorioTipos.values()[op-1];
        item.getAcao().acao(despesas, fornecedores);
    }
    
}
