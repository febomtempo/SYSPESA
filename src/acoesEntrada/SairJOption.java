/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoesEntrada;

import despesas.Despesa;
import fornecedores.Fornecedor;
import io.GravarDados;
import io.Leitor_Gravador_Objeto;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Notebook
 */
public class SairJOption implements Acao{

    //Sai do sistema exibindo uma mensagem "Saindo...", salvando os fornecedores e as despesas.
    
    @Override
    public void acao(List<Despesa> despesas, List<Fornecedor> fornecedores)  {
        JOptionPane.showMessageDialog(null, "Saindo...");
        try {
            GravarDados.gravarDespesas(new Leitor_Gravador_Objeto(), despesas);
        } catch (IOException ex) {
            Logger.getLogger(SairJOption.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            GravarDados.gravarFornecedores(new Leitor_Gravador_Objeto(), fornecedores);
        } catch (IOException ex) {
            Logger.getLogger(SairJOption.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }
    
}
