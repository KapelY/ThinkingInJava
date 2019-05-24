package com.company.strings;

/**
 * page 431
 */
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("23423".matches("-?\\d+"));
        System.out.println("+1234".matches("-?\\+?\\d+"));
        System.out.println("+2323".matches("(-|\\+)?\\d+"));
    }
}
