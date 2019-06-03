package com.company.generics;

/**
 * page 567
 * @param <T>
 */
public class BasicHolder<T> {
    T element;
    void set(T arg) { element = arg; }
    T get() {return element;}
    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
