package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;


public class Main3 {
    public static void main(String args[]){
        Vector<Integer> B = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = random.nextInt(199)-99;
            }
        }
        for (int i = 0; i < a.length; i++) {
            int cntr = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j][i]>0){cntr++;}
            }
            B.add(cntr);
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a.length; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println(B);
    }
}
