package com.company.collections;

import com.company.Util.Hamster;
import com.company.Util.Pet;
import com.company.Util.Pets;
import com.company.Util.Rat;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets =
                new LinkedList<>(Pets.arrayList(5));
        System.out.println(pets);
        System.out.println("pets.getFirst() " + pets.getFirst());
        System.out.println("pets.element() " + pets.element());
        System.out.println("pets.peek() " + pets.peek());
        System.out.println("pets.remove() " + pets.remove());
        System.out.println("pets.removeFirst() " + pets.removeFirst());
        System.out.println("pets.poll() " + pets.poll());
        System.out.println(pets);
        pets.addFirst(new Rat());
        System.out.println("After addFirst" + pets);
        pets.offer(Pets.randomPet());
        System.out.println("After offer" + pets);
        pets.addLast(new Hamster());
        System.out.println("After addLast" + pets);
        System.out.println("removeLast " + pets.removeLast());
    }
}
