/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letrag;

/**
 *
 * @author 20222TPMI0035
 */
public class LetraG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] letraG = {{'D','D','D','D',' ',},
                              {'D',' ',' ',' ','D',},
                              {'D',' ',' ',' ','D'},
                              {'D',' ',' ',' ','D'},
                              {'D','D','D','D',' '}
                             };
        System.out.println(letraG[0]);
        System.out.println(letraG[1]);
        System.out.println(letraG[2]);
        System.out.println(letraG[3]);
        System.out.println(letraG[4]);
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
           char[][] letraG = {{'B','B','B','B',' ',},
                              {'B',' ',' ',' ','B',},
                              {'B','B','B','B','B'},
                              {'B',' ',' ',' ','B'},
                              {'B','B','B','B',' '}
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
           char[][] letraG = {{'S','S','S','S','S',},
                              {'S',' ',' ',' ' ,' ',},
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
                
           return resp;
        
 
    
    
    }
        
    
    
    

    

