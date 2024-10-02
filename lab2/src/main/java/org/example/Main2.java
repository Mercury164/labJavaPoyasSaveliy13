package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        // Создаем массив на n элементов
        int[] b = new int[n];



        // Создаем объект Random для генерации случайных чисел
        Random random = new Random();
        int cntr = 0;
        // Заполняем массив случайными числами от -99 до 99
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(199) - 99; // генерирует числа от -99 до 99
            if (b[i]>0){cntr++;}
        }

        double[] C = new double[cntr];
        int index = 0;
        for (int i = 0; i<b.length; i++){

            if (b[i] > 0){
                C[index] = Math.sqrt(b[i])/5;
                index++;
            }

        }
        for (int i = 0; i < cntr - 1; i++) {
            // Предполагаем, что текущий элемент - минимальный
            int minIndex = i;
            // Находим индекс минимального элемента в оставшейся части массива
            for (int j = i + 1; j < cntr; j++) {
                if (C[j] < C[minIndex]) {
                    minIndex = j; // обновляем индекс минимального элемента
                }
            }
            // Если минимальный элемент не на текущей позиции, меняем их местами
            if (minIndex != i) {
                Double temp = C[i];
                C[i] = C[minIndex];
                C[minIndex] = temp;
            }

        }
        for (int number : b) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (Double number : C) {
            System.out.print(number + "  ");
        }
    }
}
