/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syspesa;

import fornecedores.Fornecedor;
import acoesEntrada.menus.MenuPrincipalJOption;
import despesas.Despesa;
import io.CarregarDados;
import io.Leitor_Gravador_Objeto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import menus.MenuPrincipal;





/**
 *
 * @author Notebook
 */
public class SYSPESA {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        //Carrega os dados de despesas e fornecedores ao iniciar o programa.
        
        List<Despesa> despesas = CarregarDados.carregarDespesas(new Leitor_Gravador_Objeto());
        if (despesas == null) {
            despesas = new ArrayList<Despesa>();
        }
        List<Fornecedor> fornecedores = CarregarDados.carregarFornecedores(new Leitor_Gravador_Objeto());
        if (fornecedores == null) {
            fornecedores = new ArrayList<Fornecedor>();
        }
        
        //Menu Principal
        
        boolean sair = false;
        MenuPrincipalJOption operacoes = new MenuPrincipalJOption();

        while (sair == false) {
            try {
                int op = operacoes.escolherOp();

                MenuPrincipal item = MenuPrincipal.values()[op - 1];
                item.getAcao().acao(despesas, fornecedores);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Valor Inválido, digite um valor válido!!!");

            }
        }
    }
}
   

