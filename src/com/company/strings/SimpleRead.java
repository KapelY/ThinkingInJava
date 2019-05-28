package com.company.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

/**
 * page 447
 */
public class SimpleRead {
    public static BufferedReader in = new BufferedReader(new StringReader("Sir Yury\n22 1.61\nSir Yury\n22 1.61"));

    public static void main(String[] args) throws IOException {
        System.out.println(in.readLine());
        String[] arr = in.readLine().split(" ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        Scanner scanner = new Scanner(in);
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextDouble());
    }
}
