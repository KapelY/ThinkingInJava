package com.company.RTTI;

/**
 * page 462
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
        intClass = float.class;
        intClass = byte.class;
        intClass = char.class;
        intClass = boolean.class;
        intClass = short.class;


        Class<? extends Number> bounded = int.class;
        bounded = double.class;
//        bounded = boolean.class;
        bounded = short.class;
//        bounded = char.class;
        bounded = byte.class;
        bounded = float.class;
    }

}
