package com.company.interfaces;

/**
 * @Author Eckel
 * page #307
 */
interface A1 {
}

interface B1 {
}

class X implements A1, B1 {
}

class Y implements A1 {
    B1 makeB1() {
        return new B1() {
        };
    }
}

public class MultiInterfaces {
    static void takesA(A1 a1) {}
    static void takesB(B1 b1) {}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB1());
    }
}
