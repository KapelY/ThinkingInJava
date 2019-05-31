package com.company.generics;

import com.company.Util.Person;
import com.company.Util.Pet;

import java.util.List;
import java.util.Map;

/**
 * page 514
 */
public class SimplePets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
    }
}
