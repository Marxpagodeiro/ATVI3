/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade3marcos;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Atividade3marcos {

    public static void main(String[] args) {
      String usuario = frase("Qual a frase você deseja ver grande?");
      System.out.println(usuario);
      char[] letra = usuario.toCharArray();// char de converção da frase de String para char.
      int Ta =letra.length;
      System.out.println(Ta);
      
      for(int i =0;i<letra.length;i++){
          System.out.print(letra[i]+"-");
      }
        
    }
    public static String frase(String texto){
        Scanner in = new Scanner(System.in);
        String resp;
        System.out.println(texto);
        resp=in.nextLine();
        return resp;
        
        
    }
}
