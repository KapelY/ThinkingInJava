package com.company.generics;

import org.jetbrains.annotations.NotNull;

/**
 * page 567
 *
 *class Cat extends ComparablePet implements Comparable<Cat> {
 *    public int compareTo(Cat arg) {return 0;}
 */

class Hamster extends ComparablePet implements Comparable<ComparablePet> {
    @Override
    public int compareTo(@NotNull ComparablePet o) {
        return 0;
    }
}

class Gecko extends ComparablePet {
    @Override
    public int compareTo(@NotNull ComparablePet o) {
        return 0;
    }
}
public class HijackedInterface {
}
