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
        Scanner in = new Scanner (System.in); // Importação do Scanner
        
        String f1 = "Digite uma palavra para ficar gigante:";
        String palavra; // Criei a string palavra sem definir o valor da mesma
        
        System.out.println(f1); // Pede para o usuário digitar uma frase
        palavra = in.nextLine().toUpperCase(); // O que o usuário digitar vai renomear a String "Palavra", e o ".toUpperCase()" vai deixar todas as letras maiúsculas
        System.out.println(" "); // Espaço para não embolar com as letras gigantes
        
        char[] letra = palavra.toCharArray();//converte String para char
        
        int tmn =letra.length * 5; // O int TMN é o tamanho da frase/palavra
        int tam=letra.length;    
           System.out.println(tmn); // Imprime o tamanho
                
        for(int i = 0;i<letra.length;i++){ // repete até terminar todas as letras
           // System.out.print (letra[i]+"-"); // Separa todas as letras assim: A-R-R-O-Z
        }
       
    }
   
     
    
    

    public static char[][] letraA(){
        char[][]letraA = {{' ',' ','A',' ',' '},
                          {' ','A',' ','A',' '},
                          {'A','A','A','A','A'},
                          {'A',' ',' ',' ','A'},
                          {'A',' ',' ',' ','A'}};
        return letraA;
        }
    public static char[][] letraB(){
        char[][]letraB = {{'B','B','B','B',' '},
                         {'B',' ',' ',' ','B'},
                         {'B','B','B','B','B'},
                         {'B',' ',' ',' ','B'},
                         {'B','B','B','B',' '}};
        return letraB;
    }
    public static char[][] letraC(){
        char[][]letraC ={{'C','C','C','C','C'},
                         {'C',' ',' ',' ',' '},
                         {'C',' ',' ',' ',' '},
                         {'C',' ',' ',' ',' '},
                         {'C','C','C','C','C'}};
        return letraC;
    }
    public static char[][] letraD(){
        char[][]letraD = {{'D','D','D','D',' '},
                          {'D',' ',' ',' ','D'},
                          {'D',' ',' ',' ','D'},
                          {'D',' ',' ',' ','D'},
                          {'D','D','D','D',' '}};
        return letraD;
    }
    public static char[][] letraE(){
        char[][]letraE = {{'E','E','E','E','E'},
                          {'E',' ',' ',' ',' '},
                          {'E','E','E','E','E'},
                          {'E',' ',' ',' ',' '},
                          {'E','E','E','E','E'}};
        return letraE;
    }
    public static char[][] letraF(){
        char[][]letraF = {{'F','F','F','F','F'},
                          {'F',' ',' ',' ',' '},
                          {'F','F','F','F',' '},
                          {'F',' ',' ',' ',' '},
                          {'F',' ',' ',' ',' '}};
        return letraF;
    }
    public static char[][] letraG(){
        char [][] resp = new char[5][];
        char[][]letraG = {{'G','G','G','G','G'},
                          {'G',' ',' ',' ',' '},
                          {'G',' ',' ','G','G'},
                          {'G',' ',' ',' ','G'},
                          {'G','G','G','G','G'}};
           resp = letraG;
           return resp;
    }
    public static char[][] letraH(){
        char [][] resp = new char[5][];
        char[][]letraG = {{'H',' ',' ',' ','H'},
                          {'H',' ',' ',' ','H'},
                          {'H','H','H','H','H'},
                          {'H',' ',' ',' ','H'},
                          {'H',' ',' ',' ','H'}};
           resp = letraG;
           return resp;
    }
    public static char[][] letraI(){
        char [][] resp = new char[5][];
        char[][]letraG = {{' ','I','I','I',' '},
                          {' ',' ','I',' ',' '},
                          {' ',' ','I',' ',' '},
                          {' ',' ','I',' ',' '},
                          {' ','I','I','I',' '}};
           resp = letraG;
           return resp;
    }
    public static char[][] letraJ(){
        char [][] resp = new char[5][];
        char[][]letraG = {{' ',' ','J','J','J'},
                          {' ',' ',' ','J',' '},
                          {' ',' ',' ','J',' '},
                          {'J',' ',' ','J',' '},
                          {'J','J','J','J',' '}};
           resp = letraG;
           return resp;
    }
    public static char[][] letraK(){
        char [][] resp = new char[5][];
        char[][]letraG = {{'K',' ',' ',' ','K'},
                          {'K',' ',' ','K',' '},
                          {'K','K','K',' ',' '},
                          {'K',' ',' ','K',' '},
                          {'K',' ',' ',' ','K'}};
           resp = letraG;
           return resp;
    }
    public static char[][] letraL(){
        char [][] resp = new char[5][];
        char[][]letraG = {{'L',' ',' ',' ',' '},
                          {'L',' ',' ',' ',' '},
                          {'L',' ',' ',' ',' '},
                          {'L',' ',' ',' ',' '},
                          {'L','L','L','L','L'}};  
        resp = letraG;
        return resp;
    }
    public static char[][] letraM(){
        char [][] resp = new char[5][];
        char[][]letraG = {{'M','M',' ','M','M'},
                          {'M','M','M','M','M'},
                          {'M',' ','M',' ','M'},
                          {'M',' ',' ',' ','M'},
                          {'M',' ',' ',' ','M'}};  
        resp = letraG;
        return resp;
    }
    public static char[][] letraN(){
        char [][] resp = new char[5][];
        char[][]letraG = {{'N',' ',' ',' ','N'},
                          {'N','N',' ',' ','N'},
                          {'N',' ','N',' ','N'},
                          {'N',' ',' ','N','N'},
                          {'N',' ',' ',' ','N'}
                          };  
        resp = letraG;
        return resp;
    }
    public static char[][] letraO(){
        char [][] resp = new char[5][];
        char[][]letraG = {{' ','O','O','O',' '},
                          {'O',' ',' ',' ','O'},
                          {'O',' ',' ',' ','O'},
                          {'O',' ',' ',' ','O'},
                          {' ','O','O','O',' '}}; 
        resp = letraG;
        return resp;
    }
    public static char[][] letraP(){
        char [][] resp = new char[5][];
        char[][]letraG = {{'P','P','P','P',' '},
                          {'P',' ',' ',' ','P'},
                          {'P','P','P','P',' '},
                          {'P',' ',' ',' ',' '},
                          {'P',' ',' ',' ',' '}};
        resp = letraG;
        return resp;
    }
    public static char[][] letraQ(){
        char [][] resp = new char[5][];
        char[][]letraG = {{'Q','Q','Q','Q','Q'},
                          {'Q',' ',' ',' ','Q'},
                          {'Q',' ',' ',' ','Q'},
                          {'Q','Q','Q','Q','Q'},
                          {' ',' ',' ',' ','Q'}};
        resp = letraG;
        return resp;
    }
    public static char[][] letraR(){
        char [][] resp = new char[5][];
        char[][]letraG = {{'R','R','R','R',' '},
                          {'R',' ',' ',' ','R'},
                          {'R','R','R','R',' '},
                          {'R','R',' ',' ',' '},
                          {'R',' ','R',' ',' '}};
        resp = letraG;
        return resp;
    }
    public static char[][] letraS(){
        char [][] resp = new char[5][];
        char[][]letraG = {{'S','S','S','S','S'},
                          {'S',' ',' ',' ' ,' '},
                          {'S','S','S','S','S'},
                          {' ',' ',' ',' ','S'},
                          {'S','S','S','S','S'}};
        resp = letraG;
        return resp;
    }
    public static char[][] letraT(){
        char [][] resp = new char[5][];
        char[][]letraG = {{'T','T','T','T','T'},
                          {' ',' ','T',' ',' '},
                          {' ',' ','T',' ',' '},
                          {' ',' ','T',' ',' '},
                          {' ',' ','T',' ',' '}};
        resp = letraG;
        return resp;
    }
    public static char[][] letraU(){
        char[][]letraU = {{'U',' ',' ',' ','U'},
                          {'U',' ',' ',' ','U'},
                          {'U',' ',' ',' ','U'},
                          {'U',' ',' ',' ','U'},
                          {'U','U','U','U','U'}};
        return letraU;
    }
    public static char[][] letraV(){
        char[][]letraV = {{'V',' ',' ',' ','V'},
                          {'V',' ',' ',' ','V'},
                          {' ','V',' ','V',' '},
                          {' ',' ','V',' ',' '},
                          {' ',' ','V',' ',' '}};
        return letraV;
    }
    public static char[][] letraW(){
        char[][]letraW = {{'W',' ',' ',' ','W'},
                          {'W',' ',' ',' ','W'},
                          {'W',' ','W',' ','W'},
                          {'W','W',' ','W','W'},
                          {'W',' ',' ',' ','W'}};
        return letraW;
    }
    public static char[][] letraX(){
        char[][]letraX = {{'X',' ',' ',' ','X'},
                          {' ','X',' ','X',' '},
                          {' ',' ','X',' ',' '},
                          {' ','X',' ','X',' '},
                          {'X',' ',' ',' ','X'}};
        return letraX;
    }
    public static char[][] letraY(){
        char[][]letraY = {{'Y',' ',' ',' ','Y'},
                          {' ','Y',' ','Y',' '},
                          {' ',' ','Y',' ',' '},
                          {' ','Y',' ',' ',' '},
                          {'Y',' ',' ',' ',' '}};
        return letraY;
    }
    public static char[][] letraZ(){
        char[][]letraZ = {{'Z','Z','Z','Z','Z'},
                          {' ',' ',' ','Z',' '},
                          {' ',' ','Z',' ',' '},
                          {' ','Z',' ',' ',' '},
                          {'Z','Z','Z','Z','Z'}};
        return letraZ;
    }
    
    
    
}
