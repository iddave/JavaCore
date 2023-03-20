package com.Laliev.javacore.chapter05;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first: {
            second: {
                third:{
                    System.out.println("Предшествует break");
                    if(t) break second;
                    System.out.println("Этот оператор не будет выполоняться");
                }
                System.out.println("Этот оператор не будет выполоняться");
            }
        }
    }
}
