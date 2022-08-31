/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacoes;

/**
 *
 * @author Notebook
 */
public class ValidacaoEmail {
    
//Valida se o email é uma sequência de caracteres alfabéticos minúsculos, números, "_" ou
//"-",  seguido  de  @,  seguido  de  uma  sequência  de  caracteres  alfabéticos
//minúsculos,  números,  "_"  ou  "-",  e,  por  fim,  uma  sequência  de  "."  e  três
//caracteres  alfabéticos  minúsculos,  ou  "."  e  dois  caracteres  alfabéticos
//minúsculos, ou ".", três caracteres alfabéticos minúsculos, "." e dois caracteres
//alfabéticos minúsculos.

    
    public static boolean validarEmail(String eMail){
        
        eMail = eMail.trim();
        return eMail.matches("[0-9a-z_-]*@[0-9a-z_-]+[.][a-z]{2,3}([.][a-z]{2})?");
       
    }
}
