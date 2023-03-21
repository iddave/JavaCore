package com.Laliev.javacore.chapter06;

class Box {
    double width;
    double height;
    double depth;
}

// В этом классе объявляются два объекта типа Box
class BoxDemo {
    public static void main (String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double volume;

        // присваиваем значения переменным экземпляра mybox1
        mybox1.width  = 10;
        mybox1.height = 20;
        mybox1.depth  = 15;

        // присваиваем другие значения переменным экземпляра mybox2
        mybox2.width  = 3;
        mybox2.height = 6;
        mybox2.depth  = 9;

        volume = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем (mybox1) = " + volume);

        volume = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем (mybox2) = " + volume);

    }
}


