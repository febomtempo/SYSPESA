/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import acoesEntrada.Acao;
import acoesEntrada.LancarAguaJOption;
import acoesEntrada.LancarEnergiaJOption;
import acoesEntrada.LancarProdutoJOption;
import acoesEntrada.LancarServicoJOption;

/**
 *
 * @author Notebook
 */

//Enum para o Menu de despesas.

public enum MenuDespesa implements Menu{
    ENERGIA("Despesa de Energia", new LancarEnergiaJOption()),
    AGUA("Despesa de Água", new LancarAguaJOption()),
    SERVICOS("Despesa de Serviços", new LancarServicoJOption()),
    PRODUTOS("Despesa de Produtos", new LancarProdutoJOption());
    
    private String item;
    private Acao acao;

    private MenuDespesa(String item, Acao acao) {
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
