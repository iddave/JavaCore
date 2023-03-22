package com.Laliev.javacore.chapter08;

class Boxx {
    private double width;
    private double height;
    private double depth;

    Boxx(Boxx ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Boxx(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Boxx() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Boxx(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxxWeight extends Boxx {
    double weight;

    BoxxWeight(BoxxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxxWeight() {
        super();
        weight = -1;
    }

    BoxxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

public class DemoSuper {
    public static void main(String args[]) {
        BoxxWeight mybox1 = new BoxxWeight(10, 20, 15, 34.3);
        BoxxWeight mybox2 = new BoxxWeight(2, 3, 4, 0.076);
        BoxxWeight mybox3 = new BoxxWeight(); // по умолчанию
        BoxxWeight mycube = new BoxxWeight(3, 2);
        BoxxWeight myclone = new BoxxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 = " + vol);
        System.out.println("Вес mybox1 = " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 = " + vol);
        System.out.println("Вес mybox2 = " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 = " + vol);
        System.out.println("Вес mybox3 = " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone = " + vol);
        System.out.println("Вес myclone = " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube = " + vol);
        System.out.println("Вес mycube = " + mycube.weight);
        System.out.println();
    }
}
