package com.company.generics;

import com.company.generics.coffee.Coffee;
import com.company.generics.coffee.CoffeeGenerator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * page 516
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(
                new ArrayList<>(), new CoffeeGenerator(), 4);
        for (Coffee c: coffees) {
            System.out.println(c);
        }
        Collection<Integer> fnumbers = fill(new ArrayList<>(), new Fibonacci(), 12);
        for (int i: fnumbers)
            System.out.println(i + ", ");
    }
}
