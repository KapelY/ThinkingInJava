package com.company.RTTI;

import java.util.Random;

/**
 * page 460
 */
class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Init Initable");
    }
}
class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Init Initable2");
    }
}
class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Init Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After link Initable");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("com.company.RTTI.Initable3");
        System.out.println("After link for Initable3");
        System.out.println(Initable3.staticNonFinal);
    }
}
