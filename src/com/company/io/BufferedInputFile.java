package com.company.io;//: io/BufferedInputFile.java 745
import java.io.*;

public class BufferedInputFile {
  // Throw exceptions to console:
  public static String read(String filename) throws IOException {
    // Reading input by lines:
    BufferedReader in = new BufferedReader(new FileReader(filename));
//    BufferedInputStream in2 = new BufferedInputStream(new FileInputStream(filename));
    String s;
    int s2;
    StringBuilder sb = new StringBuilder();
    while((s = in.readLine())!= null)
      sb.append( s + "\n");
//      sb.append((char) s2);
    in.close();
    return sb.toString();
  }
  public static void main(String[] args)
  throws IOException {
    System.out.print(read("src/com/company/io/BufferedInputFile.java"));
  }
} /* (Execute to see output) *///:~
