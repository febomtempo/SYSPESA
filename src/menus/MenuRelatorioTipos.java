/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import acoesEntrada.Acao;
import acoesEntrada.relatorios.RelatorioTipoAguaJOption;
import acoesEntrada.relatorios.RelatorioTipoEnergiaJOption;
import acoesEntrada.relatorios.RelatorioTipoProdutoJOption;
import acoesEntrada.relatorios.RelatorioTipoServicoJOption;

/**
 *
 * @author Notebook
 */

//Enum para o menu de relatório por tipo de despesa.

public enum MenuRelatorioTipos implements Menu{
    ENERGIA("Despesa de Energia", new RelatorioTipoEnergiaJOption()),
    AGUA("Despesa de Água", new RelatorioTipoAguaJOption()),
    SERVICOS("Despesa de Serviços", new RelatorioTipoServicoJOption()),
    PRODUTOS("Despesa de Produtos", new RelatorioTipoProdutoJOption());
    
    private String item;
    private Acao acao;

    private MenuRelatorioTipos(String item, Acao acao) {
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

