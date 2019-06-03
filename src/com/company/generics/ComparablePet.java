package com.company.generics;

import org.jetbrains.annotations.NotNull;

/**
 * page 567
 */
public class ComparablePet implements Comparable<ComparablePet>{
    @Override
    public int compareTo(@NotNull ComparablePet o) {
        return 0;
    }
}
