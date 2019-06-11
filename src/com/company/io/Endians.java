package com.company.io;//: io/Endians.java
// Endian differences and data storage.
import java.nio.*;
import java.util.*;

import static com.company.net.mindview.util.Print.print;

public class Endians {
  public static void main(String[] args) {
    ByteBuffer bb = ByteBuffer.wrap(new byte[12]);
    bb.asCharBuffer().put("abcdef");
    System.out.println(bb.asCharBuffer());

//    bb.asCharBuffer().chars().asLongStream().forEach((x) -> System.out.print((char) x));
    System.out.println();
    print(Arrays.toString(bb.array()));
    bb.rewind();

    bb.order(ByteOrder.BIG_ENDIAN);
    bb.asCharBuffer().put("abcdef");
    System.out.println("bb.asCharBuffer().put(\"abcdef\");");
    print(Arrays.toString(bb.array()));
    System.out.println(bb.asCharBuffer());
    bb.rewind();

    bb.order(ByteOrder.LITTLE_ENDIAN);
    bb.asCharBuffer().put("abcdef");
    print(Arrays.toString( bb.array()));
    System.out.println(bb.asCharBuffer());
  }
} /* Output:
[0, 97, 0, 98, 0, 99, 0, 100, 0, 101, 0, 102]
[0, 97, 0, 98, 0, 99, 0, 100, 0, 101, 0, 102]
[97, 0, 98, 0, 99, 0, 100, 0, 101, 0, 102, 0]
*///:~
