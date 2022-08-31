/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import despesas.Despesa;
import fornecedores.Fornecedor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import operacoes.FormatarArquivo;

/**
 *
 * @author Notebook
 */
public class Leitor_Gravador_Objeto implements Leitura_Gravacao {

    //Seleciona o diretório Despesas dentro da pasta do programa, caso não exista, o diretório é criado.
    //Após isso, ocorre a gravação do arquivo com o formato de ano-mes.txt.
    
    public void gravarDespesa(List<Despesa> despesas) throws IOException {
        File dir = new File("./Despesas");
        if (!dir.exists()) {
            dir.mkdir();
        }
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("./Despesas/" + FormatarArquivo.formatarArquivo(despesas)+ ".txt"));
            out.writeObject(despesas);
        } catch (IOException ex) {
            throw new IOException();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                throw new IOException();
            }
        }
    }
    
    //Seleciona o diretório Fornecedores dentro da pasta do programa, caso não exista, o diretório é criado.
    //Após isso, ocorre a gravação do arquivo com o nome fornecedores.txt.
    
    public void gravarFornecedor(List<Fornecedor> fornecedores) throws IOException {
        File dir = new File("./Fornecedores");
        if (!dir.exists()) {
            dir.mkdir();
        }
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("./Fornecedores/fornecedores.txt"));
            out.writeObject(fornecedores);
        } catch (IOException ex) {
            throw new IOException();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                throw new IOException();
            }
        }
    }

    //Procura pelo diretório Despesas e caso não exista retorna null.
    //Um vetor é criado e recebe a lista de arquivos dentro da Pasta despesas.
    //O programa passa por todos os arquivos e faz a leitura de todos. 
    
    public List<Despesa> lerDespesas() throws IOException, ClassNotFoundException {
        ArrayList<Despesa> despesas = null;
        File dir = new File("./Despesas/");
        if (!dir.exists()) {
            return null;
        }
        File[] arquivos = dir.listFiles();
        for (File arq : arquivos) {
            ObjectInputStream in = null;

            try {
                in = new ObjectInputStream(new FileInputStream(arq));
                despesas = (ArrayList<Despesa>) in.readObject();
            } catch (IOException ex) {
                throw new IOException();
            } finally {
                try {
                    in.close();
                } catch (IOException ex) {
                    throw new IOException();
                }
            }
            
        }
        return despesas;
    }
    
    //Procura e lê o arquivo fornecedores.txt no diretório Fornecedores, caso não exista, retorna null.
    
    
    public List<Fornecedor> lerFornecedores() throws IOException, ClassNotFoundException {
        File arq = new File("./Fornecedores/fornecedores.txt");
        if (!arq.exists()) {
            return null;
        }
        ObjectInputStream in = null;
        ArrayList<Fornecedor> fornecedores = null;
        try {
            in = new ObjectInputStream(new FileInputStream(arq));
            fornecedores = (ArrayList<Fornecedor>) in.readObject();
        } catch (IOException ex) {
            throw new IOException();
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                throw new IOException();
            }
        }
        return fornecedores;
    }    
}
