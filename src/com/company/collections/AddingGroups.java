package com.company.collections;

import java.util.*;

/**
 * page #330
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection =
                new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        System.out.println(collection);
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
//        list.add(21);
    }
}
