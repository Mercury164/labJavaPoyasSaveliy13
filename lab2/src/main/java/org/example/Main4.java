package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public  static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите размер матрицы: ");
        int n = scanner.nextInt();


        int[][] A = new int[n][n];

        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = random.nextInt(199) - 99;
                if ((A[i][j]>0)&&(i+j == n)){sum+=A[i][j];}
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
        //System.out.println();
        System.out.println();
        System.out.println("sum = "+sum);
    }
}
