package com.company.generics;

import java.util.ArrayList;

/**
 * page 527
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<Integer>().getClass();
        Class c2 = new ArrayList<String>().getClass();
        System.out.println(c1 == c2); // f*ck
        System.out.println(c1.equals(c2)); // f*ck * 2

    }
}
