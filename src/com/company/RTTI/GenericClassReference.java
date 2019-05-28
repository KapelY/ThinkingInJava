package com.company.RTTI;

/**
 * page 462
 */
public class GenericClassReference {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
//        genericIntClass = double.class;
    }
}
