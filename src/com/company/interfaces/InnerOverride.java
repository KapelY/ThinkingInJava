package com.company.interfaces;

/**
 * page #318
 */
class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }

    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}
public class InnerOverride extends Egg {
    public class Yolk {
        public Yolk() {
            System.out.println("InnerOverride.Yolk()");
        }
    }

    public static void main(String[] args) {
        new InnerOverride();
    }
}
