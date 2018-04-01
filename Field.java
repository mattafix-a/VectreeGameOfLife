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
public class Field {
    public static void createField(int n,String[][] field1){
         for (n = 1; n < field1.length-1; n++){
             for (int k = 1; k < field1.length-1; k++){
                 field1[0][k] = "-";
                 field1[field1.length-1][k] = "-";
                 field1[n][k] = " ";
                 field1[0][field1.length-1] = "-";
             }
             field1[n][0] = "|";
             field1[n][field1.length-1] = "|";
         }
         field1[0][0] = "•";
         field1[0][field1.length-1] = "•";
         field1[field1.length-1][0] = "•";
         field1[field1.length-1][field1.length-1] = "•";
    }
    
    public static void outputField(String[][] field1){
        for (int n = 0; n < field1.length; n++){
             for (int k = 0; k < field1.length; k++){
                 System.out.print(field1[n][k]);
             }
             System.out.println();
         }
    }
}
