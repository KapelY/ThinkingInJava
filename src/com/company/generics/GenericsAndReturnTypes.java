package com.company.generics;

import org.jetbrains.annotations.NotNull;

/**
 * page 572
 */
interface GenericGetter<T extends GenericGetter<T>> {
    T get();
}
interface Getter extends GenericGetter<Getter> {}

public class GenericsAndReturnTypes {
    void test(@NotNull Getter g) {
        Getter result = g.get();
        GenericGetter gg = g.get();
    }
}
