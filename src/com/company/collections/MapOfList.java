package com.company.collections;

import com.company.Util.Cymric;
import com.company.Util.Mutt;
import com.company.Util.Person;
import com.company.Util.Pet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * page 350
 */
public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople =
            new HashMap<>();
    static {
        petPeople.put(new Person("Dawn"),
                Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cymric("Molly1"), new Mutt("Spot1")));
        petPeople.put(new Person("Marilyn"),
                Arrays.asList(new Cymric("Molly2"), new Mutt("Spot2")));
    }

    public static void main(String[] args) {
        System.out.println("People: " + petPeople.keySet());
        System.out.println("Pets: " + petPeople.values());
        for (Person p : petPeople.keySet()) {
            System.out.println(p + " has:");
            for (Pet pet : petPeople.get(p)) {
                System.out.print(" " + pet);
            }
            System.out.println();
        }
    }
}
