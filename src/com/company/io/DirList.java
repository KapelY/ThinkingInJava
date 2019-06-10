package com.company.io;//: io/DirList.java
// Display a directory listing using regular expressions.
// {Args: "D.*\.java"} 725
import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList {
  public static void main(String[] args) {
    File file = new File(".");
    String[] list;
    if(args.length == 0)
      list = file.list();
    else
      list = file.list(new DirFilter(args[0]));
    Arrays.sort(Objects.requireNonNull(list), String.CASE_INSENSITIVE_ORDER);
    for(String dirItem : list)
      System.out.println(dirItem);
  }
}

class DirFilter implements FilenameFilter {
  private Pattern pattern;
  public DirFilter(String regex) {
    pattern = Pattern.compile(regex);
  }
  public boolean accept(File dir, String name) {
    return pattern.matcher(name).matches();
  }
} /* Output:
DirectoryDemo.java
DirList.java
DirList2.java
DirList3.java
*///:~
