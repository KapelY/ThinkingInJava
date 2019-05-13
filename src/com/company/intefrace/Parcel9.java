package com.company.intefrace;

/**
 * @Author Eckel
 * page #299
 */

public class Parcel9 {
    public Destination destination(final String destination) {
        return new Destination() {
            private String label = destination;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 parcel9 = new Parcel9();
        Destination destination = parcel9.destination("tanzania");
        System.out.println(destination.readLabel());
    }
}
