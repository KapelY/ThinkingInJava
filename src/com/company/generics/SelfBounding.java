package com.company.generics;

/**
 * page 569
 * @param <T>
 */
class SelfBounded<T extends SelfBounded<T>> {
    T element;

    SelfBounded<T> set(T element) {
        this.element = element;
        return this;
    }
    T get() { return element; }
}

class AA extends SelfBounded<AA> {}
class BB extends SelfBounded<BB> {}

class CC extends SelfBounded<CC> {
    CC setAndGet(CC arg) { set(arg); return get();}
}

class DD {}
//class EE extends SelfBounded<DD> {}

class FF extends SelfBounded {}

public class SelfBounding {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.set(new AA());
        aa = aa.set(new AA()).get();
        aa = aa.get();
        CC cc = new CC();
        cc = cc.setAndGet(new CC());
    }
}