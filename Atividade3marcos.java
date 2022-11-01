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
      char[][] letraG = letraG(letra);
      for(int i=0;i<=5;i++){
          System.out.println(letraG[i]);
      }
      
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
    public static char[][] letraG(char[] letra){
        char [][] resp = new char[5][5];
        for(int i=0;i<letra.length;i++){
        if(letra[i] == 'A'){
           char[][]letraG = {{' ',' ','A',' ',' ',},
                              {' ','A',' ','A',' ',},
                              {'A','A','A','A','A'},
                              {'A',' ',' ',' ','A'},
                              {'A',' ',' ',' ','A'}
                              };
           resp = letraG;
        }
        if(letra[i] == 'B'){
           char[][] letraG = {{'B','B','B','B','B',},
                              {'B',' ',' ',' ','B',},
                              {'B','B','B','B','B'},
                              {'B',' ',' ',' ','B'},
                              {'B','B','B','B','B'}
                             };
           resp = letraG;
        }
        if(letra[i] == 'C'){
           char[][] letraG = {{'C','C','C','C','C',},
                              {'C',' ',' ',' ',' ',},
                              {'C',' ',' ',' ',' '},
                              {'C',' ',' ',' ',' '},
                              {'C','C','C','C','C'}
                             };
           resp = letraG;
        }
        if(letra[i] == 'D'){
           char[][] letraG = {{'D','D','D','D','D',},
                              {'D',' ',' ',' ','D',},
                              {'D',' ',' ',' ','D'},
                              {'D',' ',' ',' ','D'},
                              {'D','D','D','D','D'}
                             };
           resp = letraG;
        }
        if(letra[i] == 'E'){
           char[][] letraG = {{'E','E','E','E','E',},
                              {'E',' ',' ',' ',' ',},
                              {'E','E','E','E','E'},
                              {'E',' ',' ',' ',' '},
                              {'E','E','E','E','E'}
                             };
           resp = letraG;
        }
        if(letra[i] == 'F'){
           char[][] letraG = {{'F','F','F','F','F',},
                              {'F',' ',' ',' ',' ',},
                              {'F','F','F','F',' '},
                              {'F',' ',' ',' ',' '},
                              {'F',' ',' ',' ',' '}
                             };
           resp = letraG;
        }
        if(letra[i] == 'G'){
           char[][] letraG = {{'G','G','G','G','G',},
                              {'G',' ',' ',' ',' ',},
                              {'G',' ',' ','G','G'},
                              {'G',' ',' ',' ','G'},
                              {'G','G','G','G','G'}
                             };
           resp = letraG;
        }
        if(letra[i] == 'H'){
           char[][] letraG = {{'H',' ',' ',' ','H',},
                              {'H',' ',' ',' ','H',},
                              {'H','H','H','H','H'},
                              {'H',' ',' ',' ','H'},
                              {'H',' ',' ',' ','H'}
                             };
           resp = letraG;
        }
        if(letra[i] == 'I'){
           char[][] letraG = {{' ','I','I','I',' ',},
                              {' ',' ','I',' ',' ',},
                              {' ',' ','I',' ',' '},
                              {' ',' ','I',' ',' '},
                              {' ','I','I','I',' '}
                             };
           resp = letraG;
        }
        if(letra[i] == 'J'){
           char[][] letraG = {{' ',' ','J','J','J',},
                              {' ',' ',' ','J',' ',},
                              {' ',' ',' ','J',' '},
                              {'J',' ',' ','J',' '},
                              {'J','J','J','J',' '}
                             };
           resp = letraG;
        }
        if(letra[i] == 'K'){
           char[][] letraG = {{'K',' ',' ',' ','K',},
                              {'K',' ',' ','K',' ',},
                              {'K','K','K',' ',' '},
                              {'K',' ',' ','K',' '},
                              {'K',' ',' ',' ','K'}
                             };
           resp = letraG;
        }
        if(letra[i] == 'L'){
           char[][] letraG = {{'L',' ',' ',' ',' ',},
                              {'L',' ',' ',' ',' ',},
                              {'L',' ',' ',' ',' '},
                              {'L',' ',' ',' ',' '},
                              {'L','L','L','L','L'}
                             };
           resp = letraG;
        }
        if(letra[i] == 'M'){
           char[][] letraG = {{'M','M',' ','M','M',},
                              {'M','M','M','M','M',},
                              {'M',' ','M',' ','M'},
                              {'M',' ',' ',' ','M'},
                              {'M',' ',' ',' ','M'}
                             };
           resp = letraG;
        }
        if(letra[i] == 'N'){
           char[][] letraG = {{'N',' ',' ',' ','N',},
                              {'N','N',' ',' ','N',},
                              {'N',' ','N',' ','N'},
                              {'N',' ',' ','N','N'},
                              {'N',' ',' ',' ','N'}
                             };
           resp = letraG;
        }
        if(letra[i] == 'O'){
           char[][] letraG = {{' ','O','O','O',' ',},
                              {'O',' ',' ',' ','O',},
                              {'O',' ',' ',' ','O'},
                              {'O',' ',' ',' ','O'},
                              {' ','O','O','O',' '}
                             };
           resp = letraG;
        }
        if(letra[i] == 'P'){
           char[][] letraG = {{'P','P','P','P',' ',},
                              {'P',' ',' ',' ','P',},
                              {'P','P','P','P',' '},
                              {'P',' ',' ',' ',' '},
                              {'P',' ',' ',' ',' '}
                             };
           resp = letraG;
        }
        
        
        }
        
        return resp;
        
    }
}
