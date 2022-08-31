/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import acoesEntrada.Acao;

/**
 *
 * @author Notebook
 */

//Interface Menu contendo um item (Descreve do que se trata a opção do Menu) 
// e uma ação (Executa a tarefa desejada) e que será usada nos enums dos outros Menus.

public interface Menu {
    public abstract String getItem();
    public abstract Acao getAcao();
}
