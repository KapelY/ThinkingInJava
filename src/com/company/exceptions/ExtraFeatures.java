package com.company.exceptions;

/**
 * page 374
 */
class MyException2 extends Exception {
    private int x;

    public MyException2() {
    }
    public MyException2(String message) {
        super(message);
    }
    public MyException2(String message, int x) {
        super(message);
        this.x = x;
    }
    public int val() {return x; }
    public String getMessage() {
        return "Detail Message: " + x + " " + super.getMessage();
    }
}
public class ExtraFeatures {
    public static void f() throws MyException2 {
        System.out.println("Invoke MyException2 from f()");
        throw new MyException2();
    }
    public static void g() throws MyException2 {
        System.out.println("From g()");
        throw new MyException2("Made in g()");
    }
    public static void h() throws MyException2 {
        System.out.println("From h()");
        throw new MyException2("Made in h()", 42);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }
        try {
            h();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
            System.out.println("e.val() = " + myException2.val());
        }
    }
}
