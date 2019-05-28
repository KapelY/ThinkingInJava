package com.company.RTTI;

/**
 * page 464
 */
class Building {}
class House extends Building {}
class Flat extends House {}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new Building();
        Class<House> houseClass = House.class;
        House h = houseClass.cast(b); // first way
        h = (House)b; // another way
        Class<Flat> f = Flat.class;
        Class<? extends Flat> hh = houseClass.asSubclass(f);// something strange
    }
}
