package com.company.generics;

/**
 * page 530
 */
class Manipulator<T extends HashF> {
    private T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }

    public void manipulate() { obj.f();}
}

public class Manipulation {
    public static void main(String[] args) {
        HashF hf = new HashF();
        Manipulator<HashF> manipulator =
                new Manipulator<>(hf);
        manipulator.manipulate();
    }
}


