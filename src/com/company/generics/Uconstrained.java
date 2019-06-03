package com.company.generics;

/**
 * page 569
 */
class Other {}
class BasicOther extends BasicHolder<Other> {}

public class Uconstrained {
    public static void main(String[] args) {
        BasicOther b = new BasicOther(), b2 = new BasicOther();
        b.set(new Other());
        Other other = b.get();
        b.f();
    }
}
