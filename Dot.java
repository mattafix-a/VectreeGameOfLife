/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectree;

/**
 *
 * @author Artem
 */
public class Dot{
    static int dot1,dot2;
    static int count = 0;
    
    public static void generationDot(String[][] field1){
        dot1 = ((int)(Math.random()*(field1.length-2))+1);
        dot2 = ((int)(Math.random()*(field1.length-2))+1);
        field1[dot1][dot2] = "*";
    }
    
    public static void newDot(String[][] field1){
        for (int n = 1; n < field1.length-1; n++){
            for (int k = 1; k < field1.length-1; k++){
                if ((field1[n][k] == "*") && ((field1[n-1][k-1]) == (field1[n][k]))){
                    count++;
                }
                if ((field1[n][k] == "*") && ((field1[n-1][k]) == (field1[n][k]))){
                    count++;
                }
                if ((field1[n][k] == "*") && ((field1[n-1][k+1]) == (field1[n][k]))){
                    count++;
                }
                if ((field1[n][k] == "*") && ((field1[n][k-1]) == (field1[n][k]))){
                    count++;
                }
                if ((field1[n][k] == "*") && ((field1[n][k+1]) == (field1[n][k]))){
                    count++;
                }
                if ((field1[n][k] == "*") && ((field1[n+1][k-1]) == (field1[n][k]))){
                    count++;
                }
                if ((field1[n][k] == "*") && ((field1[n+1][k]) == (field1[n][k]))){
                    count++;
                }
                if ((field1[n][k] == "*") && ((field1[n+1][k+1]) == (field1[n][k]))){
                    count++;
                }
                if (count == 3){
                    field1[n][k] = " ";
                }
                if (count == 2){
                    if ((field1[n][k-1] == "*") && ((field1[n][k-1]) == (field1[n-1][k-1]))){
                        field1[n-1][k] = "*";
                    }
                    if ((field1[n-1][k-1] == "*") && ((field1[n-1][k-1]) == (field1[n-1][k]))){
                        field1[n][k-1] = "*";
                    }
                    if ((field1[n-1][k] == "*") && ((field1[n-1][k]) == (field1[n-1][k+1]))){
                        field1[n][k+1] = "*";
                    }
                    if ((field1[n-1][k+1] == "*") && ((field1[n-1][k+1]) == (field1[n][k+1]))){
                        field1[n-1][k] = "*";
                    }
                    if ((field1[n][k+1] == "*") && ((field1[n][k+1]) == (field1[n+1][k+1]))){
                        field1[n+1][k] = "*";
                    }
                    if ((field1[n+1][k+1] == "*") && ((field1[n+1][k+1]) == (field1[n+1][k]))){
                        field1[n][k+1] = "*";
                    }
                    if ((field1[n+1][k] == "*") && ((field1[n+1][k]) == (field1[n+1][k-1]))){
                        field1[n][k-1] = "*";
                    }
                    if ((field1[n+1][k-1] == "*") && ((field1[n+1][k-1]) == (field1[n][k-1]))){
                        field1[n+1][k] = "*";
                    }
                    if ((field1[n][k-1] == "*") && ((field1[n][k-1]) == (field1[n-1][k]))){
                        field1[n-1][k-1] = "*";
                    }
                    if ((field1[n-1][k-1] == "*") && ((field1[n-1][k-1]) == (field1[n-1][k+1]))){
                        field1[n-1][k] = "*";
                    }
                    if ((field1[n-1][k] == "*") && ((field1[n-1][k]) == (field1[n][k+1]))){
                        field1[n-1][k+1] = "*";
                    }
                    if ((field1[n-1][k+1] == "*") && ((field1[n-1][k+1]) == (field1[n+1][k+1]))){
                        field1[n][k+1] = "*";
                    }
                    if ((field1[n][k+1] == "*") && ((field1[n][k+1]) == (field1[n+1][k]))){
                        field1[n+1][k+1] = "*";
                    }
                    if ((field1[n+1][k+1] == "*") && ((field1[n+1][k+1]) == (field1[n+1][k-1]))){
                        field1[n+1][k] = "*";
                    }
                    if ((field1[n+1][k] == "*") && ((field1[n+1][k]) == (field1[n][k-1]))){
                        field1[n+1][k-1] = "*";
                    }
                    if ((field1[n+1][k-1] == "*") && ((field1[n+1][k-1]) == (field1[n-1][k-1]))){
                        field1[n][k-1] = "*";
                    }
                }
                count = 0;
            }
            count = 0;
        }
    }
}
