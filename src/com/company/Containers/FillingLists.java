package com.company.Containers;//: containers/FillingLists.java
// The Collections.fill() & Collections.nCopies() methods. 638

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddress {
  private String s;
  public StringAddress(String s) { this.s = s; }
  public String toString() {
    return super.toString() + " " + s;
  }
}

public class FillingLists {
  public static void main(String[] args) {
    List<StringAddress> list= new ArrayList<>(Collections
            .nCopies(4, new StringAddress("Hello")));
    System.out.println(list);
    Collections.fill(list, new StringAddress("World!"));
    System.out.println(list);
  }
} /* Output: (Sample)
[StringAddress@82ba41 Hello, StringAddress@82ba41 Hello, StringAddress@82ba41 Hello, StringAddress@82ba41 Hello]
[StringAddress@923e30 World!, StringAddress@923e30 World!, StringAddress@923e30 World!, StringAddress@923e30 World!]
*///:~