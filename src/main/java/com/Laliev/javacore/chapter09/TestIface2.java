package com.Laliev.javacore.chapter09;

import com.Laliev.javacore.chapter09.interfaces.Callback;

class AnotherClient implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Eщe один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}

public class TestIface2 {
    public static void main(String args[]) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;
        c.callback(42);
    }
}
