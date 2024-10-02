package org.example;
import java.sql.Array;
import java.util.Random;
import java.util.Scanner;



public class Main {
    public static double[] CreateReciprocalFraction(double[] array) {
        double[] arr = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            try {
                // Проверяем, не равно ли элемент нулю перед делением
                if (array[i] == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                arr[i] = 1 / array[i];
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage() + " для элемента с индексом " + i);
                arr[i] = Double.NaN; // Или можно установить значение по умолчанию, например 0
            }
        }
        return arr;



    };







    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        double a[] = new double[n];
        int cntr = 0;

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(199) - 99;
            if (a[i]>0){cntr++;}
        }
        System.out.println("Дефолтный массив: ");
        for (double value : a) {
            System.out.print(value+" ");
        }
        System.out.println();
        System.out.println("Обратный массив: ");
        double[] b= CreateReciprocalFraction(a);
        for (double value : b) {
            System.out.print(value+" ");
        }
        int index = 0;
        double[] C = new double[cntr];
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                C[index] = a[i] * 5;
                index++;

            }
        }
        System.out.println();
        System.out.println("Massive C[]:");
        for(double i: C){
            System.out.print(i+"  ");
        }
    }
}
