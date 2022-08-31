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
public class CarregarDados {
    public static List<Despesa> carregarDespesas(Leitura_Gravacao arq) throws IOException, ClassNotFoundException{
        return arq.lerDespesas();
    }
    public static List<Fornecedor> carregarFornecedores(Leitura_Gravacao arq) throws IOException, ClassNotFoundException{
        return arq.lerFornecedores();
    }
}
