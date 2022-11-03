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
           if(letra[i]=='A'){
               letraA();
           }else if(letra[i]=='B'){
               letraB();
           }else if(letra[i]=='C'){
               letraC();
           }else if(letra[i]=='D'){
               letraD();
           }else if(letra[i]=='E'){
               letraE();
           }else if(letra[i]=='F'){
               letraF();
           }else if(letra[i]=='G'){
               letraG();
           }else if(letra[i]=='H'){
               letraH();
           }else if(letra[i]=='I'){
               letraI();
           }else if(letra[i]=='J'){
               letraJ();
           }else if(letra[i]=='K'){
               letraK();
           }else if(letra[i]=='L'){
               letraL();
           }else if(letra[i]=='M'){
               letraM();
           }else if(letra[i]=='N'){
               letraN();
           }else if(letra[i]=='P'){
               letraP();
           }else if(letra[i]=='Q'){
               letraQ();
           }else if(letra[i]=='R'){
               letraR();
           }else if(letra[i]=='S'){
               letraS();
           }else if(letra[i]=='T'){
               letraT();
           }else if(letra[i]=='U'){
               letraU();
           }else if(letra[i]=='V'){
               letraV();
           }else if(letra[i]=='W'){
               letraW();
           }else if(letra[i]=='X'){
               letraX();
           }else if(letra[i]=='Y'){
               letraY();
           }else if(letra[i]=='Z'){
               letraZ();
           }
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
        char[][]letraG = {{'G','G','G','G','G'},
                          {'G',' ',' ',' ',' '},
                          {'G',' ',' ','G','G'},
                          {'G',' ',' ',' ','G'},
                          {'G','G','G','G','G'}};
        return letraG;
    }
    public static char[][] letraH(){
        char[][]letraH = {{'H',' ',' ',' ','H'},
                          {'H',' ',' ',' ','H'},
                          {'H','H','H','H','H'},
                          {'H',' ',' ',' ','H'},
                          {'H',' ',' ',' ','H'}};
        return letraH;
    }
    public static char[][] letraI(){
        char[][]letraI = {{' ','I','I','I',' '},
                          {' ',' ','I',' ',' '},
                          {' ',' ','I',' ',' '},
                          {' ',' ','I',' ',' '},
                          {' ','I','I','I',' '}};
        return letraI;
    }
    public static char[][] letraJ(){
        char[][]letraJ = {{' ',' ','J','J','J'},
                          {' ',' ',' ','J',' '},
                          {' ',' ',' ','J',' '},
                          {'J',' ',' ','J',' '},
                          {'J','J','J','J',' '}};
        return letraJ;
    }
    public static char[][] letraK(){
        char[][]letraK = {{'K',' ',' ',' ','K'},
                          {'K',' ',' ','K',' '},
                          {'K','K','K',' ',' '},
                          {'K',' ',' ','K',' '},
                          {'K',' ',' ',' ','K'}};
           return letraK;
    }
    public static char[][] letraL(){
        char[][]letraL = {{'L',' ',' ',' ',' '},
                          {'L',' ',' ',' ',' '},
                          {'L',' ',' ',' ',' '},
                          {'L',' ',' ',' ',' '},
                          {'L','L','L','L','L'}};  
        return letraL;
    }
    public static char[][] letraM(){
        char[][]letraM = {{'M','M',' ','M','M'},
                          {'M','M','M','M','M'},
                          {'M',' ','M',' ','M'},
                          {'M',' ',' ',' ','M'},
                          {'M',' ',' ',' ','M'}};  
        return letraM;
    }
    public static char[][] letraN(){
        char[][]letraN = {{'N',' ',' ',' ','N'},
                          {'N','N',' ',' ','N'},
                          {'N',' ','N',' ','N'},
                          {'N',' ',' ','N','N'},
                          {'N',' ',' ',' ','N'}};  
        return letraN;
    }
    public static char[][] letraO(){
        char[][]letraO = {{' ','O','O','O',' '},
                          {'O',' ',' ',' ','O'},
                          {'O',' ',' ',' ','O'},
                          {'O',' ',' ',' ','O'},
                          {' ','O','O','O',' '}}; 
        return letraO;
    }
    public static char[][] letraP(){
       char[][]letraP = {{'P','P','P','P',' '},
                          {'P',' ',' ',' ','P'},
                          {'P','P','P','P',' '},
                          {'P',' ',' ',' ',' '},
                          {'P',' ',' ',' ',' '}};
        return letraP;
    }
    public static char[][] letraQ(){
        char[][]letraG = {{'Q','Q','Q','Q','Q'},
                          {'Q',' ',' ',' ','Q'},
                          {'Q',' ',' ',' ','Q'},
                          {'Q','Q','Q','Q','Q'},
                          {' ',' ',' ',' ','Q'}};
        return letraG;
    }
    public static char[][] letraR(){
        char[][]letraR = {{'R','R','R',' ',' '},
                          {'R',' ',' ','R',' '},
                          {'R','R','R',' ',' '},
                          {'R',' ','R',' ',' '},
                          {'R',' ',' ','R',' '}};
        return letraR;
    }
    public static char[][] letraS(){
        char[][]letraS = {{'S','S','S','S','S'},
                          {'S',' ',' ',' ' ,' '},
                          {'S','S','S','S','S'},
                          {' ',' ',' ',' ','S'},
                          {'S','S','S','S','S'}};
        return letraS;
    }
    public static char[][] letraT(){
        char[][]letraT = {{'T','T','T','T','T'},
                          {' ',' ','T',' ',' '},
                          {' ',' ','T',' ',' '},
                          {' ',' ','T',' ',' '},
                          {' ',' ','T',' ',' '}};
        return letraT;
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
