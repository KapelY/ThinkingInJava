package com.company.interfaces;

/**
 * page #317
 */
class WithInner {
    class Inner {
    }
}

public class InheritInner extends WithInner.Inner {
    //    InheritInner() {} - mistake
    InheritInner(WithInner withInner) {
        withInner.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
