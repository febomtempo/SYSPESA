/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

/**
 *
 * @author Notebook
 */
public class MenuToString {
    
    //Pega os valores de cada Menu para exibir na tela.
    
   
    public static String menuToString(Menu[] descricoes){
        String saida = "";
        int cont = 1;
        for(Menu d : descricoes){
            saida += cont + " - " + d.getItem() + "\n";            
            cont++;
        }
        return saida;
    }
}
