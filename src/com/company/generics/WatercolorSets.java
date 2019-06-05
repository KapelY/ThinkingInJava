package com.company.generics;

import java.util.EnumSet;
import java.util.Set;

import static com.company.generics.Sets.*;


/**
 * page 522
 */
public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIANT_RED, Watercolors.VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(union(set1, set2));
        Set<Watercolors> subset = intersection(set1, set2);
        System.out.println(subset);
        System.out.println(difference(set2, subset));
        System.out.println(complement(set1, set2));
    }
}