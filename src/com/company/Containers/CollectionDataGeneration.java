package com.company.Containers;//: containers/CollectionDataGeneration.java
// Using the Generators defined in the Arrays chapter. 640

import com.company.net.mindview.util.CollectionData;
import com.company.net.mindview.util.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDataGeneration {
    public static void main(String[] args) {
        System.out.println(new ArrayList<>(CollectionData
                .list(new RandomGenerator.String(9), 10)));
        System.out.println(
                new HashSet<Integer>(new CollectionData<>(
                        new RandomGenerator.Integer(), 10)));
    }
} /* Output:
[YNzbrnyGc, FOWZnTcQr, GseGZMmJM, RoEsuEcUO, neOEdLsmw, HLGEahKcx, rEqUCBbkI, naMesbtWH, kjUrUkZPg, wsqPzDyCy]
[573, 4779, 871, 4367, 6090, 7882, 2017, 8037, 3455, 299]
*///:~
