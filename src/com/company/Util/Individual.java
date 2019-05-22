package com.company.Util;

import org.jetbrains.annotations.NotNull;

public class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id = counter++;
    private String name;

    public Individual() {
    }
    public Individual(String name) {
        this.name = name;
    }

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + (name == null ? "" : " " + name);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Individual &&
                id == ((Individual)obj).id;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (name != null) {
            result = 37 * result + name.hashCode();
        }
        return 37 * result + (int)id;
    }

    @Override
    public int compareTo(@NotNull Individual individual) {
        String first = getClass().getSimpleName();
        String argFirst = individual.getClass().getSimpleName();
        int firstCompare = first.compareTo(argFirst);
        if (firstCompare != 0) return firstCompare;
        if (name != null && individual.name != null) {
            int secondCompare = name.compareTo(individual.name);
            if (secondCompare != 0) return secondCompare;
        }
        return (Long.compare(individual.id, id));
    }
}













