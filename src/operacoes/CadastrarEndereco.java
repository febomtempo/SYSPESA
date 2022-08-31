/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import fornecedores.Endereco;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Notebook
 */

//Após receber um cep, busca os dados de rua, cidade, bairro e estado e cria um novo endereço com esses dados.

public class CadastrarEndereco {
    public static Endereco cadastraEndereco(String cep, int numero, String complemento){
        
        try {
            URL consulta = new URL("http://viacep.com.br/ws/"+ cep.trim() + "/json/");
            Scanner consultor = new Scanner(consulta.openStream());
            StringBuffer resposta = new StringBuffer();
            while(consultor.hasNext()){
                resposta.append(consultor.nextLine().trim());
            }
            
            String strResposta = resposta.toString();
            if(strResposta.contains("erro")){
                return null;
            }else{
                Pattern patRua = Pattern.compile("\"logradouro\": (.+?),");
                Pattern patBairro = Pattern.compile("\"bairro\": (.+?),");
                Pattern patCidade = Pattern.compile("\"localidade\": (.+?),");
                Pattern patEstado = Pattern.compile("\"uf\": (.+?),");
                
                Matcher matcher = patRua.matcher(strResposta);
                matcher.find();
                String rua = matcher.group();
                rua = rua.split(": ")[1];
                rua = rua.substring(1, rua.length() - 2);
                
                matcher = patBairro.matcher(strResposta);
                matcher.find();
                String bairro = matcher.group();
                bairro = bairro.split(": ")[1];
                bairro = bairro.substring(1, bairro.length() - 2);
                
                matcher = patCidade.matcher(strResposta);
                matcher.find();
                String cidade = matcher.group();
                cidade = cidade.split(": ")[1];
                cidade = cidade.substring(1, cidade.length() - 2);
                
                matcher = patEstado.matcher(strResposta);
                matcher.find();
                String estado = matcher.group();
                estado = estado.split(": ")[1];
                estado = estado.substring(1, estado.length() - 2);
                
                Endereco endereco = new Endereco(cep, rua, cidade, bairro, estado, numero, complemento);
                consultor.close();
                return endereco;
            }
        } catch (IOException ex) {
            return null;
        }
        
    }
}
