package com.Laliev.javacore.chapter09;
import com.Laliev.javacore.chapter09.interfaces.Callback;
public class Client implements Callback {

    @Override
    public void callback(int p) {
        System.out.println("callback вызван с p = " + p);
    }

    void nonIfaceMeth() {
        System.out.println("B классах, реализующих интерфейсы, " +
                "могут определяться и другие члены.");
    }
}
