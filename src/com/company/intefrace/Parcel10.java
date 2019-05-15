package com.company.intefrace;

/**
 * @Author Eckel
 * page #300
 */
public class Parcel10 {
    public Destination destination(final String dest,final float price) { // "final" should require, bit it's not
        return new Destination() {
            private int cost;
            {
//                price += 1f; not allowed
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println(dest + ", excesses budget ");
                } else System.out.println(dest + ", Tot ok");
            }
            private String label;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 parcel10 = new Parcel10();
        Destination destination1 = parcel10.destination("Nowhere dest1", 2.3f);
        Destination destination2 = parcel10.destination("Nowhere dest2", 112.3f);
    }
}
