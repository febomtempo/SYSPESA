/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import acoesEntrada.Acao;
import acoesEntrada.menus.MenuRelatorioDataTiposJOption;
import acoesEntrada.menus.MenuRelatorioTiposJOption;
import acoesEntrada.relatorios.RelatorioDataJOption;

/**
 *
 * @author Notebook
 */

//Enum para o menu de relatórios.

public enum MenuRelatorio implements Menu{
    DATA("Por Ano e Mês", new RelatorioDataJOption()),
    TIPO ("Por Tipo de Despesa", new MenuRelatorioTiposJOption()),
    DATA_E_TIPO("Por Ano/Mes e Tipo", new MenuRelatorioDataTiposJOption());
    
    private String item;
    private Acao acao;

    private MenuRelatorio(String item, Acao acao) {
        this.item = item;
        this.acao = acao;
    }
    
    

    @Override
    public String getItem() {
        return item;
    }

    @Override
    public Acao getAcao() {
        return acao;
    }
}
