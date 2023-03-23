package com.Laliev.javacore.chapter09.p2;

public class OtherPackage {
    OtherPackage() {
        com.Laliev.javacore.chapter09.p1.Protection p = new com.Laliev.javacore.chapter09.p1.Protection();
        System.out.println("конструктор иэ другого пакета");

        //  доступно только для данного класса или пакета
        //  System.out.println("n = " + p.n);

        //  доступно только для данного класса
        //  System.out.println("n_pri = " + p.n_pri);

        //  доступно только для данного класса, подкласса или пакета
        //  System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
