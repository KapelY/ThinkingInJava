package com.company.io;//: io/ChangeSystemOut.java
// Turn System.out into a PrintWriter. 756
import java.io.*;

public class ChangeSystemOut {
  public static void main(String[] args) {
    PrintWriter out = new PrintWriter(System.out, true);
    PrintStream out2 = new PrintStream(System.out, true);
    out.println("Hello, world");
    out2.println("Hello, 2");
  }
} /* Output:
Hello, world
*///:~
