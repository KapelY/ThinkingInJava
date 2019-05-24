package com.company.collections;

import com.company.Util.Pet;
import com.company.Util.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * page 355
 */
public class CollectionSequence extends AbstractCollection {
    private static void display(Iterator it) {
        int index = 0;
        while (it.hasNext())
            System.out.print(index++ + ":" +it.next() + " ");
    }
    private Pet[] pets = Pets.createArray(8);
    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Object next() {
                return pets[index++];
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        System.out.println(c);
        display(c.iterator());
    }
}
