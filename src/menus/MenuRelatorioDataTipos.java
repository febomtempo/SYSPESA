/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import acoesEntrada.Acao;
import acoesEntrada.relatorios.RelatorioDataTipoAguaJOption;
import acoesEntrada.relatorios.RelatorioDataTipoEnergiaJOption;
import acoesEntrada.relatorios.RelatorioDataTipoProdutoJOption;
import acoesEntrada.relatorios.RelatorioDataTipoServicoJOption;

/**
 *
 * @author Notebook
 */

//Enum para o menu de relatórios por data e tipo de despesa.

public enum MenuRelatorioDataTipos implements Menu{

    ENERGIA("Despesa de Energia", new RelatorioDataTipoEnergiaJOption()),
    AGUA("Despesa de Água", new RelatorioDataTipoAguaJOption()),
    SERVICOS("Despesa de Serviços", new RelatorioDataTipoServicoJOption()),
    PRODUTOS("Despesa de Produtos", new RelatorioDataTipoProdutoJOption());
    
    private String item;
    private Acao acao;

    private MenuRelatorioDataTipos(String item, Acao acao) {
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