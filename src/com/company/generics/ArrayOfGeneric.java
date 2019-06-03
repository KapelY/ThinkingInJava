package com.company.generics;

/**
 * page 541
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        gia = new Generic[SIZE];

        System.out.println(gia.getClass().getSimpleName());

//        gia = (Generic<Integer>[]) new Object[SIZE];
        gia[0] = new Generic<>();
//        gia[1] = new Object();
//        gia[1] = new Generic<Double>();
    }
}
