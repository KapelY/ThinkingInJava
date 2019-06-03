package com.company.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * page 550
 */
public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
//        flist.add(new Apple());
        flist.add(null);
        Fruit f = flist.get(0);

        List<? extends Fruit> fruits = Arrays.asList(new Apple());
        System.out.printf("%s", fruits.contains(new Apple()));
        System.out.println(fruits.indexOf(new Apple()));
        Apple a = (Apple) flist.get(0);
    }
}
