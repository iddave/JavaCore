package com.Laliev.javacore.chapter05;

public class Return {
    public static void main (String[] args) {
        boolean t = true;
        System.out.println("До возврата.");
        if (t) return; // возврат в вызывающий код
//  Сразу после выполнения оператора return управление возвращается вызывающему объекту.
        System.out.println("Этот оператор не выполнится.");
    }
}
