package com.Laliev.javacore.chapter03;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nПреобразование типа int в byte.");
        b = (byte) i;
        System.out.println("i , b : " + i + " , " + b);
        System.out.println("\nПреобразование типа double в int.");
        i = (int) d;
        System.out.println("d , i : " + d + " , " + i);
        System.out.println("\nПреобразование типа double в byte.");
        b = (byte) d;
        System.out.println("d , b : " + d + " , " + b);
    }
}
