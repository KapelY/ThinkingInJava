package com.company.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * page 554
 */
public class GenericWriting {
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }
    static List<Apple> apples = new ArrayList<>();
    static List<Fruit> fruits = new ArrayList<>();
    static void f1() {
        writeExact(apples, new Apple());
        writeExact(fruits, new Apple());// shouldn't work in jdk6
    }
    static <T> void writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }
    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruits, new Apple());
    }

    public static void main(String[] args) {
        f1();f2();
    }
}
