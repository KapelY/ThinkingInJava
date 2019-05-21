package com.company.interfaces;

/**
 * @Author Eckel
 * page 306
 */
class MNA {
    private void f() {
        System.out.println("f()");
    }
    class A {
        private void g() {
            System.out.println("g()");
        }
        class B {
            void h() {
                g();
                f();
            }
        }
    }
}
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
        new MNA().new A().new B().h();
    }

}
