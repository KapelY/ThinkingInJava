package com.company.intefrace;

/**
 * @Author Eckel
 * page #298
 */
class Wrapping {
    private int i;

    public Wrapping(int i) {
        this.i = i;
    }
    public int value() {
        return i;
    }
}

public class Parcel8 {
    public Wrapping wrapping( int i ) {
        return new Wrapping(i) {
            @Override
            public int value() {
                return super.value()*42;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 parcel8 = new Parcel8();
        System.out.printf("%d", parcel8.wrapping(2).value());
    }
}
