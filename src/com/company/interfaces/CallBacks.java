package com.company.interfaces;

/**
 * @Author Eckel
 * page #310
 */
interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable {
    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println("Callee1  - " + i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Another operation");
    }

    public static void f(MyIncrement mi) {
        mi.increment();
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;

    @Override
    public void increment() {// !!! Eckel's mistake in his book, the access is private...
        super.increment();
        i++;
        System.out.println("Callee2  - " + i);
    }

    private class Closure implements Incrementable {
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackReference;

    public Caller(Incrementable callbackReference) {
        this.callbackReference = callbackReference;
    }

    void go() {
        callbackReference.increment();
    }
}

public class CallBacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller2.go();

        System.out.println("-----------------");
        new Caller(new Callee2().getCallbackReference()).go();
        new Callee2().increment();
        System.out.println("-----------------");

        c2.increment();
        caller2.go();
    }
}
