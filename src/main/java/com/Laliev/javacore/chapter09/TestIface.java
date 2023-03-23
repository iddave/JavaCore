package com.Laliev.javacore.chapter09;

//import com.Laliev.javacore.chapter09.interfaces.Callback;

import com.Laliev.javacore.chapter09.interfaces.Callback;

public class TestIface {
    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(42);
        ((Client) c).nonIfaceMeth();
    }
}
