package com.company.concurrency;

import java.util.concurrent.TimeUnit;

import static com.company.net.mindview.util.Print.print;

class Sleeper2 extends Thread {
    private int duration;

    public Sleeper2(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();

    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " has awakened");
    }
}

public class Joining2 {
    public static void main(String[] args) {
        Sleeper2 sleeper1 = new Sleeper2("first", 1000),
                sleeper2 = new Sleeper2("second", 1000);
        new Thread(() -> {
            try {
                sleeper1.join();
                System.out.println("t1 - joined");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                sleeper2.join();
                System.out.println("t2 - joined");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
