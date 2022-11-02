package atv3;
import java.util.Scanner;
public class Atv3 {
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
// System.out.println(tmn); // Imprime o tamanho
                
        for(int i = 0;i<letra.length;i++){ // repete até terminar todas as letras
        //   System.out.print (letra[i]+"-"); // Separa todas as letras assim: A-R-R-O-Z
        }
        
        char[][] letraG = letraG(letra);
        
        char[][] fnl = new char[5][tmn];
       
        for(int i=0;i<5;i++){
            System.out.println(letraG[i]);  //(c*t)+0+1+2+3+4
        }
       // letraG=imprimir(letraG,letra);
       
 
    }
    
    
     public static char[][] letraG(char[] letra){
        char [][] resp = new char[5][];
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
           char[][] letraG = {{'B','B','B','B',' ',},
                              {'B',' ',' ',' ','B',},
                              {'B','B','B','B','B'},
                              {'B',' ',' ',' ','B'},
                              {'B','B','B','B',' '}};
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
           char[][] letraG = {{'D','D','D','D',' ',},
                              {'D',' ',' ',' ','D',},
                              {'D',' ',' ',' ','D'},
                              {'D',' ',' ',' ','D'},
                              {'D','D','D','D',' '}
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
        
        if (letra[i] == 'Q'){
           char[][] letraG = {{'Q','Q','Q','Q','Q',},
                              {'Q',' ',' ',' ','Q' ,},
                              {'Q',' ',' ',' ','Q'},
                              {'Q','Q','Q','Q','Q'},
                              {' ',' ',' ',' ','Q'}
                             };
            resp = letraG;                 
        }
        if (letra[i] == 'R'){
           char[][] letraG = {{'R','R','R','R',' ',},
                              {'R',' ',' ',' ','R',},
                              {'R','R','R','R',' '},
                              {'R','R',' ',' ',' '},
                              {'R',' ','R',' ',' '}
                              };
        resp = letraG;
       
        }
        if(letra[i] == 'S'){
           char[][] letraG = {{'S','S','S','S','S'},
                              {'S',' ',' ',' ' ,' '},
                              {'S','S','S','S','S'},
                              {' ',' ',' ',' ','S'},
                              {'S','S','S','S','S'}
                              };
        resp = letraG;   
        }
        if (letra[i] == 'T'){
           char[][] letraG = {{'T','T','T','T','T',},
                              {' ',' ','T',' ',' ',},
                              {' ',' ','T',' ',' '},
                              {' ',' ','T',' ',' '},
                              {' ',' ','T',' ',' '}
                              };
           resp = letraG;
        }   
        if(letra[i] == 'U'){
           char[][] letraG = {{'U',' ',' ',' ','U',},
                              {'U',' ',' ',' ','U',},
                              {'U',' ',' ',' ','U'},
                              {'U',' ',' ',' ','U'},
                              {'U','U','U','U','U'}
                             };
           resp = letraG;
           
        }
         if(letra[i] == 'V'){
           char[][] letraG = {{'V',' ',' ',' ','V',},
                              {'V',' ',' ',' ','V',},
                              {' ','V',' ','V',' '},
                              {' ',' ','V',' ',' '},
                              {' ',' ','V',' ',' '}
                             };
           resp = letraG;
         }
         if(letra[i] == 'W'){
           char[][] letraG = {{'W',' ',' ',' ','W',},
                              {'W',' ',' ',' ','W',},
                              {'W',' ','W',' ','W'},
                              {'W','W',' ','W','W'},
                              {'W',' ',' ',' ','W'}
                             };
           resp = letraG;
      
         }
         if(letra[i] == 'X'){
           char[][] letraG = {{'X',' ',' ',' ','X',},
                              {' ','X',' ','X',' ',},
                              {' ',' ','X',' ',' '},
                              {' ','X',' ','X',' '},
                              {'X',' ',' ',' ','X'}
                             };
           
            resp = letraG;
         }
          if(letra[i] == 'Y'){
           char[][] letraG = {{'Y',' ',' ',' ','Y',},
                              {' ','Y',' ','Y',' ',},
                              {' ',' ','Y',' ',' '},
                              {' ','Y',' ',' ',' '},
                              {'Y',' ',' ',' ',' '}
                             };
           
            resp = letraG;
          }
             if(letra[i] == 'Z'){
           char[][] letraG = {{'Z','Z','Z','Z','Z',},
                              {' ',' ',' ','Z',' ',},
                              {' ',' ','Z',' ',' '},
                              {' ','Z',' ',' ',' '},
                              {'Z','Z','Z','Z','Z'}
                             };
           resp = letraG;
        }
            else if (letra [i] == ' '){
                char[][] letraG = {{' ',' ',' ',' ',' ',},};
                resp = letraG;
            }
            else if (letra [i] == '-'){
                char[][] letraG = {{' ',},};
                resp = letraG;
            }   
             
           return resp;
        
 
    
    
    }
         return resp;
}
}