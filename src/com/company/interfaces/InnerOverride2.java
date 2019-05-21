package com.company.interfaces;

class Egg2 {
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk()--------- " + this);
        }
        public void f() {
            System.out.println("Egg2.Yolk.f()--------- " + this);
        }
    }
    private Yolk y;

    public Egg2() {
        System.out.println("New Egg2()---------- " + this);
    }
    public void insertYolk(Yolk yy) {y = yy;}
    public void g() {y.f();}
}
public class InnerOverride2 extends Egg2 {
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            System.out.println("InnerOverride2.Yolk()" + this);
        }
        public void f() {
            System.out.println("InnerOverride2.Yolk.f()");
        }
    }

    public InnerOverride2() {insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 e2 = new InnerOverride2();
        e2.g();
    }
}
