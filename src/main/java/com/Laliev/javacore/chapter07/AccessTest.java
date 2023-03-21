package com.Laliev.javacore.chapter07;

class Test3 {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

public class AccessTest {
    public static void main(String args[]) {
        Test3 ob = new Test3();

        ob.a = 10;
        ob.b = 20;

        //  ob.c = 100; // Ошибка! нет доступа

        ob.setc(100); // OK

        System.out.println("a, b, c: " + ob.a + " " +
                ob.b + " " + ob.getc());
    }
}
