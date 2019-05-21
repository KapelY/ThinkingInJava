package com.company.intefrace;

/**
 * @Author Eckel
 * page #306
 */

public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface {
        private static int count;
        @Override
        public void howdy() {
            System.out.println("Hi"+count++);
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }

    static void main(String[] args) { //public is redundant
        Test.main(args);
        new Test().howdy();
    }
}
