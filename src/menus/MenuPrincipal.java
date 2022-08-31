/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import acoesEntrada.CadastrarFornecedorJOption;
import acoesEntrada.Acao;
import acoesEntrada.menus.MenuDespesaJOption;
import acoesEntrada.menus.MenuRelatorioJOption;
import acoesEntrada.SairJOption;

/**
 *
 * @author Notebook
 */

//Enum para o menu principal.

public enum MenuPrincipal implements Menu{
    LANCAR_DESPESAS("Lançar despesas", new MenuDespesaJOption()),
    CADASTRAR_FORNECEDOR("Cadastrar fornecedores", new CadastrarFornecedorJOption()),
    RELATORIO_DESPESAS("Relatórios", new MenuRelatorioJOption()),
    SAIR("Sair", new SairJOption());
    
    private String item;
    private Acao acao;

    private MenuPrincipal(String item, Acao acao) {
        this.item = item;
        this.acao = acao;
    }

    @Override
    public String getItem() {
        return item;
    }
    
    @Override
    public Acao getAcao(){
        return acao;
    }
   
}
