package com.Laliev.javacore.chapter05;

public class Continue {
    public static void main (String[] args){
        for (int i = 0; i < 10; i++) {
            System.out.print (i + " ");
            // если значение четное, то цикл продолжается без перехода на новую строку
            if (i %2 == 0) continue;
            System.out.println();
        }
    }
}
