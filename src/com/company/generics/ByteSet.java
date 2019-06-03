package com.company.generics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * page 562
 */
public class ByteSet {
    Byte[] possibles = {1,2,3,4,5};
    Set<Byte> mySet =
            new HashSet<>(Arrays.asList(possibles));
    Set<Byte> mySet2 = new HashSet<>(Arrays.asList((byte)1,(byte)3,(byte)4));
}
