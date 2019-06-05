package com.company.generics;

/**
 * page 571
 */
public class SelfBoundingMethods {
    static <T extends SelfBounded<T>> T f(T arg) {
        return arg.set(arg).get();
    }

    public static void main(String[] args) {
        AA aa = f(new AA());
    }
}
