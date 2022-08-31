/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoesEntrada.menus;

import javax.swing.JOptionPane;
import menus.MenuPrincipal;
import menus.MenuToString;

/**
 *
 * @author Notebook
 */

//Menu Principal que recebe o valor digitado pelo usuário e verifica o valor do enum pelo MenuToString.
//Após comparar, a ação desejada é feita.

public class MenuPrincipalJOption {
    public int escolherOp(){
        int op = Integer.parseInt(JOptionPane.showInputDialog(MenuToString.menuToString(MenuPrincipal.values()) + "\nDigite a opção desejada:"));
        return op;
    }   
}
