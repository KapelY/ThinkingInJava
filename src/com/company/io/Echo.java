package com.company.io;//: io/Echo.java
// How to read from standard input.
// {RunByHand} 755

import java.io.*;

public class Echo {
    public static void main(String[] args)
            throws IOException {
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        PrintStream out = new PrintStream(
                new BufferedOutputStream(
                        new FileOutputStream("test.out")));
        String s;
        System.setOut(out);
        while ((s = stdin.readLine()) != null && s.length() != 0)
            System.out.println(s);
        out.close();
        // An empty line or Ctrl-Z terminates the program
    }
} ///:~
