/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativi3;

import java.util.Scanner;

/**
 *
 * @author 20222TPMI0035
 */
public class Ativi3 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner in = new Scanner (System.in); // Importação do Scanner
        
        String f1 = "Digite uma palavra para ficar gigante:";
        String palavra; // Criei a string palavra sem definir o valor da mesma
        
        System.out.println(f1); // Pede para o usuário digitar uma frase
        palavra = in.nextLine().toUpperCase(); // O que o usuário digitar vai renomear a String "Palavra", e o ".toUpperCase()" vai deixar todas as letras maiúsculas
        System.out.println(" "); // Espaço para não embolar com as letras gigantes
        
        char[] letra = palavra.toCharArray();//converte String para char
        
        int tmn =letra.length * 6; // O int TMN é o tamanho da frase/palavra
        int tam=letra.length;    
        int tmnm = 5;
        
        
           System.out.println(tmn); // Imprime o tamanho
         char [][] matrizP = new char[5][];
         char [][] matrizG= new char[5][tmn];
         
         
         
         for(int i = 0;i<letra.length;i++){ 
             
           if(letra[i]=='A'){
             matrizP = letraA();
           }else if(letra[i]=='B'){
              matrizP = letraB();
           }else if(letra[i]=='C'){
              matrizP = letraC();
           }else if(letra[i]=='D'){
              matrizP = letraD();
           }else if(letra[i]=='E'){
              matrizP = letraE();
           }else if(letra[i]=='F'){
              matrizP = letraF();
           }else if(letra[i]=='G'){
              matrizP = letraG();
           }else if(letra[i]=='H'){
              matrizP = letraH();
           }else if(letra[i]=='I'){
              matrizP = letraI();
           }else if(letra[i]=='J'){
              matrizP = letraJ();
           }else if(letra[i]=='K'){
              matrizP = letraK();
           }else if(letra[i]=='L'){
              matrizP = letraL();
           }else if(letra[i]=='M'){
              matrizP = letraM();
           }else if(letra[i]=='N'){
              matrizP = letraN();
           }else if(letra[i]=='O'){
              matrizP = letraO();
           }else if(letra[i]=='P'){
              matrizP = letraP();
           }else if(letra[i]=='Q'){
              matrizP = letraQ();
           }else if(letra[i]=='R'){
              matrizP = letraR();
           }else if(letra[i]=='S'){
              matrizP = letraS();
           }else if(letra[i]=='T'){
              matrizP = letraT();
           }else if(letra[i]=='U'){
              matrizP = letraU();
           }else if(letra[i]=='V'){
              matrizP = letraV();
           }else if(letra[i]=='W'){
              matrizP = letraW();
           }else if(letra[i]=='X'){
              matrizP = letraX();
           }else if(letra[i]=='Y'){
              matrizP = letraY();
           }else if(letra[i]=='Z'){
              matrizP = letraZ();
           }else{
               matrizP = letraEs();
           }
           for(int l=0;l<5;l++){
               for(int c=0;c<6;c++){
               matrizG[l][i*matrizP[0].length+c]=matrizP[l][c];
           }
       }
        }
      for(int i=0;i<5;i++){
          System.out.println(matrizG[i]);
      }  
       
    }
   
    
    public static char[][] letraEs(){
       char[][]letraEs = {{' ',' ',' ',' ',' ',' '},
                          {' ',' ',' ',' ',' ',' '},
                          {' ',' ',' ',' ',' ',' '},
                          {' ',' ',' ',' ',' ',' '},
                          {' ',' ',' ',' ',' ',' '}};
        return letraEs;
     }  
    public static char[][] letraA(){
        char[][]letraA = {{' ',' ','A',' ',' ',' '},
                          {' ','A',' ','A',' ',' '},
                          {'A','A','A','A','A',' '},
                          {'A',' ',' ',' ','A',' '},
                          {'A',' ',' ',' ','A',' '}};
        return letraA;
    }
    public static char[][] letraB(){
        char[][]letraB = {{'B','B','B','B',' ',' '},
                         {'B',' ',' ',' ','B',' '},
                         {'B','B','B','B','B',' '},
                         {'B',' ',' ',' ','B',' '},
                         {'B','B','B','B',' ',' '}};
        return letraB;
    }
    public static char[][] letraC(){
        char[][]letraC ={{'C','C','C','C','C',' '},
                         {'C',' ',' ',' ',' ',' '},
                         {'C',' ',' ',' ',' ',' '},
                         {'C',' ',' ',' ',' ',' '},
                         {'C','C','C','C','C',' '}};
        return letraC;
    }
    public static char[][] letraD(){
        char[][]letraD = {{'D','D','D','D',' ',' '},
                          {'D',' ',' ',' ','D',' '},
                          {'D',' ',' ',' ','D',' '},
                          {'D',' ',' ',' ','D',' '},
                          {'D','D','D','D',' ',' '}};
        return letraD;
    }
    public static char[][] letraE(){
        char[][]letraE = {{'E','E','E','E','E',' '},
                          {'E',' ',' ',' ',' ',' '},
                          {'E','E','E','E','E',' '},
                          {'E',' ',' ',' ',' ',' '},
                          {'E','E','E','E','E',' '}};
        return letraE;
    }
    public static char[][] letraF(){
        char[][]letraF = {{'F','F','F','F','F',' '},
                          {'F',' ',' ',' ',' ',' '},
                          {'F','F','F','F',' ',' '},
                          {'F',' ',' ',' ',' ',' '},
                          {'F',' ',' ',' ',' ',' '}};
        return letraF;
    }
    public static char[][] letraG(){
        char[][]letraG = {{'G','G','G','G','G',' '},
                          {'G',' ',' ',' ',' ',' '},
                          {'G',' ',' ','G','G',' '},
                          {'G',' ',' ',' ','G',' '},
                          {'G','G','G','G','G',' '}};
        return letraG;
    }
    public static char[][] letraH(){
        char[][]letraH = {{'H',' ',' ',' ','H',' '},
                          {'H',' ',' ',' ','H',' '},
                          {'H','H','H','H','H',' '},
                          {'H',' ',' ',' ','H',' '},
                          {'H',' ',' ',' ','H',' '}};
        return letraH;
    }
    public static char[][] letraI(){
        char[][]letraI = {{'I','I','I','I','I',' '},
                          {' ',' ','I',' ',' ',' '},
                          {' ',' ','I',' ',' ',' '},
                          {' ',' ','I',' ',' ',' '},
                          {'I','I','I','I','I',' '}};
        return letraI;
    }
    public static char[][] letraJ(){
        char[][]letraJ = {{' ',' ','J','J','J',' '},
                          {' ',' ',' ','J',' ',' '},
                          {' ',' ',' ','J',' ',' '},
                          {'J',' ',' ','J',' ',' '},
                          {'J','J','J','J',' ',' '}};
        return letraJ;
    }
    public static char[][] letraK(){
        char[][]letraK = {{'K',' ',' ',' ','K',' '},
                          {'K',' ',' ','K',' ',' '},
                          {'K','K','K',' ',' ',' '},
                          {'K',' ',' ','K',' ',' '},
                          {'K',' ',' ',' ','K',' '}};
           return letraK;
    }
    public static char[][] letraL(){
        char[][]letraL = {{'L',' ',' ',' ',' ',' '},
                          {'L',' ',' ',' ',' ',' '},
                          {'L',' ',' ',' ',' ',' '},
                          {'L',' ',' ',' ',' ',' '},
                          {'L','L','L','L','L',' '}};  
        return letraL;
    }
    public static char[][] letraM(){
        char[][]letraM = {{'M','M',' ','M','M',' '},
                          {'M','M','M','M','M',' '},
                          {'M',' ','M',' ','M',' '},
                          {'M',' ',' ',' ','M',' '},
                          {'M',' ',' ',' ','M',' '}};  
        return letraM;
    }
    public static char[][] letraN(){
        char[][]letraN = {{'N',' ',' ',' ','N',' '},
                          {'N','N',' ',' ','N',' '},
                          {'N',' ','N',' ','N',' '},
                          {'N',' ',' ','N','N',' '},
                          {'N',' ',' ',' ','N',' '}};  
        return letraN;
    }
    public static char[][] letraO(){
        char[][]letraO = {{' ','O','O','O',' ',' '},
                          {'O',' ',' ',' ','O',' '},
                          {'O',' ',' ',' ','O',' '},
                          {'O',' ',' ',' ','O',' '},
                          {' ','O','O','O',' ',' '}}; 
        return letraO;
    }
    public static char[][] letraP(){
       char[][]letraP =  {{'P','P','P','P',' ',' '},
                          {'P',' ',' ',' ','P',' '},
                          {'P','P','P','P',' ',' '},
                          {'P',' ',' ',' ',' ',' '},
                          {'P',' ',' ',' ',' ',' '}};
        return letraP;
    }
    public static char[][] letraQ(){
        char[][]letraG = {{'Q','Q','Q','Q','Q',' '},
                          {'Q',' ',' ',' ','Q',' '},
                          {'Q',' ',' ',' ','Q',' '},
                          {'Q','Q','Q','Q','Q',' '},
                          {' ',' ',' ',' ','Q',' '}};
        return letraG;
    }
    public static char[][] letraR(){
        char[][]letraR = {{'R','R','R','R',' ',' '},
                          {'R',' ',' ',' ','R',' '},
                          {'R','R','R','R',' ',' '},
                          {'R',' ','R',' ',' ',' '},
                          {'R',' ',' ','R',' ',' '}};
        return letraR;
    }
    public static char[][] letraS(){
        char[][]letraS = {{'S','S','S','S','S',' '},
                          {'S',' ',' ',' ',' ',' '},
                          {'S','S','S','S','S',' '},
                          {' ',' ',' ',' ','S',' '},
                          {'S','S','S','S','S',' '}};
        return letraS;
    }
    public static char[][] letraT(){
        char[][]letraT = {{'T','T','T','T','T',' '},
                          {' ',' ','T',' ',' ',' '},
                          {' ',' ','T',' ',' ',' '},
                          {' ',' ','T',' ',' ',' '},
                          {' ',' ','T',' ',' ',' '}};
        return letraT;
    }
    public static char[][] letraU(){
        char[][]letraU = {{'U',' ',' ',' ','U',' '},
                          {'U',' ',' ',' ','U',' '},
                          {'U',' ',' ',' ','U',' '},
                          {'U',' ',' ',' ','U',' '},
                          {'U','U','U','U','U',' '}};
        return letraU;
    }
    public static char[][] letraV(){
        char[][]letraV = {{'V',' ',' ',' ','V',' '},
                          {'V',' ',' ',' ','V',' '},
                          {' ','V',' ','V',' ',' '},
                          {' ',' ','V',' ',' ',' '},
                          {' ',' ','V',' ',' ',' '}};
        return letraV;
    }
    public static char[][] letraW(){
        char[][]letraW = {{'W',' ',' ',' ','W',' '},
                          {'W',' ',' ',' ','W',' '},
                          {'W',' ','W',' ','W',' '},
                          {'W','W',' ','W','W',' '},
                          {'W',' ',' ',' ','W',' '}};
        return letraW;
    }
    public static char[][] letraX(){
        char[][]letraX = {{'X',' ',' ',' ','X',' '},
                          {' ','X',' ','X',' ',' '},
                          {' ',' ','X',' ',' ',' '},
                          {' ','X',' ','X',' ',' '},
                          {'X',' ',' ',' ','X',' '}};
        return letraX;
    }
    public static char[][] letraY(){
        char[][]letraY = {{'Y',' ',' ',' ','Y',' '},
                          {' ','Y',' ','Y',' ',' '},
                          {' ',' ','Y',' ',' ',' '},
                          {' ','Y',' ',' ',' ',' '},
                          {'Y',' ',' ',' ',' ',' '}};
        return letraY;
    }
    public static char[][] letraZ(){
        char[][]letraZ = {{'Z','Z','Z','Z','Z',' '},
                          {' ',' ',' ','Z',' ',' '},
                          {' ',' ','Z',' ',' ',' '},
                          {' ','Z',' ',' ',' ',' '},
                          {'Z','Z','Z','Z','Z',' '}};
        return letraZ;
    }
    
    

    
}
