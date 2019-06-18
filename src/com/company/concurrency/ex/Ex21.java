package com.company.concurrency.ex;

// Exercise 21, page 962


import java.util.concurrent.*;

class A implements Runnable {
    private volatile boolean signal = false;

    public synchronized void run() {
        try {
            while (!signal) {
                System.out.println("A.run() wait()");
                wait();
                signal = true;
                System.out.println("A is done waiting");
            }
        } catch (InterruptedException e) {
            System.out.println("A run() interrupted");
        } finally {
            System.out.println("Leaving A.run()");
        }
    }

    public synchronized void message() {
        System.out.println("Hi from A");
    }
}

class B implements Runnable {
    private final A a;

    public A getA() {
        return a;
    }

    B(A a) {
        this.a = a;
    }

    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
            synchronized (a) { // method calling notifyAll() must own monitor
                System.out.println("B.run() a.notifyAll()");
                a.notifyAll();
            }
        } catch (InterruptedException e) {
            System.out.println("B sleep interrupted");
        }
    }
}

public class Ex21 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        B b = new B(new A());

        exec.execute(b.getA());

        TimeUnit.MILLISECONDS.sleep(100);

        b.getA().message();

        exec.execute(b);
        TimeUnit.MILLISECONDS.sleep(2500);

        exec.shutdownNow();
    }
}