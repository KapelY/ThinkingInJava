package com.company.collections;

import java.util.*;

/**
 * page #331
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("go1");
        collection.add("go2");
        collection.add("go3");
        collection.add("go4");
        collection.add("go5");
        return collection;
    }
    static Map fill(Map<String, String> map) {
        map.put("go1", "rat1");
        map.put("go2", "rat2");
        map.put("go3", "rat3");
        map.put("go4", "rat4");
        map.put("go5", "rat5");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<>()));
        System.out.println(fill(new HashSet<>()));
        System.out.println(fill(new TreeSet<>()));
        System.out.println(fill(new LinkedHashSet<>()));
        System.out.println(fill(new HashMap<>()));
        System.out.println(fill(new TreeMap<>()));
        System.out.println(fill(new LinkedHashMap<>()));
    }
}
