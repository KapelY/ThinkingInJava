package com.company.interfaces;

/**
 * @Author Eckel
 * page #304
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i;

        @Override
        public int value() {
            return i += 10;
        }
    }

    protected static class ParcelDestination implements Destination {
        private String dest;

        private ParcelDestination(String whereTo) {
            dest = whereTo;
        }

        @Override
        public String readLabel() {
            return dest;
        }

        static int f = 10;

        public static void f() {
            System.out.println("in f() static = " + f);
        }

        public static class AnotherLevelClass {
            public static void f() {
                System.out.println("in f() static AnotherLevelClass = " + f);
            }
        }

        public static Destination destination(String dest) {
            return new ParcelDestination(dest);
        }

        public static Contents contents() {
            return new ParcelContents();
        }

        public static void main(String[] args) {
            Contents c = contents();
            Destination d = destination("Nowhere ");
            System.out.println(d.readLabel());
            System.out.println(" :: " + f);
            f();
            AnotherLevelClass.f();
        }
    }

    public static void main(String[] args) {
        ParcelDestination.main(args);
        Contents contents = ParcelDestination.contents();
        Destination destination = ParcelDestination.destination("Figure out");
        System.out.println(destination.readLabel());
    }
}
