package com.company.interfaces;

/**
 * page #320
 */
interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {

        // Local inner class
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("Local Counter");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        }

        return new LocalCounter();
    }

    // anonymous inner class
    Counter getCounter2(final String name) {
        return new Counter() {
            {
                System.out.println("Anonymous Counter");
            }
            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Local - "),
                c2 = lic.getCounter2("Anonymous - ");

        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
}
