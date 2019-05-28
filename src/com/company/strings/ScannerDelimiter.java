package com.company.strings;

import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * page 448
 */
public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner("23, 22, 23, 42, 53");
        sc.useDelimiter(", ");
        Spliterator<String> sp = Spliterators.spliterator(
                sc, Long.MAX_VALUE, Spliterator.ORDERED | Spliterator.NONNULL );
        StreamSupport.stream(sp, false).forEach(System.out::println);
    }
}
