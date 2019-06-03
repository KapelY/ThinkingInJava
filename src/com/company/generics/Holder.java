package com.company.generics;

/**
 * page 551
 */
public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T value) {
        this.value = value;
    }

    public void set(T val) {
        value = val;
    }

    public T get() {
        return value;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<>(new Apple());
        Apple d = Apple.get();
        Apple.set(d);
//        Holder<Fruit> Fruit = Apple;
        Holder<? extends Fruit> fruit = Apple;
        Fruit p = fruit.get();
        d = (Apple) fruit.get();

        try {
            Orange c = (Orange) fruit.get();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
