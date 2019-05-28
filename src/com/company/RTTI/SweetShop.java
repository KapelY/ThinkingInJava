package com.company.RTTI;

/**
 * page 455
 */
class Candy {
    static {
        System.out.println("Candy");
    }
}

class Gum {
    static {
        System.out.println("Gum");
    }
}

class Cookie {
    static {
        System.out.println("Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("main");
        new Candy();
        System.out.println("After Candy");
        try {
            Class.forName("com.company.RTTI.Gum");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After Class.forName()");
        new Cookie();
        System.out.println("After Cookie");

    }
}
