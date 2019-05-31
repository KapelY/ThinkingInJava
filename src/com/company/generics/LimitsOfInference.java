package com.company.generics;

import com.company.Util.Person;
import com.company.Util.Pet;

import java.util.List;
import java.util.Map;

/**
 * page 516
 */
public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {}
    static void f1(Map<Person, List<Pet>> petPeople) {}

    public static void main(String[] args) {
        f(New.map());// shouldn't compile, but it does!!!!
        f1(New.<Person, List<Pet>>map());
    }
}
