package com.company.generics;

/**
 * page 573
 */
interface SelfBoundSetter<T extends SelfBounded<T>> {
    void set(T arg);
}
//interface Setter extends SelfBoundSetter<Setter> {} some shit

public class SelfBoundingAndCovariantArguments {
//    void testA(Setter s1, Setter s2, SelfBoundSetter sbs) {
//        s1.set(s2);
//        s1.set(sbs);
//    }
}
