package com.company.generics;

/**
 * page 512
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());

    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(" ");
        gm.f(1);
        gm.f(1.1);
        gm.f(1.2f);
        gm.f('c');
        gm.f(gm);
    }
}
