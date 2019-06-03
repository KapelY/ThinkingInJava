package com.company.generics;

import java.lang.reflect.Array;

/**
 * page 543
 * @param <T>
 */
public class GenericArrayWithTypeToken<T> {
    private T[] array;

    public GenericArrayWithTypeToken(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type, sz);
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {return array[index];}

    public T[] rep() {return array;}

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> gai =
                new GenericArrayWithTypeToken<>(Integer.class, 10);
        Integer[] ai = gai.rep();

        GenericArrayWithTypeToken<Double> gai2 =
                new GenericArrayWithTypeToken<>(Double.class, 10);
        Double[] ai2 = gai2.rep();
    }
}
