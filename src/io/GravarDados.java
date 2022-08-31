/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import despesas.Despesa;
import fornecedores.Fornecedor;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Notebook
 */
public class GravarDados {
    public static void gravarDespesas(Leitura_Gravacao arq, List<Despesa> despesas) throws IOException{
        arq.gravarDespesa(despesas);
    }
    public static void gravarFornecedores(Leitura_Gravacao arq, List<Fornecedor> fornecedores) throws IOException{
        arq.gravarFornecedor(fornecedores);
    }
}
