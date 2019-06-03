package com.company.Util;

import com.company.generics.Generator;
import org.jetbrains.annotations.NotNull;

/**
 * page 618
 */
public class GeneratorsTest {
    public static int size = 10;

    public static void test(@NotNull Class<?> surroundingClass) {
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.print(type.getSimpleName() + ": ");
            Generator<?> g = null;
            try {
                g = (Generator<?>) type.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < size; i++) {
                assert g != null;
                System.out.print(g.next() + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        test(CountingGenerator.class);
    }
}
