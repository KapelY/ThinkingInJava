package com.company.collections;

import com.company.Util.Pet;
import com.company.Util.Pets;

import java.util.*;

public class CrossContainerIteration {
    public static void display(Iterator<Pet> iterator) {
        while (iterator.hasNext()) {
            Pet p = iterator.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(11);
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petsHS = new HashSet<>(pets);
        TreeSet<Pet> petsTS = new TreeSet<>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
