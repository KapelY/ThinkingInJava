package com.company.generics;


/**
 * page 539
 */
interface Factory<T> {
    T create();
}

class Foo2<T> {
    private T x;
    public <F extends Factory<T>> Foo2(F factory) {
        x = factory.create();
    }
}

class IntegerFactory implements Factory<Integer> {

    @Override
    public Integer create() {
        return new Integer(0);
    }
}

class Widget {
    public static class Factory implements com.company.generics.Factory<Widget> {

        @Override
        public Widget create() {
            return new Widget();
        }
    }
}

public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}
