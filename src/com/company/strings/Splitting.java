package com.company.strings;

import java.util.Arrays;

/**
 * page 430
 */
public class Splitting {
    public static void main(String[] args) {
        final String knights = "Then, when you have found the shrubbery, you must " +
                "cut down the mightiest tree in the forest... " +
                "with... a herring";
        System.out.println(Arrays.toString(knights.split(" ")));
        System.out.println(Arrays.toString(knights.split("\\W")));
        System.out.println(Arrays.toString(knights.split("\\W+")));
    }
}
