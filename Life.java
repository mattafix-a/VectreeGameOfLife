package vectree;

import java.util.Scanner;

public class Life{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        Dot dot = new Dot();
        Field field = new Field();
        System.out.print("Введите размер игрового поля: ");
        int n = in.nextInt();
        int x = 1;
        boolean game = true;
        String[][] field1 = new String[n][n];
        Field.createField(n,field1);
        while (x <= 60){
            Dot.generationDot(field1);
            x++;
        }
        while (game){
            Field.outputField(field1);
            Dot.newDot(field1);
            System.out.println("______________________________");
            System.out.println();
        }
    }
}