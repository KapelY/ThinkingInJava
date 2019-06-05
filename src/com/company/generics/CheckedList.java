package com.company.generics;

import com.company.Util.Cat;
import com.company.Util.Dog;
import com.company.Util.Pet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * page 574
 */
public class CheckedList {
    static void oldStyleMethod(List probablyDogs) {
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        oldStyleMethod(dogs);
        List<Dog> dogs2 = Collections.checkedList(
                new ArrayList<>(), Dog.class
        );
        try {
            oldStyleMethod(dogs2);
        } catch (Exception e) {
            System.out.println(e);
        }

        List<Pet> pets = Collections.checkedList(
                new ArrayList<>(), Pet.class
        );
        pets.add(new Dog());
        pets.add(new Cat());
    }
}
