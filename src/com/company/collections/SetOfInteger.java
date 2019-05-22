package com.company.collections;

import java.util.*;

/**
 * page #345
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            intset.add(random.nextInt(30));
            System.out.println(intset);
        }
        System.out.println(intset);
        Set<Integer> integers = new TreeSet<>();
        for (int i = 0; i < 10000; i++) {
            integers.add(random.nextInt(30));
        }
        System.out.println(integers);
    }
}
