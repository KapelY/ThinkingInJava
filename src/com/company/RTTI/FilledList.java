package com.company.RTTI;

import java.util.ArrayList;
import java.util.List;

/**
 * page 463
 */
class CountedInteger {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type) { this.type = type; }
    public List create(int nElement) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < nElement; i++) {
            try {
                result.add(type.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fl =
                new FilledList<>(CountedInteger.class);
        System.out.println(fl.create(15));
    }
}
