package com.company.Containers;//: containers/IndividualTest.java 689

import com.company.Util.Individual;
import com.company.Util.Pet;
import com.company.collections.MapOfList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IndividualTest {
    public static void main(String[] args) {
        Set<Individual> pets = new TreeSet<>();
//        for (List<? extends Pet> lp : MapOfList.petPeople.values()) {
//            pets.addAll(lp);
//        }
        MapOfList.petPeople.values().forEach(pets::addAll);// another variant
        System.out.println(pets);
    }
} /* Output:
[Cat Elsie May, Cat Pinkola, Cat Shackleton, Cat Stanford aka Stinky el Negro, Cymric Molly, Dog Margrett, Mutt Spot, Pug Louie aka Louis Snorkelstein Dupree, Rat Fizzy, Rat Freckly, Rat Fuzzy]
*///:~
