package com.company.collections;

/**
 * page 479
 */
class Base {
}

class Derived extends Base {
}

public class InstanceOfVsClass {
    static void test(Object obj) {
        System.out.println(obj.getClass().getSimpleName() + "--- " + obj.getClass());
        System.out.println(" instanceof Derived " + (obj instanceof Derived));
        System.out.println(" instanceof Base " + (obj instanceof Base));
        System.out.println(" Base isInstance " + Base.class.isInstance(obj));
        System.out.println(" Derived isInstance " + Derived.class.isInstance(obj));
        System.out.println(" " + obj.getClass().getSimpleName() + ".getClass() == Base.class " + (obj.getClass() == Base.class));
        System.out.println(" " + obj.getClass().getSimpleName() + ".getClass() == Derived.class " + (obj.getClass() == Derived.class));
        System.out.println(" " + obj.getClass().getSimpleName() +
                "obj.getClass().equals(Base.class)" + obj.getClass().equals(Base.class));
        System.out.println(obj.getClass().equals(Derived.class));
    }

    public static void main(String[] args) {
        test(new Base());
        test(new Derived());
    }
}