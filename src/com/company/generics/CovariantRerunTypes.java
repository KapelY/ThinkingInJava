package com.company.generics;

/**
 * page 571
 */
class Base {}
class Derived extends Base {}
interface OrdinaryGetter {
    Base get();
}
interface DerivedGetter extends OrdinaryGetter {
    Derived get();
}

public class CovariantRerunTypes {
    void test(DerivedGetter d) {
        Derived d2 = d.get();
    }
}
