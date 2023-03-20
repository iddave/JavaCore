package com.Laliev.javacore.chapter05;

public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arrs = new int[3][5];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                arrs[i][j] = j + 1;

        // цикл  for each для вывода двумерного массива
        for (int x[] : arrs) {
            for (int y : x) {
                System.out.print(y + " ");
                sum += y;
            }
            System.out.println();
        }
        System.out.println("Сумма: " + sum);
    }
}
