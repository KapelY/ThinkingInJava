package com.company.generics;

/**
 * page 533
 */
class GenericBase<T> {
    private T element;
    public void set(T arg) { arg = element; }

    public T getElement() {
        return element;
    }
}

class Derived1<T> extends GenericBase<T> {}

class Derived2<T> extends GenericBase<T> {}

public class ErasureAndInheritance {
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object object = d2.getElement();
        d2.set(object);
    }
}
