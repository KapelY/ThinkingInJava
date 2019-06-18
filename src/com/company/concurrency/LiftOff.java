package com.company.concurrency;//: concurrency/LiftOff.java
// Demonstration of the Runnable interface.893

public class LiftOff implements Runnable {
    protected int countDown = 10; // Default
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        while (countDown-- > 0) {
            System.out.print(status());
//            Thread.yield();
        }
    }
} ///:~
