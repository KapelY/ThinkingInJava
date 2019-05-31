package com.company.interfaces;

class B2 implements A2 {
    @Override
    public void f() {}
    public void g(){}
}
public class InterfaceViolation {
    public static void main(String[] args) {
        A2 a2 = new B2();
        a2.f();
        // a.g();
        System.out.println(a2.getClass().getName());
        if (a2 instanceof B2) {
            B2 b2 = (B2) a2;
            b2.g();
        }
    }
}
