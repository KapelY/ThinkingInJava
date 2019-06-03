package com.company.generics;

import java.util.List;

/**
 * page 552
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
    }
}
